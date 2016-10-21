package homewrok5;

import java.util.Scanner;


public class ExamForWhileStars {

	public static void main(String[] args) {
		
		System.out.println("******************************************");
		System.out.println("                 반복문 연습하기2                  ");
		System.out.println("******************************************");
		System.out.println("           1.  정사각형 별찍기 ");
		System.out.println("           2.  직각삼각형 별찍기 ");
		System.out.println("           3.  이등변삼각형 별찍기 ");
		System.out.println("           4.  다이아몬드 별찍기 ");
		System.out.println("           5.  종료하기");
		
		new ExamForWhileStars().input();

	}
	
	public void input () {
		
		Scanner su = new Scanner(System.in);
		System.out.print("\n");
		
		while(true) {
			System.out.print("원하는 메뉴는 무엇입니까? >>> ");
			String select = su.nextLine();
 		
				if(!select.matches("^[0-9]*$"))		//숫자가 아닌 다른 것을 입력하였을 때의 정규표현식 사용
				{
					System.out.println("숫자를 입력하셔야 합니다. 다시 입력하십시오.");
					continue;
				}

				int num = Integer.parseInt(select);
				if(num == 1) {
		 			System.out.println("1번 호출");
				    RectagleStars cal1 = new RectagleStars();
				    cal1.question1();
				    break;
		 		}
			
		 		else if(num == 2) {
		 			System.out.println("2번 호출");
		 			TriangleStars cal2 = new TriangleStars();
		 			cal2.question2();
		 			break;
		 		}
			
		 		else if(num == 3) {
		 			System.out.println("3번 호출");
		 			IsoscelesTriangleStars cal3 = new IsoscelesTriangleStars(); 
		 			cal3.question3();
		 			break;
		 		}
			
		 		else if(num == 4) {
		 			System.out.println("4번 호출");
		 			DiamondStars cal4 = new DiamondStars(); 
		 			cal4.question4();
		 			break;
		 		}
			
		 		else if(num == 5) {  
		 			System.out.println("5번 호출-종료");
		 			System.exit(0);
		 		}
				
		 		else
		 			System.out.println("1~5번 사이에 입력하셔야 합니다. 다시 입력하십시오.");
					continue;
							
		}
		su.close(); 
	}

	}


