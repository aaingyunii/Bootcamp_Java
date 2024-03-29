# 메서드(Method)

- 수행 코드를 정의하는 요소
- main() 메서드 : 자바프로그램 수행 시 제일 먼저 호출되는 메서드(자바인터프리터-JVM)
- 객체의 행동 또는 기능을 구현하는 요소
- 함수와 거의 동일, 메서드는 객체에 속한 함수
<br>

## 메서드 생성방법, 사용하는 법(호출)

### 1. 메서드 생성 :

```java
[제어자...] 리턴값타입 메서드명([매개변수선언...]) [throws 예외클래스,...] {
    메서드의 수행코드
        :
}

==> (메서드 헤드) {
        (메서드 바디)
}
```


### 2. 메서드 호출 :

```
    메서드명([argument,...]);
    변수명 = 메서드명([argument,...]);
    System.out.println(메서드명([argument,...]));
    변수명 = 메서드명([argument,...]) + 10;
    if(메서드명([argument,...])){ 
        // -> "해당 메서드의 return타입이 boolean 일 때 가능"
    }
```        
       
### 3. 메서드 오버로딩 : 
- "하나의 클래스 안에 동일한 이름의 메서드를 2개 이상 정의하는 것."
- 그러나, 반드시 매개변수의 사양은 서로 달라야 한다.
- 오버로딩의 개수에는 제한이 없다.
    - Ex) `System.out.println();` -> 10개로 오버로딩 되어 있음.

### 프로그램 argument(명령 행 argument)
