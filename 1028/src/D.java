
public class D {

	public static void main(String[] args) {





//데몬스레드: 게임에서 5초마다 저장하라는 명령내린것
		//for: false 가 아니면 반복해서 수행됨. while() 괄호안에 true적어서 false가 안되게해줌
		while(true) {
			try { //5초대기
				Thread.sleep(5000); //5초대기 (자바는 시간을 1/1000초 단위로 사용)
			}catch(Exception e) {} //5초대기
			System.out.println("무한반복");
		}



			
			


	}

}
