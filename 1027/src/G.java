
public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		int score =120;
		//점수는 0~100
		//90~100:수
		//80~89:우
		//70~79:미
		//60~69:양
		//0~59:가
		//라고 출력하도록 작성
        if(score >=90) {
            System.out.println("수");
        }else if(score>=80) {
        	System.out.println("우");
        }else if(score>=70) {
        	System.out.println("미");
        }else if(score>=60) {
        	System.out.println("양");
        }else {
        	System.out.println("가");
        }

    	//위과같이하면 0~100범위 아닌 아웃라이너(이상치)인데도 결과값이표기됨.
        //아래와같이 할것
        if(score >=90 && score <=100) {
            System.out.println("수");
        }else if(score>=80) {
        	System.out.println("우");
        }else if(score>=70) {
        	System.out.println("미");
        }else if(score>=60) {
        	System.out.println("양");
        }else if(score>=0 && score<60) {
        	System.out.println("가");
        }else {
        	System.out.println("잘못 입력된 점수인것 같습니다.");
        }
        
        
        //바로 위에것 다시해보기
        
        
	}

	}

