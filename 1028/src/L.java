
public class L {

	public static void main(String[] args) {
// 10.랜덤한 정수만들기
    java.util.Random r = new java.util.Random(); //()안에숫자쓰면 게속같은값나옴 이걸'난수표 번호'라함
    //부터 45까지의 숫자를 랜덤하게 6번가져오기
    for(int i=0; i<6; i=i+1) {
    	int x = r.nextInt(45);
    	System.out.println(x+1);
    }
    
    
    

	}

}
