
public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//score가 80이상이면 장학금
		//60이상 80미만이면 보통
		//60미만이면 경로 라고 출력
		int score =89;
		
		//else는 한번만 쓰거나 한번도안써야함. but, else if는 계속써도됨 
		if(score>=80) {
		    System.out.println("장학금");
		}else if(score>=60&& score <80) {
		    System.out.println("보통");
		}else if(score <60) {
			System.out.println("경고");
		}
			//&& and역할
		//결과값이 forse일때까지만 if가 적용됨. => if의 적용범위는 마지막 else가 폴스일때까지 if가 적용됨
		

	
		 
			 
			 
	}

}
