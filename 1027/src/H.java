
public class H {

	public static void main(String[] args) {
	
		
		String id = "haeun";
		String pw = "1234";
		
		//1) id와 pw가 haeun과 1234이면 로그인성공
		//2) id는 haeun이 맞는데 비밀번호가 1234가 아니면 비밀번호틀림
		//3) id가 haeun이 아니면 없는 아이디
        //라고 출력하도록 작성
		//나중에id와 pw는 입력화면에서 읽어오고 데이터를 데이터베이스와 비교하면 실제 로그인을 만들수있습니다.
	if(id == "haeun" && pw =="1234" ) {
		System.out.println("로그인성공");
	}else if(id=="haeun") {
		System.out.println("비밀번호가 틀림");
	}else {
	System.out.println("없는 아이디");
	}
	

//switch 
	//브레이크 빼먹으면 밑에있는거 하나 추가되므로 주의. 예: 0일때, 한식 중식 출력됨
	int menu=0;
	//menu가 0이면 한식
	//1이면 중식
	//2이면 분식
	//3이면 일식
	//나머지는 아무거나
	switch(menu) {
	case 0:
		System.out.println("한식");
		break;
	case 1:
		System.out.println("중식");
		break;
	case 2:
		System.out.println("분식");
		break;
	case 3:
		System.out.println("일식");
		break;
	default:
		System.out.println("아무거나");
		break;
	}
		
	//final을 붙이면 읽기전용이 됨. KOREA 자리에는 변수나 상수만들어갈수있음(final을붙이면 상수가됨)
	//읽기전용 변수이름은 모두 대문자로 작성하는것이 관례
	//이렇게 짜면 느려지지만 위보다 이것을 권장함
	//스위치가 if보다 좋다는건 이러한 final작업까지 해줬을때 얘기임.
	final int KOREA = 0;
	final int CHINA = 1;
	final int SNACK = 2;
	final int JAPAN = 3;

	switch(menu) {
	case KOREA:
		System.out.println("한식");
		break;
	case CHINA:
		System.out.println("중식");
		break;
	case SNACK:
		System.out.println("분식");
		break;
	case JAPAN:
		System.out.println("분식");
		break;	
	}
			
			
		}

}
 