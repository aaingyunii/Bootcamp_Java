## 자바의 예외 처리, `Exception`
```java
try ~ catch ~ finally / throws ==> 예외 처리 관련 예약어
---------------------   ------
	   적극적인			 소극적인
	   
throws -> 예외를 발생
```

### 실행 오류의 종류
- 에러 : JVM 영역에서 발생하는 오류, 심각한 오류, **대처 코드 작성 불가**, 바로 실행 종료
	(try-catch 구문을 통해 해결 불가.)
- 예외 : Java 프로그램 영역에서 발생하는 오류, 가벼운 오류, **대처 작성 -> 원하는 처리 가능**
	1. `RuntimeException` : 예외처리 코드 구현이 **선택** 사항(안했을 때 JVM이 대신 처리)
	1. `not-RuntimeException` : 예외처리 코드 구현 **필수** (안하면 ComplieError)

```java
try{
	~~~
}catch(예외클래스타입 변수){
	~~~
}catch(예외클래스타입 변수){
	~~~
}... // catch 여러 개 정의 가능.
finally{ // 예외 발생 여부 관계없이 마지막에 반드시 실행시키는 구문
	~~~
}

메서드 시그네쳐 throws 예외클래스명1, 2,...{
	~~~
}
```

## 자바 Collection API
1. List : **순서가 있고 중복값을 허용**하는 데이터 모음
	- `ArrayList, LinkedList`
1. Set : **순서가 없고 중복값을 허용하지 않은** 데이터 모음
	- `HashSet`
1. Map : **키-값 쌍** 으로 데이터들의 모음
	- `HashMap`
	
- Collections, Iterator, Arrays(배열)

- Vector, Hash-table

## `java.io`
: 입출력은 외부 자원과 협업하는 과정<br>운영체제에 의존적인 작업<br>'스트림'이라는 논리적인 구조

==><br>단방향 : 출력용, 입력용으로 나눠져 있다.<br>
단위 : 바이트, 문자

- `InputStream`, `OutputStream` : 바이트 단위
- `Reader`, `Writer` : 문자 단위

> **`InputStreamReader`**, **`OutputStreamWriter`**
> <br>: 바이트 단위의 스트림 객체를 문자 단위의 스트림 객체로 변환