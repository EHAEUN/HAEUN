
public class A {

	public static void main(String[] args) {
//복습 
		//Hello World를 3번출력
		int i=0;
		while(i<3) {
			System.out.println("Hello World");
			i=i+1;		
		}

 	    System.out.println("==========================");

 	    //for를 이용해서 동일한 내용 작성
 	    //데이터 분석하는 사람 for많이 사용
 	    for(int j=0; j<3; j=j+1) {
 	    	System.out.println("Hello World");
     	}
		
 	    //image1.png, image2.png, image3.png 를 for를 이용해서 출력
 	    for(int k=0; k<3; k=k+1) {
 	    	System.out.println("image"+(k+1)+".png");
 	    }
	
 	    
 	    //제어문 안에서 만든 변수는 제어문 밖에서 사용불가
 	    //System.out.println(k);
 	   
 	   //세미콜론; 2개까지만 가능 3개이사 ㅇ써야하면 콤마
 	  for(int m=0,k=0; k<3; k=k+1,m=m+1) {
	    	System.out.println("for");
 	  }
	   //()안의 내용을 생략하면 false리사 무한반복되거나 한번도 수행되지 않습니다.
 	  
 	  for(;;)
 		 System.out.println("무한반복");
 	  
 	  
 	  
	}

}
