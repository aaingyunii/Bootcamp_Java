### Eclipse 에서 Java project 생성 후 `우클릭->Configure->Convert to Maven project`
- `pom_xml파일에추가.txt` 해당 파일 내용대로 `pom.xml` 파일에 추가
- 이후 `src` 폴더에 해당 폴더들을 `Copy and Paste`
- 최종적으로, `SpringIoC` 관련 실행할 수 있는 프로젝트 폴더 완성.

## 프레임워크 (Spring)
: 고급 API, 반제품 형태의 프로그램

### 선언적인 프로그래밍 
- XML 문서로 원하는 사양을 설정하여 프로그램에 반영
			에노테이션(@xxx)

### Spring loC(제어의 역행) 
- 필요한 API의 객체 생성 또는 사용자가 정의한 클래스의 객체 생성을
프로그램 안에서 직접 처리하는 것이 아니라 객체 생성을 외부(스프링 프레임워크)에서
진행하여 주입해주는 방식

### Singleton / Prototype 차이