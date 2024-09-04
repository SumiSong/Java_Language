package chap10;


public class EventBbs implements BasicBbsIf {
	int idx;
	int pageSize;
	int pageNo;
	int searchWordCnt;
	String startDate;
	String endDate;
	String luckyDate;
	String title;
	String name;
	String pwd;
	String userId;
	String email;
	String content;

	
	

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getLuckyDate() {
		return luckyDate;
	}

	public void setLuckyDate(String luckyDate) {
		this.luckyDate = luckyDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	@Override
	public void bbsList(int pageSize, int pageNO, String searchCategory, String searchKeyWord) {
 		String[][] list = {
				{"1","홍길동", "제목입니다.", "user1", "1234", "크리스마스 응모", "2024-12-01", "2024-12-24", "2024-12-25"},
				{"2","홍길순", "제목입니다.", "user2", "1234", "새해 응모", "2024-12-01", "2024-12-29", "2025-01-01"},
				{"3","홍길준", "제목입니다.", "user3", "1234", "추석1 응모", "2024-09-01", "2024-09-10", "2024-09-16"},
				{"4","홍길명", "제목입니다.", "user4", "1234", "추석2 응모", "2024-09-02", "2024-09-10", "2024-09-15"},
				{"5","홍길석", "제목입니다.", "user5", "1234", "추석3 응모", "2024-09-03", "2024-09-10", "2024-09-14"},
				{"6","홍길민", "제목입니다.", "user5", "1234", "추석4 응모", "2024-09-04", "2024-09-10", "2024-09-13"},
				{"7","홍순길", "제목입니다.", "user5", "1234", "한글날 응모", "2024-10-01", "2024-10-8", "2024-10-09"},
				{"8","홍순명", "제목입니다.", "user5", "1234", "3월 응모", "2024-03-01", "2024-03-10", "2024-03-16"},
				{"9","홍승준", "제목입니다.", "user5", "1234", "4월 응모", "2024-04-01", "2024-04-10", "2024-04-16"},
				{"10","홍명석", "제목입니다.", "user5", "1234", "5월 응모", "2024-05-01", "2024-05-10", "2024-05-11"},
		};

		
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[i].length; j++) {
				if(list[i][j].contains(searchKeyWord)) {
					searchWordCnt++;
					System.out.print(list[i][j]);
				}
			}
			System.out.println(); 
		}		
		String[][] box = new String [searchWordCnt++][];
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[i].length; j++) {
				if(list[i][j].contains(searchKeyWord)) {
//					box = (String).list[i][j];
					System.out.print(box);
				}
			}
			System.out.println(); 
		}	
	}
	

	@Override
	public void regist(String[] arrInput) {
		System.out.println("공지사항을 등록합니다.");
		for(String item : arrInput) {
			System.out.println("arrInput Item : "+ item);
		}
	}

	@Override
	public void view(int bbsIdx) {
		System.out.println("공지사항을 조회합니다.");
	}

	@Override
	public void delete(int bbsIdx) {
		System.out.println("공지사항을 삭제합니다.");

	}
	
	
	public int getStartPage(int pageNo, int pageSize) {
		int startPage = (pageNo - 1) * pageSize;
		System.out.println(startPage);
		return startPage;
	}
	
	public int getEndPage(int pageNo, int pageSize) {
		int endPage = (pageNo - 1) * pageSize + (pageSize - 1);
		System.out.println(endPage);
		return endPage;
	}
	
	public int getStartBlockPage(int pageNo, int pageSize) {
		int startBlockPage = (pageNo / pageSize) * pageSize + 1;
		System.out.println(startBlockPage);
		return startBlockPage;
	}
	
	public int getEndBlockPage(int pageNo, int pageSize, int total) {
		return 0;
	}

	/*
	 1 -> 0 : 시작값: (1-1) * 10
	 1-> 9 : 종료값 : (1-1)* 10 + 페이징사이즈 - 1
	  
	  //1page
	  10 : (2-1) * 10 + 10  = 20
	  
	  //1page 끝
	  19 : (2-1) * 10 + (페이징사이즈 - 1) = 19
	  
	  
	  20:(3-1) * 10
	  29:(3-1) * 10 + (10 - 1)
	  
	  startPage = (pageNo - 1) * pageSize;
	  endPage = (pageNo - 1) * pageSize + (pageSize - 1);
	  
	  11 : 
	  
	  //페이지블럭시작
	  (1, 10)
	  (11, 20)
	  (21, 30)
	  startPageBlock :
	  endPageBlock : 
	 */

}
