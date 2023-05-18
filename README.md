# BooMovie_Final
영화값 상승으로 영화 선택에 신중해진 관람객들을 위해 실 관람객의 평가를 적극 반영하여 개인의 취향을 상세하게 고려하는 영화 예매 사이트 - Final Project

### 담당 역할 
자주하는 질문 게시판, 공지사항 게시판

### 팀원 수
6명

### 개발 기간
2022년 12월 12일 ~ 2023년 01월 12일

### 개발 환경 
window, Apache Tomcat v8.5, Bootstrap, CSS, Spring Tool Suite 3, oracle DB, HTML5

### 활용 기술 
CSS, HTML, JQuery, JSP, JSTL, Java, JavaScript, myBatis

## DB 설계
![BooM](https://user-images.githubusercontent.com/106478906/234247179-e0944af8-5c35-476e-b02a-c8c40fa82758.png)


## 공지사항 게시판
![image](https://user-images.githubusercontent.com/106478906/233557976-2e8d262f-d2e2-4aed-a8bb-e8282b965a34.png)

- 페이징 처리
  - '>','<' 누를 시 한 페이지 이동하고, '>>','<<' 누를 시 양 끝페이지로 이동
  - 첫 페이지일때 '<' 버튼 사라지고, 마지막 페이지일때 '>' 버튼이 사라지게 구현
- 관리자로 로그인 시 공지사항 관리 페이지로 이동

### 공지사항 관리 페이지
![image](https://user-images.githubusercontent.com/106478906/233557607-0c7a7ca2-e9ca-4291-a298-b73850a624fe.png)

### 공지사항 등록 페이지
![image](https://user-images.githubusercontent.com/106478906/233558542-aa78fa11-869c-4cb3-8e7d-efa391c06b51.png)

- 내용 입력과 동시에 글자수 반영되게 구현
- 파일 첨부 기능
- 이미지 미리보기 기능

### 공지사항 상세 페이지
![image](https://user-images.githubusercontent.com/106478906/233562192-b9813294-dac7-4a9f-bc9c-d2b6d53a8146.png)

> 첨부 파일 다운로드 구현

![image](https://user-images.githubusercontent.com/106478906/233560805-2357bbe0-3992-4fdd-bd92-3e8015f71b36.png)

### 공지사항 수정 페이지
![image](https://user-images.githubusercontent.com/106478906/233561345-f3a96d24-34a9-4a10-a051-c22af6bf5396.png)
![image](https://user-images.githubusercontent.com/106478906/233562442-84c9d20b-b5b6-4e20-8ab2-919343fcee14.png)

---


## 자주하는 질문
![image](https://user-images.githubusercontent.com/106478906/233574273-2a34e1ef-eb6e-4230-9bfe-b57b7bd274df.png)
- 드롭다운 메뉴로 구현
- 관리자로 로그인 시 등록, 수정, 삭제 버튼 보이게 구현

### 자주하는 질문 등록 페이지
![image](https://user-images.githubusercontent.com/106478906/233575257-76599472-5af5-4898-b11b-985b107099aa.png)
![image](https://user-images.githubusercontent.com/106478906/233575928-bbfafbd9-d012-49eb-ba47-0707ce8e303c.png)
- 등록할 때 설정한 카테고리대로 FAQ가 들어가도록 구현

### 자주하는 질문 수정 페이지
![image](https://user-images.githubusercontent.com/106478906/233576438-83c00df4-bb97-461b-b001-3b819325b84a.png)
![image](https://user-images.githubusercontent.com/106478906/233576505-c4f7b0dc-7656-43d5-9b8a-9c6307de256d.png)
- 카테고리 변경 시  바뀐 카테고리로 이동되도록 구현

## 참여 소감
세미 프로젝트에서 저는 메인 페이지와 회원가입 파트를 맡았는데, 파이널 프로젝트에서는 공지사항 게시판과 자주하는 질문 게시판을 맡아서 만들어보면서 세미 프로젝트때보다 한층 더 성장했음을 느꼈습니다.

또한 파이널 프로젝트에서는 세미 프로젝트에서 사용하지 않았던 깃허브를 활용했습니다.
다들 깃허브를 사용한 프로젝트는 처음이었기에 처음엔 오류 해결에 노력을 기울이다가, 같은 파트끼리 먼저 합치고 메인으로 합치는 등의 체계를 정해나갔습니다.
팀원들과 수시로 대화하며 커밋해보고, 각자의 코드를 하나의 코드로 합쳐보는 과정에서 생기는 오류도 함께 해결해가면서 팀원들과 적극적인 소통의 중요성을 몸소 깨달았습니다.

이때의 경험을 양분으로 삼아 많이 배우고 성장하였습니다. 앞으로도 많은 경험을 하고 어제보다 오늘 더 성장하는 개발자가 되겠습니다.








