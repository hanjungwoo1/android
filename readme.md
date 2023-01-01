# 안드로이드 앱 프로그래밍

##  첫째 마당 : Hello! 안드로이드


<details>
<summary>접기/펼치기</summary>

### 01 안드로이드란?

#### 01-1 안드로이드 이해하기

1. 오픈 소스
2. 자바 언어
3. 제공된 컴포넌트로 플랫폼 신경 쓰지 않음
4. 다른 사람 앱 연동
5. 다양한 기능 지원
6. ART 런타임

#### 01-2 안드로이드의 흐름 살펴보기

### 02 개발 도구 설치하기

#### 02-1 안드로이드 스튜디오 설치하기

### 03 첫 번째 앱 만들기

#### 03-1 첫 프로젝트 만들기

#### 03-2 에뮬레이터로 Hello World 앱 실행하기

가상 단말 만들기

에뮬레이터를 사용하여 앱 실행하기

    Shift + F10

#### 03-3 Hello 프로젝트 하나씩 바꾸어보기

MainActivity.java 자세히 살펴보기

    super.onCreate(savedInstanceState); 
    // super -> 상속 받은 부모의
    // oncreate -> 함수 호출
    setContentView(R.layout.activity_main);
    // setContentView -> 화면에 무엇을 보여줄지 설정
    // R.layout.activity_main -> 화면 모양의 정보

버튼 눌렀을 때 메시지가 나타나게 하기

    1. 소스 파일에 이벤트 처리 함수 추가하기
    // MainActivity.java 파일을 열고 onButton1Clicked라는 이름의 함수를 추가합니다.
    2. XML 파일의 버튼을 선택하고 onClick 속성 값으로 선택하기
    // activity_main.xml 파일에 들어 있는 버튼에 onClick 속성 값을 onButtonClicked로 선택합니다.
    // 이때 함수 이름은 소스 코드(MainActivity.java)에 입력했던 함수 이름과 같습니다.


### 04 실제 단말 연결하기

</details>

## 둘째 마당 : 안드로이드 완벽 가이드

### 01 안드로이드 스튜디오와 친숙해지기