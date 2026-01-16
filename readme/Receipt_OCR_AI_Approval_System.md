# AI 지출 결재 추천 시스템

이 문서는 **영수증 OCR 추출**부터 **AI 지출 분석 및 결재 추천**까지의 기술적 메커니즘을 상세히 설명합니다.

---

## 1. 서비스 플로우 (Service Flow)

> **Flowchart**
![지출,결재 플로우차트](https://github.com/user-attachments/assets/ca3b8386-8ba6-41a6-a613-86313096b385)


---

## 2. 핵심 코드 (Core Code)

### 📍 영수증 OCR 추출
#### 📄 ReceiptAiServiceImpl.java
<img width="598" height="451" alt="image" src="https://github.com/user-attachments/assets/661d0390-1d5c-494d-9440-63bff1ac5d63" />

- **Spring RestClient**: Java → Python 마이크로서비스 간 HTTP 통신
- **Multipart Form Data**: 파일 업로드를 위한 HTTP 프로토콜


#### 📄 receipt_service.py
<img width="529" height="457" alt="image" src="https://github.com/user-attachments/assets/e1358c8e-b33b-46c3-9fa2-37a9d4469960" />

- **OpenAI Vision API**: 이미지와 텍스트를 함께 처리하는 멀티모달 API
- **LangChain PydanticOutputParser**: LLM 응답을 구조화된 객체로 파싱
  


### 📍 AI 지출 분석 및 결재 추천
#### 📄 approval_recommendation_service.py
<img width="698" height="644" alt="image" src="https://github.com/user-attachments/assets/694e66f9-2fb4-4fb7-a1a4-d604169cbf44" />

- **LangChain ChatOpenAI**: GPT-4 모델 호출
- **프롬프트 엔지니어링**: 구조화된 프롬프트로 정확도 향상
- **컨텍스트 주입**: 회사 규정 문서를 프롬프트에 포함

