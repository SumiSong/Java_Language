package chap2;

public class ExDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dNum = 1D;
		for(int i=0; i < 100; i++) {
			dNum = dNum + 0.1;
			// dNum += 0.1;
		}
		System.out.println("Double Num : " + dNum);
		
	} 
}
 

// 다른 타입끼리 연산 (경계점 고민, 타입 확인)   
/*
 byte + int = int
 short + long = long
 int + float = float
 */

 