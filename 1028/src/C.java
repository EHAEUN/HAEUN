
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



//3.기타제어문

		//3의 배수가되면 더이상 내용을 수행하지않고 다음반복으로 이동
		//3의배수가되면 아래문장을 수행하지 않기때문에 출력이되지않음
		///컨티뉴는 처음으로올라가는것.(이번에는빼고하자할때사용=이번엔넘어갑시다)

		for(int i=1; i<11; i=i+1) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}

		//3의배수가되면 반복문을 종료
		///브레이크는 밖으로나가버리는것(그만하고싶을때)
		for(int j=1; j<11; j=j+1) {
			if(j % 3 == 0) {
				break;
			}
			System.out.println(j);
		}


//4.제어문에서 알아야할 부분		
		//제어문안의 실행문장이 1개일경우 {} 생략가능 <=비추천
		for(int i=1; i<11; i=i+1) 
			System.out.println(i);

		//c와 자바에서는 들여쓰기나 줄바꿈 영향 안받음. 파이썬은 받음			
		//자동들여쓰기:블록 잡아서 윈도우:컨트롤+i ,맥:커맨드+i(컨트롤=커맨드. 알트=옵션) but괄호 안맞으면 자동들여쓰기 안먹힘
		//컨트롤+a:전체 블록잡기
		for(int i=1; i<11; i=i+1) 
			System.out.println(i);

		//괄호 갯수 맞춰야함

        //제어문뒤에 ;붙으면 제어문 안쓴거과 같음 (do~ while 예외)
		for(int i=1; i<11; i=i+1); {
			System.out.println("(제어문의()뒤에;붙어서 없는것과 동일");
			System.out.println("한번만수행");
		}
		
		// dead code
				for(;;) {}
				system.out.println("dead code ")

				
				
				
	}

}
