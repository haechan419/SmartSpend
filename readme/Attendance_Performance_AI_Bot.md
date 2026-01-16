# AI 근태 관리 및 실적 분석 시스템

이 문서는 **LLM 기반 자연어 의도 분석**부터 **동적 데이터 쿼리 생성 및 데이터 시각화 파이프라인**까지의 기술적 메커니즘을 상세히 설명합니다.

---

## 1. 서비스 플로우 (Service Flow)

> **Flowchart**
<img width="3362" height="1227" alt="출결, 실적 비교 AI 플로우차트" src="https://github.com/user-attachments/assets/b805e439-c186-4985-a042-81e60f88d6f2" />


---

## 2. 핵심 코드 (Core Code)
<img width="589" height="412" alt="image" src="https://github.com/user-attachments/assets/6ea73c91-ff7a-4523-b53d-ef578076ad01" /> <br>
Ollama AI 모델에게 사용자의 자연어 입력을 보내면,부서, 사원명, 기간, 의도를 JSON 형식으로 추출해서 반환합니다.<br>

<img width="624" height="214" alt="image" src="https://github.com/user-attachments/assets/25657bdf-f147-4c23-b2be-c317b43d191e" /> <br>
Python에서 Spring Boot API를 호출해서 데이터베이스에 있는 출결 데이터를 가져옵니다.



