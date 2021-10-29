
public class K {

	public static void main(String[] args) {
		

        //웹크롤링
		https://search.hani.co.kr/Search?command=query&keyword=%EB%85%B8%ED%83%9C%EC%9A%B0&media=news&submedia=&sort=d&period=all&datefrom=1988.01.01&dateto=2021.10.27&pageseq=0
		https://search.hani.co.kr/Search?command=query&keyword=%EB%85%B8%ED%83%9C%EC%9A%B0&media=news&submedia=&sort=d&period=all&datefrom=1988.01.01&dateto=2021.10.27&pageseq=1
		https://search.hani.co.kr/Search?command=query&keyword=%EB%85%B8%ED%83%9C%EC%9A%B0&media=news&submedia=&sort=d&period=all&datefrom=1988.01.01&dateto=2021.10.27&pageseq=2
			
		//%EB%85%B8%ED%83%9C%EC%9A%B0 부분이 검색문
		//페이지가바뀔때 뒤에 0,1,2만 바뀌는걸 알수있음
		
//do~while
		//while: 확인하고함 (한번도안할수도 있음)
		//do ~while : 뒤에거는 하고확인해라(무조건한번은한다)
        
		//hani1.jpg, hani2.jpg, hani3.jpg 를 반복문을 이용해서 출력
		//2,1,0순으로 출력하도록 수정하기
		int j = 1;
		do {
		  System.out.println("hani"+ (3-j) + ".jpg");
		  j = j + 1;
		}while(j<4);
		
		//응용해보기 
        //1) 5,3,1순으로 출력하도록 수정
		//2) 1,16,31 순으로 출력하기	
		//크롤링시, 동아일보 기사 페이지주소가 이런식으로 되있음
		
		 
	}

}
