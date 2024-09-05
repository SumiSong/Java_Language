package chap10;

import java.util.Arrays;

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
	
	String[][] list = {
			{ "1", "홍길동", "제목입니다.", "user1", "1234", "크리스마스 응모", "2024-12-01", "2024-12-24", "2024-12-25" },
			{ "2", "홍길순", "제목입니다.", "user2", "1234", "새해 응모", "2024-12-01", "2024-12-29", "2025-01-01" },
			{ "3", "홍길준", "제목입니다.", "user3", "1234", "추석1 응모", "2024-09-01", "2024-09-10", "2024-09-16" },
			{ "4", "홍길명", "제목입니다.", "user4", "1234", "추석2 응모", "2024-09-02", "2024-09-10", "2024-09-15" },
			{ "5", "홍길석", "제목입니다.", "user5", "1234", "추석3 응모", "2024-09-03", "2024-09-10", "2024-09-14" },
			{ "6", "홍길민", "제목입니다.", "user6", "1234", "추석4 응모", "2024-09-04", "2024-09-10", "2024-09-13" },
			{ "7", "홍순길", "제목입니다.", "user7", "1234", "한글날 응모", "2024-10-01", "2024-10-8", "2024-10-09" },
			{ "8", "홍순명", "제목입니다.", "user8", "1234", "3월 응모", "2024-03-01", "2024-03-10", "2024-03-16" },
			{ "9", "홍승준", "제목입니다.", "user9", "1234", "4월 응모", "2024-04-01", "2024-04-10", "2024-04-16" },
			{ "10", "홍명석", "제목입니다.", "user10", "1234", "5월 응모", "2024-05-01", "2024-05-10", "2024-05-11" },
			{ "11", "홍영준", "제목입니다.", "user11", "1234", "추석5 응모", "2024-09-05", "2024-09-10", "2024-09-17" },
			{ "12", "홍영수", "제목입니다.", "user12", "1234", "추석6 응모", "2024-09-04", "2024-09-10", "2024-09-17" },
			{ "13", "홍정수", "제목입니다.", "user13", "1234", "추석7 응모", "2024-09-04", "2024-09-10", "2024-09-17" }, };

	int startPage = 0;
	int endPage = 0;
	int startBlockPage = 0;
	int endBlockPage = 0;

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

	public int getSearchWordCnt() {
		return searchWordCnt;
	}

	public void setSearchWordCnt(int searchWordCnt) {
		this.searchWordCnt = searchWordCnt;
	}

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	//
	public int getStartPage(int pageNo, int pageSize) {
		startPage = (pageNo - 1) * pageSize;
		// System.out.println(startPage);
		return startPage;
	}

	public int getEndPage(int pageNo, int pageSize) {
		endPage = (pageNo - 1) * pageSize + (pageSize - 1);
		// System.out.println(endPage);
		return endPage;
	}

	public void result(String[][] box, int pageNo, int pageSize) {
		int total = box.length;
		// System.out.println("total" + total);
		int totalPages = 0;

		if (total % pageSize == 0) { // 사이즈만큼 나눴을 때
			totalPages = total / pageSize;
		} else {
			totalPages = total / pageSize + 1;
		}
//	    System.out.println("total" + total);
//	    System.out.println("totalPages" + totalPages);

		int startPage = getStartPage(pageNo, pageSize);
		int endPage = getEndPage(pageNo, pageSize);


		// 결과 출력
		System.out.println("페이징 결과 : 페이지 " + pageNo);
		for (int i = startPage; i <= endPage; i++) {
			System.out.println(String.format("%-20s", Arrays.toString(box[i])));
		}

		System.out.println("=======================================================================================");
		System.out.print("[이전]");
		for (int i = 1; i < totalPages; i++) {
			System.out.print("[" + i + "]");
		}
		System.out.println("[마지막]");
		System.out.println("");
	}

	@Override
	public void bbsList(int pageSize, int pageNo, String searchCategory, String searchKeyWord) {
		int searchWordCnt = 0;
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][5].contains(searchKeyWord) && searchCategory.equals("제목")) {
					searchWordCnt++;
					break;
				}
			}
		}
		
		String[][] box = new String[searchWordCnt++][];
		int boxIndex = 0;

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][5].contains(searchKeyWord) && searchCategory.equals("제목")) {
					box[boxIndex++] = list[i];
					// System.out.println(Arrays.toString(list[i]));
					break;
				}
			}
		}
		
		if(box.length > 0) {
			result(box, pageNo, pageSize);
		}
		else {
			System.out.println("찾는 내용이 없습니다");
		}
	}

	@Override
	public void regist(String[] arrInput) {
		String[][] list1 = new String[list.length + 1][];
		int list1Idx = 0;
		for (int i = 0; i < list.length; i++) {
			list1[list1Idx++] = list[i];
		}
		list1[list1Idx] = arrInput;
		
		for (int k = 0; k < list1.length; k++) {
			for (int j = 0; j < list1[k].length; j++) {
				System.out.print(String.format("%-20s", list1[k][j]));
			}
			System.out.println();
		}
		System.out.println("게시글이 등록되었습니다.");
		System.out.println("================================================================================");
	}

	@Override
	public void view(int bbsIdx) {
		System.out.println("==========게시글을 조회합니다.==========");
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				System.out.print(String.format("%-8s", list[i][j]));
			}
			System.out.println();
		}
		
		System.out.println("================================================================================");
	}

	@Override
	public void delete(int bbsIdx) {
		String[][] list1 = new String[list.length - 1][];
		int list1Idx = 0;
		for (int i = 0; i < list.length; i++) {
			if (i + 1 == bbsIdx) {
				continue;
			}

			list1[list1Idx++] = list[i];
		}
		
		for (int k = 0; k < list1.length; k++) {
			for (int j = 0; j < list1[k].length; j++) {
				System.out.print(String.format("%-20s", list1[k][j]));
			}
			System.out.println();
		}

		System.out.println(bbsIdx + "번째 게시글이 삭제되었습니다.");
		System.out.println("========================================");

	}

	public void modify(int bbsIdx, String title, String content, String startDate, String endDate, String luckyDate) {
		list[bbsIdx-1][2] = title;
		list[bbsIdx-1][5] = content;
		list[bbsIdx-1][6] = startDate;
		list[bbsIdx-1][7] = endDate;
		list[bbsIdx-1][8] = luckyDate;

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				 System.out.print(String.format("%-20s", list[i][j]));
				//System.out.print( list[i][j] + "\t\t");
			}
			System.out.println();
		}
		System.out.println(bbsIdx + "번째 게시글이 수정되었습니다.");
	}

}