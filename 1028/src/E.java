
public class E {

	public static void main(String[] args) {
//교번처리=토글(ex:전등껐다켰다하는것[2개짜리] / 그림 번갈아가며 보여줌{여러개}: 광고 일정시간마다 바뀌는것, 애니메이션)
		
		//3초마다 2가지 동작 번갈아가며 10번하기
		for(int i=0; i<10; i=i+1) {
			try { 
				Thread.sleep(3000); 
			}catch(Exception e) {} 
			
			if(i % 2 == 0) {   //0이면 
			  System.out.println("on");
		  }else {
			  System.out.println("off");
		  }
		}	
		
		//게임 버전
		for(int i=0; i<10; i=i+1) {
			try { 
				Thread.sleep(1000); 
			}catch(Exception e) {} 
			
			if(i % 3 == 0) {   //0이면 
			  System.out.println("오미크론");
		  }else if(i % 3 == 1) {
			  System.out.println("라투");
		  }else {
			  System.out.println("다크스펙터");
		  }
		}	
			
		
        //라투의갯수 줄어들게하기(랜덤몹 만들기)
		for(int i=0; i<10; i=i+1) {
			try { 
				Thread.sleep(1000); 
			}catch(Exception e) {} 
			
			
			if(i % 5 == 0) {   
			  System.out.println("오미크론");
		  }else if(i % 5 == 1) {
			  System.out.println("라투");
		  }else if(i % 5 == 2) {
			  System.out.println("다크스펙터");
		  }else if(i % 5 == 3) {
			  System.out.println("오미크론");
		  }else if(i % 5 == 4) {
			  System.out.println("다크스펙터");
		  }
		}	

		
		
		
		
		
		
	}

}
