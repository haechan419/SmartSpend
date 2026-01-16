# 사용자 편의 및 보안 인증 시스템

이 문서는 **클라이언트 사이드 얼굴 인식 인증**부터 **Redux 기반 실시간 데이터 집계 대시보드 시각화**까지의 기술적 메커니즘을 상세히 설명합니다.

---

## 1. 서비스 플로우 (Service Flow)

> **Flowchart**
<img width="3952" height="1568" alt="제목 없음 (12)" src="https://github.com/user-attachments/assets/5fa8642a-0f7b-4327-9010-43a8634bee24" />


---

## 2. 핵심 코드 (Core Code)
### 얼굴인식
<img width="665" height="497" alt="image" src="https://github.com/user-attachments/assets/acd43fbe-9ff7-4fc3-b0a7-c305d4bbd0a1" />


- 기존 Security 로직을 재사용하여 사용자 정보 로드(비밀번호 검증 생략)
- JWT 토큰 생성을 위한 Claims 추출
- TokenDTO Builder 패턴 적용(데이터 구조화), Map반환 방식을 DTO로 개선하여 타입 안정성 확보


