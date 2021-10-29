
public class G {

	public static void main(String[] args) {
		//Prime(소수): 1과 자기자신만으로 나누어 떨어지는수
		//소수 판별하는방법: 2부터 자신의 절반이 되는 숫자까지 나누어서  한번도나누어 떨어지지않으면 소수
		
		int su =2;
		//su가 소수인지 확인하기
		//su를 i로 나누었을때 나누어떨어지는지(나머지가 0)확인
		
		boolean flag = true; //확인작업
		
		for(int i=2; i<su / 2+1; i=i+1) {
			if(su%1==0) {
		flag=false; //확인작업
				break;
			}	
		}
		//확인작업(아래네줄)
		if(flag==true) { 
			System.out.println("소수");
		}else {
			System.out.println("소수아님");
		}
		
		
	
		
	}

}
