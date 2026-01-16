# 🏢 SmartSpend (AI 기반 RPA 사내 협업 시스템)

> **단순 정보 제공이 아닌, AI가 실제 업무를 자동 처리하는 차세대 협업 플랫폼**

## 1. 📅 프로젝트 개요

- **프로젝트명**: SmartSpend
- **개발 기간**: 2025.12.15 ~ 2026.01.15 (약 5주)
- **프로젝트 소개**:
  `SmartSpend`는 기업 내 반복되는 업무(경비 처리, 출결, 결재 등)로 인한 생산성 저하를 해결하기 위해 기획되었습니다. 기존 ERP의 수동 작업 한계를 넘어, **AI 챗봇과 RPA(Robotic Process Automation)** 기술을 도입하여 자연어 명령만으로 업무를 자동 처리하고, OCR 및 얼굴 인식을 통해 사용자 편의성을 극대화한 사내 협업 시스템입니다.

## 2. 👥 팀원 소개 (Team 1)

| <a href="http://github.com/haechan419"><img src="https://github.com/haechan419.png" width="100px" alt="한해찬"/><br /><sub><b>한해찬 (팀장)</b></sub></a> | <a href="https://github.com/shanekang1"><img src="https://github.com/shanekang1.png" width="100px" alt="강진수"/><br /><sub><b>강진수</b></sub></a> | <a href="https://github.com/Moonjooyeon"><img src="https://github.com/Moonjooyeon.png" width="100px" alt="문주연"/><br /><sub><b>문주연</b></sub></a> | <a href="https://github.com/parucho-1358"><img src="https://github.com/parucho-1358.png" width="100px" alt="성건우"/><br /><sub><b>성건우</b></sub></a> | <a href="https://github.com/ujyj0414-dotcom"><img src="https://github.com/ujyj0414-dotcom.png" width="100px" alt="전유진"/><br /><sub><b>전유진</b></sub></a> |
| :---: | :---: | :---: | :---: | :---: |


<br>

### 📝 역할 분담 (R&R)

* **한해찬 (팀장)**
    * 프로젝트 총괄 및 통합, 코드 리팩토링
    * AI를 이용한 Todo 자동화(CRUD) 구현
    * 메인 화면 반응형 웹 구현 및 파일 업로드 처리

* **강진수**
    * 전체 Layout 구현 및 알림 기능 개발
    * 비품 페이지 및 승인/신청 기능 구현(CRUD) , 장바구니 기능(CRUD)
    * face-api.js를 활용한 얼굴 인식 로그인 구현

* **문주연**
    * 업무 보드 및 WebSocket 기반 실시간 채팅(개인/그룹) 구현
    * 채팅 내 파일 업로드/다운로드 및 채팅 AI 챗봇 연동
    * 전체 DB 설계 및 프로젝트 일정 관리

* **성건우**
    * Spring Security + JWT 기반 로그인/인증 구현 (Redux 로그인 상태 관리)
    * 사원 관리 페이지(CRUD) 및 마이페이지(프로필 이미지 업로드), 근태(출결) 관리 기능
    * 출결, 실적 관련 AI 챗봇 구현, 회의록 및 진행 일지 작성

* **전유진**
    * OpenAI GPT-4o-mini Vision API를 사용한 영수증 OCR 기능 
    * GPT-4o-mini기반 AI 지출 승인 추천 시스템
    * 지출 내역 관리 시스템 (CRUD, 페이징, 다중 조건 필터링, Redux Toolkit 상태 관리)
    * 유스케이스 다이어그램, ERD 다이어그램 제작 및 통합

      
## 3. 🛠️ 기술 스택 (Tech Stack)

### **Back-End** &nbsp; <img src="https://img.shields.io/badge/-ED8B00?style=flat-square&logo=openjdk&logoColor=white"> <img src="https://img.shields.io/badge/-6DB33F?style=flat-square&logo=springboot&logoColor=white"> <img src="https://img.shields.io/badge/-3776AB?style=flat-square&logo=python&logoColor=white"> <img src="https://img.shields.io/badge/-009688?style=flat-square&logo=fastapi&logoColor=white">
- **Language**: Java, Python
- **Framework**: Spring Boot, FastAPI
- **Security**: Spring Security, JWT
- **Data/Network**: Spring Data JPA, Spring WebSocket (STOMP/SockJS), Spring Data Redis
- **Library**: Apache POI, OpenPDF, Thumbnailator, ModelMapper, Jackson Databind, Gson, OkHttp

### **Front-End** &nbsp; <img src="https://img.shields.io/badge/-F7DF1E?style=flat-square&logo=javascript&logoColor=black"> <img src="https://img.shields.io/badge/-20232A?style=flat-square&logo=react&logoColor=61DAFB"> <img src="https://img.shields.io/badge/-339933?style=flat-square&logo=nodedotjs&logoColor=white"> <img src="https://img.shields.io/badge/-764ABC?style=flat-square&logo=redux&logoColor=white">
- **Language**: CSS3, JavaScript
- **Framework/Library**: React, Redux Toolkit, Node.js
- **Network**: Axios, WebSocket (STOMP/SockJS)
- **UI/UX**: Chart.js, React Calendar, face-api.js

### **Data & AI** &nbsp; <img src="https://img.shields.io/badge/-003545?style=flat-square&logo=mariadb&logoColor=white"> <img src="https://img.shields.io/badge/-DC382D?style=flat-square&logo=redis&logoColor=white"> <img src="https://img.shields.io/badge/-000000?style=flat-square&logo=ollama&logoColor=white">
- **DataBase**: MariaDB, Redis
- **AI/LLM**: OpenAI API, LangChain, Ollama
- **Data Analysis**: Pandas, NumPy, Matplotlib, OpenCV, PyMySQL

### **Tools** &nbsp; <img src="https://img.shields.io/badge/-F05032?style=flat-square&logo=git&logoColor=white"> <img src="https://img.shields.io/badge/-181717?style=flat-square&logo=github&logoColor=white"> <img src="https://img.shields.io/badge/-F24E1E?style=flat-square&logo=figma&logoColor=white">
- **IDE**: IntelliJ, Cursor, VSCode, WebStorm
- **Collaboration**: Git, GitHub, Figma, Postman, Swagger
- **Database Tools**: MySQL Workbench


## 4. 🗂️ ERD (Entity Relationship Diagram)

> 프로젝트 데이터베이스 설계도입니다.
> <img width="3046" height="2493" alt="ERD 수정" src="https://github.com/user-attachments/assets/e818ab4c-4de2-41a6-b108-4179375ca636" />

## 5. 🏗️ 프로젝트 구조 (Use Case Diagram)

> 사용자와 관리자의 주요 행동 흐름을 정의한 유스케이스 다이어그램입니다.
> ![유스케이스_수정](https://github.com/user-attachments/assets/bfee7085-4ac6-4bdd-9930-bb668ff3fe03)



## 6. 🏛️ 시스템 아키텍처 (System Architecture)
> **AI 기반 업무 처리 및 실시간 통신 흐름**
<img width="1622" height="1606" alt="KakaoTalk_20260115_164419086" src="https://github.com/user-attachments/assets/458bf00a-98a8-4869-8cf9-f91ef1f98207" />



## 7. 📺 반응형 페이지 구성
> 웹 브라우저의 크기에 따라 웹-태블릿-모바일 화면으로 구성하였습니다.
![Animation4](https://github.com/user-attachments/assets/a5cbd648-2c70-4e72-8998-1c02ecd6f622)





## 8. ✨ 핵심 구현 기능 (Key Features)

---

### 1️⃣ AI 회의록 분석 및 Todo 자동 생성
> **회의록에서 실무 액션 아이템까지의 자동화 워크플로우**

- **자연어 처리 기반 회의록 파싱**: 텍스트 파일을 드래그나 파일 선택 이후 업로드 시 AI가 내용을 분석하여 할 일, 마감일, 중요도를 자동으로 추출합니다.
- **캘린더 통합 시스템**: 생성된 과제는 Todo캘린더, 통계 카드, 할 일 목록에 자동 등록되며, 마감일 알림 및 우선순위 관리 기능과 실시간 연동됩니다.

![회의록분석](https://github.com/user-attachments/assets/46dbfdfb-570e-49fa-a0da-fd7615be1220)

> [!NOTE]
> 본 기능의 상세 아키텍처와 코드는 [회의록 분석 시스템 상세 문서](./readme/Meeting_Record_AI_Analysis.md)에서 확인하실 수 있습니다.

---

### 2️⃣ 스마트 지출 결재 시스템
> **Vision API와 AI 판단 엔진을 결합한 경비 관리 자동화**

#### 📍 영수증 OCR 및 경비 처리
- **Vision API 이미지 분석**: 영수증을 base64로 인코딩하여 GPT-4o-mini에 전송, 텍스트를 정밀 추출합니다.
- **구조화된 데이터 추출**: LangChain 기반 `PydanticOutputParser`를 통해 가맹점명, 금액, 날짜, 카테고리 등을 JSON으로 규격화합니다.
- **통합 워크플로우**: Spring Boot와 Python AI 서버 간 협업을 통해 OCR 결과를 `ReceiptAiExtraction` 엔티티로 자동 연동합니다.
![영수증OCR_수정](https://github.com/user-attachments/assets/f0fbd51c-df5a-4752-afac-bd964208d651)

#### 📍 AI 지출 결재 추천 시스템
- **종합 분석 판단 엔진**: 내역 정보와 OCR 결과를 대조하여 정보 일치성 및 비정상 지출 패턴을 평가합니다.
- **3단계 추천 결과 제공**: 신뢰도 점수에 따라 `APPROVE`, `REJECT_CLEAR`, `REJECT_SUSPECTED` 결과를 상세 사유와 함께 출력합니다.
- **규정 기반 검증 파이프라인**: 사내 지출 규정을 Context로 활용해 업무 관련성 및 위험 요소를 자동으로 감지합니다.
![AI 결재 추천_수정_최종](https://github.com/user-attachments/assets/09f8b180-7672-405a-a6e1-a151a3bcec69)

> [!NOTE]
> 본 기능의 상세 아키텍처와 코드는 [지출 결재 시스템 상세 문서](./readme/Receipt_OCR_AI_Approval_System.md)에서 확인하실 수 있습니다.

---

### 3️⃣ 실시간 채팅 및 지능형 RPA 검색

#### 📍 실시간 메시징 시스템
- **WebSocket(STOMP) 프로토콜**: Spring WebSocket과 SockJS를 활용하여 개인 및 부서별 그룹 채팅을 지원하는 양방향 실시간 통신을 구현했습니다.
![KakaoTalk_20260115_160034789_01](https://github.com/user-attachments/assets/f60b367a-6cb9-409b-8936-732469b4713f)


#### 📍 AI 전역 검색 (Semantic Search)
- **의미론적 검색 엔진**: 대화 맥락을 벡터화하여 저장하며, 자연어 질문에 대해 단순 키워드가 아닌 '의미' 기반 매칭 결과를 제공합니다.
- **컨텍스트 인식 파일 검색**: 채팅 내 공유된 PDF, 이미지 등의 메타데이터를 분석하여 파일 내용에 기반한 지능형 검색을 지원합니다.
![AI 전역 검색]![KakaoTalk_20260115_160034789](https://github.com/user-attachments/assets/90b52006-ffa1-4dd9-82f4-35f83fdd3e77)

> [!NOTE]
> 본 기능의 상세 아키텍처와 코드는 [실시간 채팅 및 RPA 검색 시스템 상세 문서](./readme/Realtime_Chat_Semantic_Search.md)에서 확인하실 수 있습니다.

---

### 4️⃣ AI 근태 관리 및 실적 분석 챗봇
> **자연어 쿼리를 통한 데이터 조회 및 시각화 자동화**

- **의도 분석 및 엔티티 추출**: Ollama 기반 로컬 LLM을 통해 자연어 질문에서 부서, 직원, 기간 등 핵심 파라미터를 자동 추출합니다.
- **동적 데이터 변환**: 추출된 파라미터로 API를 호출하고, Pandas를 활용해 구조화된 엑셀 파일을 자동 생성합니다.
![Animation](https://github.com/user-attachments/assets/de27d250-3bd6-43ba-9507-e5d8d5f09af7)

- **시각화 파이프라인**: 부서별 실적 데이터를 조회하여 Matplotlib 차트를 생성하고, LLM이 데이터 기반 인사이트 보고서를 자동 작성합니다.
![Animation1](https://github.com/user-attachments/assets/265c4ada-0a21-4465-9e9f-0272a5c24b77)

> [!NOTE]
> 본 기능의 상세 아키텍처와 코드는 [AI 근태 및 실적 분석 시스템 상세 문서](./readme/Attendance_Performance_AI_Bot.md)에서 확인하실 수 있습니다.

---

### 5️⃣ 기타 사용자 편의 기능

- **얼굴 인식 인증**: `face-api.js`를 활용하여 브라우저 내 실시간 얼굴 검출을 수행하며, 특징 벡터만 처리하여 프라이버시 보안을 강화했습니다.
- **실시간 데이터 대시보드**: Redux Toolkit을 통해 개인별 업무 현황 및 결재 대기 건수 등 주요 지표를 실시간 시각화합니다.
![대시보드](https://github.com/user-attachments/assets/cc38aa93-ac8f-43fc-baec-feee94fc2362)

> [!NOTE]
> 본 기능의 상세 아키텍처와 코드는 [사용자 편의 기능 상세 문서](./readme/Facial_Auth_Realtime_Dashboard.md)에서 확인하실 수 있습니다.

---

