package chap10;

public class Sample {

	public static void main(String[] args) {
		//부모클래스 변수 = new 부모클래스();
		//부모클래스 변수 = new 자식클래스();
//		Human std = new Student();
//		Human job = new Job();
		
//		std.eat();
//		std.sleep();
//		//std.goToSchool(); //자료형이 부모 클래스 타입이기 때문
//		
//		
//		job.eat();
//		job.sleep();
//		//job.goToCompany();

		NoticeImpl bbs = new NoticeImpl();
		bbs.setIdx(1);
		bbs.setName("홍길동");
		bbs.setEmail("aaa@email.com");
		bbs.setTitle("제목입니다.");
		bbs.setUserId("user1");
		bbs.setPwd("1234");
		bbs.setContent("글 내용입니다");
		bbs.setDisplayDate("2024-10-01");
		bbs.setRegDate("2024-09-04");
		
		String[] bbsContent = {
				String.valueOf(bbs.getIdx()),
				bbs.getName(),
				bbs.getEmail(),
				bbs.getTitle(),
				bbs.getUserId(),
				bbs.getPwd(),
				bbs.getContent(),
				bbs.getDisplayDate(),
				bbs.getRegDate()
		};
		
		// 등록
//		bbs.regist(bbsContent);
//		
//		//리스트 출력
//		System.out.println("=====================");
//		System.out.println("리스트를 출력합니다");
//		bbs.bbsList(8, 1, null, null);
//		System.out.println("=====================");
//				
//		
//		//내용을 출력
//		System.out.println("내용을 출력합니다");
//		bbs.view(1);
//		System.out.println("=====================");
//		
//
//		// 글 삭제
//		bbs.delete(1);
//		System.out.println("삭제되었습니다");
//		System.out.println("=====================");
		
		
		
		//이벤트 게시판을 추가하여 작성하세요
		// - 목록, 상세 : 이벤트 시작일, 종료일, 응모날짜
		// 목록 : 제목, 내용을
		// searchCategory : 제목 또는 내용을 searchWord를 검색하여 검색 내용이 있는 글만 출력하는 로직 추가
		
		
		// 아래에 페이징 목록을 출력하는 코드 추가
		// 첫 페이지 이전 10개 12345~~~ 다음 10개 마지막 페이지
		
		EventBbs eBbs = new EventBbs();
		eBbs.setIdx(1);
		eBbs.setName("홍길동");
		eBbs.setEmail("aaa@email.com");
		eBbs.setTitle("제목입니다.");
		eBbs.setUserId("user1");
		eBbs.setPwd("1234");
		eBbs.setContent("크리스마스 응모");
		eBbs.setEndDate("2024-12-24");
		eBbs.setLuckyDate("2024-12-25");
		eBbs.setStartDate("2024-12-01");
		eBbs.setTitle("12월25일 응모");
		
		
		String[] bbsEvent = {
				String.valueOf(eBbs.getIdx()),
				eBbs.getName(),
				eBbs.getEmail(),
				eBbs.getTitle(),
				eBbs.getUserId(),
				eBbs.getPwd(),
				eBbs.getContent(),
				eBbs.getEndDate(),
				eBbs.getLuckyDate(),
				eBbs.getStartDate(),
				eBbs.getTitle()
		};
		
		// 등록
		eBbs.regist(bbsEvent);
		System.out.println("==================================");
		
		//검색
		System.out.println("찾는 키워드 : 추석" );
		eBbs.bbsList(2, 1, "", "추석");
		
		eBbs.getStartPage(1, 10);
		eBbs.getEndPage(1, 10);
		eBbs.getStartBlockPage(1, 10);
		
		eBbs.getStartPage(2, 10);
		eBbs.getEndPage(2, 10);
		eBbs.getStartBlockPage(2, 10);
		
		eBbs.getStartPage(3, 10);
		eBbs.getEndPage(3, 10);
		eBbs.getStartBlockPage(12, 10);
		
		
		
		
	
		
		
	
		
	}
	

}
