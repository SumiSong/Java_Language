package chap10;

public class NoticeImpl implements BasicBbsIf {
	int idx;
	int pageSize;
	int pageNo;
	String searchCategory;
	String searchKeyWord;
	String name;
	String pwd;
	String userId;
	String email;
	String title;
	String content;
	String regDate;
	String displayDate;
	
	
	
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

	public String getSearchCategory() {
		return searchCategory;
	}

	public void setSearchCategory(String searchCategory) {
		this.searchCategory = searchCategory;
	}

	public String getSearchKeyWord() {
		return searchKeyWord;
	}

	public void setSearchKeyWord(String searchKeyWord) {
		this.searchKeyWord = searchKeyWord;
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

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getDisplayDate() {
		return displayDate;
	}

	public void setDisplayDate(String displayDate) {
		this.displayDate = displayDate;
	}
	
	

	@Override
	public void bbsList(int pageSize, int pageNO, String searchCategory, String searchKeyWord) {
		String [][] list = {
				{"1","홍길동", "제목입니다.", "user1", "1234", "글 내용입니다1", "2024-10-07", "2024-09-04"}, 
				{"2","홍길순", "제목입니다.", "user2", "1234", "글 내용입니다2", "2024-10-06", "2024-09-03"},
				{"3","홍길현", "제목입니다.", "user3", "1234", "글 내용입니다3", "2024-08-24", "2024-09-02"},
				{"4","홍길정", "제목입니다.", "user4", "1234", "글 내용입니다4", "2024-09-01", "2024-09-01"},
				{"5","홍길석", "제목입니다.", "user5", "1234", "글 내용입니다5", "2024-10-04", "2024-08-04"},
				{"6","홍길진", "제목입니다.", "user6", "1234", "글 내용입니다6", "2024-10-03", "2024-07-04"},
				{"7","홍길민", "제목입니다.", "user7", "1234", "글 내용입니다7", "2024-10-02", "2024-06-04"},
				{"8","홍길성", "제목입니다.", "user8", "1234", "글 내용입니다8", "2024-10-01", "2024-05-04"},
		};
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[i].length; j++) {
				System.out.print(list[i][j]);
			}
			System.out.println();
		}
		
		
		//System.out.println("pageSize : " + pageSize + ", pageNo : " + pageNo + "searchCategory : " + searchCategory + "searchKeyWord" + searchKeyWord);
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
		System.out.println("게시글 조회 bbsIdx : "+ bbsIdx);
		String [][] list = {
				{"1","홍길동", "제목입니다.", "user1", "1234", "글 내용입니다1", "2024-10-07", "2024-09-04"}, 
				{"2","홍길순", "제목입니다.", "user2", "1234", "글 내용입니다2", "2024-10-06", "2024-09-03"},
				{"3","홍길현", "제목입니다.", "user3", "1234", "글 내용입니다3", "2024-08-24", "2024-09-02"},
				{"4","홍길정", "제목입니다.", "user4", "1234", "글 내용입니다4", "2024-09-01", "2024-09-01"},
				{"5","홍길석", "제목입니다.", "user5", "1234", "글 내용입니다5", "2024-10-04", "2024-08-04"},
				{"6","홍길진", "제목입니다.", "user6", "1234", "글 내용입니다6", "2024-10-03", "2024-07-04"},
				{"7","홍길민", "제목입니다.", "user7", "1234", "글 내용입니다7", "2024-10-02", "2024-06-04"},
				{"8","홍길성", "제목입니다.", "user8", "1234", "글 내용입니다8", "2024-10-01", "2024-05-04"},
		};
		for(int i=1; i<list.length; i++) {
			for(int j=0; j<list[i].length; j++) {
				if(i == bbsIdx) {
					System.out.print(list[i][j]);
				}
			}
			System.out.println();
		}

	}

	@Override
	public void delete(int bbsIdx) {
		System.out.println("게시글 삭제 bbsIdx : "+ bbsIdx);

	}

}
