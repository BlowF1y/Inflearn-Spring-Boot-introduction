# Inflearn-Spring Boot introduction
# 인프런 김영한강사의 스프링 강의를 정리한 내용


## IoC컨테이너, DI컨테이너
- appconfig 처럼 객체를 생성하고 관리하면서 의존관계를 연결해주는것
- 의존관계에 초점을 두어 요즘엔 DI컨테이너 라고 많이함

## 의존관계 주입(DI)
- 정적인 클래스 의존 관계와, 실행 시점에 결정되는 동적인 객체(인스턴스) 의존 관계 둘을
  분리해서 생각해야 한다.
- 정적인 클래스 의존관계 : import 코드만 보고 쉽게 파악 가능, 실행하지않고 분석가능
- 동적인 객체 인스턴스 의존관계 : 객체인스턴스를 생성하고 그참조값을 연결
- 의존관계주입을 사용하면 정적인클래스(클라이언트 코드)를 바꾸지않고 인스턴스를 바꿀수 있다.
- 
## 제어의 역전 Ioc(Inversion of Control)
- 프로그램의 제어 흐름을 직접 제어하는 것이 아니라 **외부에서 관리**하는 것을 제어의 역전(IoC)이라
    한다.
- ex)OrderSevice가 제어하는것이 아닌 Appconfig가 컨트롤함
--------
# 단축키 정리
- ctrl + shift + Enter : 코드 끝맻음 자동완성
- alt + insert : getter setter 자동완성
- Ctrl + Alt + V : 변수 추출하기 
- Shift + Ctrl + Alt + T : 사용 가능한 리팩토링 옵션 표시
- 
## Test
- @BeforeEach : 각 테스트 실행 전에 호출된다. 테스트가 서로 영향이 없도록 항상 새로운 객체를 생성하고, 의존관계도 새로 맺어준다.
- @AfterEach 를 사용하면 각 테스트가 종료될 때 마다 이 기능을 실행한다. 여기서는 메모리 DB에 저장된 데이터를 삭제한다.
## API
- @ResponseBody 를 사용하면 뷰 리졸버( viewResolver )를 사용하지 않음
- 대신에 HTTP의 BODY에 문자 내용을 직접 반환(HTML BODY TAG를 말하는 것이 아님
- Json 타입으로 변환된다

## 스프링 부트 라이브러리
- spring-boot-starter-web<br> 
    - spring-boot-starter-tomcat: 톰캣 (웹서버)<br>
    - spring-webmvc: 스프링 웹 MVC
- spring-boot-starter-thymeleaf: 타임리프 템플릿 엔진(View)
- spring-boot-starter(공통): 스프링 부트 + 스프링 코어 + 로깅
    - spring-boot
        - spring-core
    - spring-boot-starter-logging
        - logback, slf4j
    
## 테스트 라이브러리
- spring-boot-starter-test
    - junit: 테스트 프레임워크
    - mockito: 목 라이브러리
    - assertj: 테스트 코드를 좀 더 편하게 작성하게 도와주는 라이브러리
    - spring-test: 스프링 통합 테스트 지원
    
## View 환경설정
- 스프링 부트가 제공하는 Welcome Page 기능
    - static/index.html 을 올려두면 Welcome page 기능을 제공한다.
    
## thymeleaf 템플릿 엔진
- thymeleaf 템플릿 엔진
- thymeleaf 공식 사이트: https://www.thymeleaf.org/
- 스프링 공식 튜토리얼: https://spring.io/guides/gs/serving-web-content/
- 스프링부트 메뉴얼: https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/
html/spring-boot-features.html#boot-features-spring-mvc-template-engines
  
## 빌드 및 실행
- 콘솔로 이동
1. ./gradlew build
2. cd build/libs
3. java -jar hello-spring-0.0.1-SNAPSHOT.jar
4. 실행 확인
### 윈도우 사용자 팁
- 콘솔로 이동 명령 프롬프트(cmd)로 이동
- ./gradlew gradlew.bat 를 실행하면 됩니다.
- 명령 프롬프트에서 gradlew.bat 를 실행하려면 gradlew 하고 엔터를 치면 됩니다.
- gradlew build
- 폴더 목록 확인 ls dir
- 윈도우에서 Git bash 터미널 사용하기
    - 링크: https://www.inflearn.com/questions/53961
    

 
