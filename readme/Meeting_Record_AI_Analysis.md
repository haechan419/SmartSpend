# AI 회의록 분석 및 Todo 자동 생성 시스템

이 문서는 **자연어 처리 기반 회의록 파싱**부터 **구조화된 Todo 엔티티 변환 및 캘린더 통합 워크플로우**까지의 기술적 메커니즘을 상세히 설명합니다.

---

## 1. 서비스 플로우 (Service Flow)

> **Flowchart**
<img width="5892" height="2437" alt="todo 플로우" src="https://github.com/user-attachments/assets/86d27b3a-e065-423d-b66c-c4d32b541a6c" />


---

## 2. 핵심 코드 (Core Code)
<img width="837" height="108" alt="image" src="https://github.com/user-attachments/assets/219ad719-7db6-4757-9edb-664e0cb44c43" /><br>
upload()파일을 서버의 meeting_notes 폴더에 저장합니다. <br>
파일 경로와 메타데이터로 MeetingNote 도메인을 생성합니다.<br>
DB에 저장하고 저장된 도메인을 반환합니다.<br>



<img width="773" height="110" alt="image" src="https://github.com/user-attachments/assets/e81d6f39-f8bf-464d-bc6d-113b74418799" /><br>
analyzeAndCreateTodos()회의록 파일 내용을 AI 서비스에 전달해 분석합니다.<br>
분석 결과로 TodoDTO리스트를 받아 각각 Todo도메인을 생성합니다.<br>
생성된 Todo를 DB에 저장하고 생성된 갯수를 반환합니다. <br>



<img width="559" height="212" alt="image" src="https://github.com/user-attachments/assets/6a962f9e-e09f-4604-8637-8fe27ef035e4" /><br>
createAsyncThunk() (reduxjs/toolkit) Todo 목록을 API에서 가져옵니다. <br>
Redux의 createAsyncThunk로 비동기 처리합니다. 성공 시 Redux 상태에 저장됩니다.
