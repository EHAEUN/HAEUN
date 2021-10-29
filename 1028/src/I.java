
public class I {

	public static void main(String[] args) {

        // i            j
        // 0 *****      01234
        // 1 ****       0123
        // 2 ***        012
        // 3 **         01
        // 4 *          0
        
        for(int i=0; i<5; i=i+1) {
     	   for(int j=0; j<5; j=j+1) {
			System.out.print("*");
		   }
		   System.out.println("");
        }
                   

        // i            j     
        // 0 *          0
        // 1 **         01
        // 2 ***        012
        // 3 ****       0123
        // 4 *****      01234
        
        for(int i=0; i<5; i=i+1) {
      	   for(int j=0; j<9-2*i; j=j+1) {
 			System.out.print("*");
 		   }
 		   System.out.println("");
         }
        
       
        // i               j
        // 0 *********      
        // 1 *******       
        // 2 *****        
        // 3 ***         
        // 4 *          
        
        for(int i=0; i<5; i=i+1) {
     	   for(int j=0; j<9-2*i; j=j+1) {
			System.out.print("*");
		   }
		   System.out.println("");
        }
        
//증가하다가 감소하는 패턴 
        //예:공장자동화에 많이사용.좀쌓이면 좀쉬고 내보내기만함
        //문제를 쪼개서 해결=에자일 방법론(할줄알면 우대해주는곳 많음)
        
        
        // i               j
        // 0 *      
        // 1 **       
        // 2 ***        
        // 3 **         
        // 4 *
        
        for(int i=0; i<5; i=i+1) {
      	   if(i<3) {
      		 for(int j=0; j<i+1; j=j+1) {//늘어나는것
      			  System.out.print("*");
      		 }
      	   }else{
      		 for(int j=0; j<5-i; j=j+1) {//줄어드는것
      			System.out.print("*");
      		 }
      	   }
 		   System.out.println("");
         }
         
        //공백만들기
        for(int i=0; i<i+1; i=i+1) {
       	   if(i<3) {
       		 for(int j=0; j<i+1; j=j+1) {//늘어나는것
       			  System.out.print("*");
       		 }
       	   }else{
       		 for(int j=0; j<i-2; j=j+1) {//줄어드는것
       			System.out.print("*");
       		 }
       	   }
  		   System.out.println("");
          }
        
        
        
        
	}

}
