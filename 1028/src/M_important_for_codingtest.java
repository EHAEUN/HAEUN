
public class M_important_for_codingtest {

	public static void main(String[] args) {
	
//Array(배열) 까지가 코딩테스트에 매우중요한 내용들. 
//Array(배열)
		//배열사용이유: 1) 시용을편리하게하기위함 2) 여러개이름 하나로쓰기위함
		
		//3개의 점수를 저장
		int score1=90;
		int score2=99;
		int score3=87;
		
		//3개를 출력하기 
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);
		
		//묶어서 하나의 이름으로 저장 -배열
		//배열을 사용하면 scores라는 이름 1개만 필요
		//배열은 반복문을 이용해서 모든 데이터에 접근할수 있기때문에 처리하는 문장이 간결해집니다. 
		int []scores = {90,99,87};
		//방법1
		for(int i=0; i<scores.length; i=i+1) {
			System.out.println(scores[i]);
		}
		//방법2
		for(int score : scores) {
			System.out.println(score);
		}
		
		//토큰번호: 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
		//레파지토리: https://github.com/EHAEUN/JAVA.git
		
		
		
		
	}

}
