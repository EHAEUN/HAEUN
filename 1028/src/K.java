
public class K {

	public static void main(String[] args) {
		
		
// 키보드로부터 입력받을수 있는 인스턴스 생성
java.util.Scanner sc =
new java.util.Scanner(System.in);

//문자열 입력받기
System.out.print("이름을입력하세요");
String name= sc.nextLine();
System.out.println("이름:"+ name);

//점수 입력받기
System.out.print("점수입력하세요");
int score= sc.nextInt();
System.out.println("점수:"+ score);

//닉네임 입력받기
//숫자입력을 받고 문자열을 입력받을때는  nextLine을 추가 =>버퍼에 남아있응 내용 지워줌
System.out.print("별명을입력하세요");
sc.nextLine();
String nick= sc.nextLine();
System.out.println("별명:"+nick);

sc.close();




	}

}

