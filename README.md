# Spring Framework 구현체

간단한 Spring Framework의 핵심 기능들을 직접 구현한 프로젝트입니다.

## 📋 프로젝트 개요

이 프로젝트는 Spring Framework의 핵심 기능들을 이해하고 학습하기 위해 처음부터 구현한 간단한 DI(Dependency Injection) 컨테이너와 컴포넌트 스캐닝 시스템입니다.

## 🛠 기술 스택

- **언어**: Java
- 리플렉션, 어노테이션 API 활용
## ⭐ 주요 기능

### 1. 의존성 주입 (Dependency Injection)
- 생성자 기반 의존성 주입 지원
- `@Autowired` 어노테이션을 통한 자동 의존성 주입
- 2단계 빈 생성 과정 (기본 생성자 → 의존성 있는 생성자)

### 2. 컴포넌트 스캐닝 (Component Scanning)
- 패키지 기반 클래스 자동 스캔
- `@Component`, `@Controller`, `@Service` 어노테이션 지원
- 메타 어노테이션 재귀적 처리

### 3. 커스텀 어노테이션 시스템
- `@Component`: 기본 컴포넌트 마킹
- `@Controller`: 컨트롤러 레이어 컴포넌트
- `@Service`: 서비스 레이어 컴포넌트
- `@Autowired`: 생성자 의존성 주입

## 🏗 아키텍처

```
src/main/java/org/example/
├── SimpleDIContainer.java      # DI 컨테이너 핵심 구현
├── ComponentScanner.java       # 컴포넌트 스캐닝 기능
├── FrameworkApplication.java   # 애플리케이션 진입점
├── annotation/
│   └── CustomAnnotation.java   # 커스텀 어노테이션 정의
└── controller/
    ├── ControllerB.java        # 기본 컴포넌트 예제
    ├── ControllerC.java        # 서비스 컴포넌트 예제  
    └── ControllerD.java        # 의존성 주입 예제
```

## 🚀 동작 방식

1. **컴포넌트 스캔**: `ComponentScanner`가 지정된 패키지에서 어노테이션이 있는 클래스들을 찾습니다
2. **빈 생성 1단계**: 기본 생성자만 있는 클래스들의 인스턴스를 먼저 생성합니다
3. **빈 생성 2단계**: `@Autowired` 생성자가 있는 클래스들의 의존성을 주입하여 인스턴스를 생성합니다
4. **빈 조회**: `getBean()` 메소드로 생성된 빈 인스턴스를 조회할 수 있습니다

## 💻 실행 방법

```bash
# 프로젝트 빌드
./gradlew build

# 애플리케이션 실행
./gradlew run

# 또는 메인 클래스 직접 실행
java -cp build/classes/java/main org.example.FrameworkApplication
```

## 📖 학습 자료

프로젝트 상세 구현 과정: [Di 컨테이너 정리 글] 

## 🔗 참고 링크
- [Di 컨테이너 정리 글](https://velog.io/@rlamw2000/%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC%EB%A5%BC-%ED%95%99%EB%B6%80%EC%83%9D%EB%8F%84-%EB%A7%8C%EB%93%A0%EB%8B%A4%EA%B3%A0)

