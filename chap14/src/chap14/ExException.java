package chap14;
public class ExException {
	public static void main(String[] args) {
		int score = -5; 
        try {
            // 1~100 범위에 벗어난 경우 예외 발생
            if (score < 0) {
                throw new MinusException("음수");
            } else if (score > 100) {
                throw new OverException("100을 초과: " + score);
            }
        } catch (MinusException | OverException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
	}
}

//////1~100 까지만 유효 / 이외의 점수는 예외를 발생시키는 사용자 정의 예외 클래스 작성
//////음수 처리 : MinusException 
//////100 초과 처리 : OverException
