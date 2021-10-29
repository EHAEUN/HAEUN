
public class I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//while
		//데이터가 풜스면 바깥으로 나감. 트루면 수행
        //Hello Java를 3번출력
		//속도는 아래것보다 이게더 빠름 but유지보수 어려움
		//유지보수할 필요가 없으면 이게 더 좋음
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		
		
		//반복문을 이용한 Hello Java를 3번출력
		//i를 조작하고 확인해야하기때문에 위에것보다 속도느림 but 유지보수용이해서 이걸보통 많이사용
		
		System.out.println("=========="); // <-그냥 구분용도로 써놓은것 =무시
		int i=0;
		while(i<3) { //3보다 작을때까지 시행
			System.out.println("Hello Java");
		i = i+1; //i++;로 작성해도됨
		}
		
		
	}

}
