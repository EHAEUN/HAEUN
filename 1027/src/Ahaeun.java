
public class Ahaeun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//<1>
		//20 과  저장하는 변수를 생성
		int data1 = 20; // 00000000 00000000 00000000 00010100
		int data2 = 17; // 00000000 00000000 00000000 00010001
		 
		 System.out.println("data1 & data2:" + (data1 & data2));
		 //00000000 00000000 00000000 00010000 = 16
		 System.out.println("data1 & data2:" + (data1 | data2));
		 //00000000 00000000 00000000 00010101 = 21
		 System.out.println("data1 & data2:" + (data1 ^ data2));
		 //00000000 00000000 00000000 00000101 = 5
		 
//<2.삼항연산자>
		 //실수를 저장하는 변수 2개 생성
		 double d1 = 20.7;
		 double d2 = 19.3;
		 
		 ////트루면 d1, 폴스면 d2남음
		 //d1>d2 이면 d1이 남고 d1>d2가 아니면 d2가남음
		 double max = d1 > d2 ? d1 : d2;
		 System.out.println("큰 수:" + max);
		 
//<3.할당연산자>		 
		int x = 30;
		x -=20; // x= x-20
		System.out.println("x:" + x); //x는 얼마?
		 

// 연습문제
		//문제1) 113507초가 몇시간 몇분 몇초인지 계산
		int time = 113507;
		//답
		int hour = time/3600; //'정수/정수=정수'
		int minute = (time - hour*3600) /60; //시간이 가져간것은 제외하고 분으로나눔
		//다른방법: int minute = (time % 3600) / 60;
		int second = time - (hour*3600) - (minute*60); //시간과 분이 가져간것을 제외
		//다른방법: int second =time % 60;
		System.out.println(hour + "시간" + minute + "분" + second + "초");
		//답: 31시간 31분 47초
				
		//문제2) x데이터와y데이터 교환하기<= "swap"이라함(힌트: 콜라가 가득든 컵과 사이다가 가득든 컵이있을때, 2개의 컵의 내용물을 어떻게 바꿀수있는지)
		x = 30; //int x = 30; 은 위에서 이미 만들었으므로,이렇게만 표기
		int y = 70;		
	 
		 int temp =x; //x=콜라,y=사이다, 콜라를빈컵에복사
		 x = y;//콜라컵에 사이다땀
		 y = temp; //콜라컵에 사이다딴거 옮겨땀
		
		 System.out.println("x:" + x);
		 System.out.println("y:" + y);
		 

		 
		 
	}

}
