
public class J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //image1, image2, image3를 순서대로 출력
		System.out.println("image1");
		System.out.println("image2");
		System.out.println("image3");
		
		System.out.println("=========="); // <-그냥 구분용도로 써놓은것 =무시
		int i=1; //i=숫자에서 숫자는 시작하는 숫자
		while(i<4) { //3보다 작을때까지 시행
			System.out.println("image" + i);
		i = i+1; //i++;와 동일. ++는 자바만 가능, +1은 아무데서나 가능 
		}
		
		
        //image1, image3, image5, image7을 반복문을 이용해서 출력
		i=1; //i앞에써줫으므로 int뺌
		while(i<5) { 
			System.out.println("image" + ((i-1)*2+1));
		i = i+1;  
	    }
		
		
	    //image4, image3, image2, image1을 반복문을 이용해서 출력
		//방법1
		i=4; //i앞에써줫으므로 int뺌
		while(i>0) { 
			System.out.println("image" + i);
		i = i-1; 
        }
			
		//방법2
		i=1; //i앞에써줫으므로 int뺌
		while(i>5) { 
			System.out.println("image" + (5-i));
		i = i+1; 
        }

}
}