package chap7.java7.chunjae;

//import java.util.ArrayList;

public class ArraySample {

	public static void main(String[] args) {
//		ArrayList<BooksInfo> bookList = new ArrayList<BooksInfo>();
//		bookList.add(new BooksInfo("젊은 베르테르의 슬픔", "괴테"));
//		bookList.add(new BooksInfo("개미", "베르나르 베르베르"));
//		bookList.add(new BooksInfo("어린왕자", "생텍쥐페리"));
//		
//		for(int i=0; i<bookList.size(); i++) {
//			BooksInfo bi = bookList.get(i);
//			bi.showBookInfo();
//		}
		
		EventBbs [] arrEventList = new EventBbs[5];
		arrEventList[0] = new EventBbs(1, "user1", "1234", "010-1234-56578", "user1@naver.com", "서울시 강남구 논현동 1번길", "10호");
		arrEventList[1] = new EventBbs(2, "user2", "1234", "010-1234-56578", "user2@naver.com", "인천 남구 현동 2번길", "11호");
		arrEventList[2] = new EventBbs(3, "user3", "1234", "010-1234-56578", "user3@naver.com", "대전시 유성구 논형동 3번길", "12호");
		arrEventList[3] = new EventBbs(4, "user4", "1234", "010-1234-56578", "user4@naver.com", "부산시 사하구 ", "13호");
		arrEventList[4] = new EventBbs(5, "user5", "1234", "010-1234-56578", "user5@naver.com", "서울시 영등포구", "14호");
		System.out.print("글번호\t");
		System.out.print("작성자\t");
		System.out.print("비밀번호\t");
		System.out.print("연락처\t\t\t");
		System.out.print("이메일\t\t\t\t");
		System.out.println("주소");
		System.out.println("==================================================================================================");
		
		for(EventBbs bbs : arrEventList) {
			System.out.print(bbs.getBbsNo() + "\t");
			System.out.print(bbs.getUserName() + "\t");
			System.out.print(bbs.getPwd() + "\t");
			System.out.print(bbs.getPhoneNo() + "\t");
			System.out.print(bbs.getEmail() + "\t");
			System.out.print(bbs.getBbsNo() + "\t");
			System.out.print(bbs.getAddr1()  + bbs.getAddr2());
			System.out.println(bbs.getBbsNo() + "\t");
		}
		
		EventBbs [] arrEventList2 = new EventBbs[10];
		System.arraycopy(arrEventList, 0, arrEventList2, 0, 5); // 복사할 배열, 복사할 첫 위치, 대상 배열, 붙여 넣을 첫 위치, 복사할 요소 개수
		EventBbs [] arrEventList3 = new EventBbs[10];
		arrEventList3 = arrEventList; //주소값을 복사 받으면 얕은 복사

		System.out.println("1. 이전페이지");
		System.out.println("2. 다음페이지");
		System.out.println("3. 글등록 :");
	} 

}





