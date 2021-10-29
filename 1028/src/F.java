
public class F {

	public static void main(String[] args) {
		
		
		
//!:not 의 이용
		// 2가지 상태를 번갈아 가면서 10번 수행하기
		boolean flag= true;
		for(int i=0; i<10; i=i+1) {
			if(flag==true) {
				System.out.println("깃발들어");
			}else{
				System.out.println("깃발내려");
			}
			flag=!flag; //true 와 false를 번갈아가면서 수행			
		}
		
		
		
//중단조건이 있는경우 반복문을 끝까지 수행했는지 확인하는방법
		//반복문에 사용한 인덱스변수(i)를 이용 <= 인덱수변수가 마지막까지 작업을수행햇는지 확인
		//ex:유투브 중간까지본것 저장, 토렌트 다운받을때 중간에멈췄다 다시받으면 이어받기가능
		int j;
		for(j=0; j<5; j=j+1) {
			if(j%4==1) { //4로나눈 나머지가 1
				break;
			}
			System.out.println("반복문이 마지막까지 했는지확인");
		}
		System.out.println(j);
		
		//확인단계
		if(j==5) { //j가 5라면
			System.out.println("반복문을 끝까지 수행");
		}else{
			System.out.println("반복문이 중간에 종료되었습니다");
		}
		
		//변수를 생성해서 초기값을 부여한다음에 확인하고자하는 상태가있다면 그때변수값을변경
		//ex:끝낸일 :선긋기, 메모지떼기	
		//들어갓냐안들어갓냐를 트루냐 폴스냐로확인
		
		boolean f = true;
		for(j=0; j<5; j=j+1) {
			if(j%4==1) { 
				f=false; //내가바둑을 두면 난 눌러둘거야
				break;
		    }
			System.out.println("반복문이 마지막까지 했는지확인");
		}
		if(f==true) {
			System.out.println("중간에 반복문을 멈추지않았음");
		}else {
			System.out.println("~~반복문을 중단했습니다");
		}
		// 1은 될수잇는경우니, 종료되었다함
		//10은 될수업는경우니, 끝까지햇다고함

		
		
		
		
	}

}
