# Web application 수행 폴더
: 자바에서 웹을 실행에 사용된 폴더 입니다.

### Tomcat 9.0버전 사용

### Dynamic Web project 생성 후 `src/main` 에 해당 폴더, 파일 `Copy & Paste`

> 웹 관련 여러 가지의 코드들을 볼 수 있습니다.

<br>

## 자바스크립트 🚀

 - 웹 퍼블리셔 (HTML, CSS) - **프론트엔드 (JavaScript)** - 백엔드 (Java)
 - 인터프리터 언어로서 브라우저에 내장된 자바스크립트 엔진에 의해 해석되고 수행된다.
 - HTML 문서 안에 작성하는 언어이다.
 - `LiveScript` => `JavaScript`

 - ECMA ---> 자바스크립트 언어를 발전&표준화 : ECMAScript

### 구문

- 데이터타입, 변수선언
- 연산자
- 제어문
- 배열
- 함수 정의와 호출 방법
- 객체 생성 및 활용

### window
1. `window.alert("경고 메시지");`
2. `window.setInterval(함수, 밀리 초);`
3. `window.prompt("입력받을 내용관련 메시지");` : 간단하게 입력받을 때만 사용, 보통의 입력은 `DOM` 을 통해 구현됨.
4. `window.confirm("양자택일을 유도하는 메시지");`
5. `window.open(URL);`

### 배열 []

- [v1, v2, v3, ...]
- [] : 빈 배열
- [10, 'abc', true, 3.4] : 서로 다른 데이터타입의 배열 생성 가능, 제한없음.
<br>

- `new Array(a)` : (a개의 크기를 가진) 빈 배열 생성, 숫자 하나만 넣고 선언했을 때만, 이를 배열의 크기로 받아들여서 생성
- `new Array('a')` : 문자열 'a' 를 가진 배열 생성
- `new Array(10,20)` : 숫자 10,20 을 가진 배열 생성


### BOM (Browser Object Model)
- 브라우저에서 수행되는 자바스크립트의 기능을 지원하기 위해 브라우저가 제공
    - `window`, `document`, `navigator`, `screen`, `history`, `location`
    - `location.href` = 'URL문자열'
    - `location.reload()`
