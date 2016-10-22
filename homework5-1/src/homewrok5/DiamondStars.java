package homewrok5;

import java.util.*;

public class DiamondStars {

	public void question4() {
		
		System.out.println("===========================================");
		Scanner su = new Scanner(System.in);
		
		String value = null; 
		
		while(true) {
			
			System.out.print("다이아몬드의 크기입력 : ");	
			value = su.nextLine();
			
			if(!value.matches("^[0-9]*$"))		//숫자가 아닌 다른 것을 입력하였을 때의 정규표현식 사용
			{
				System.out.println("자연수를 입력하셔야 합니다. 다시 입력하십시오.");
				continue;
			}
			
			int num = Integer.parseInt(value);			
			
			if(num == 0 || num == 1)
			{
				System.out.println(num + "으로는 다이아몬드를 만들 수 없습니다. 다시 입력하십시오.");
				continue;
			}
			
			for(int i=1; i<=num; i++)			//num의 값을 입력받은 만큼 줄바꿈을 반복적으로 찍어냄.(삼각형 높이 값)
			{
				for(int j=num; j>i; j--)		//num의 값에서 시작하여 왼쪽 공백 영역을 출력 [하나씩 감소]
				{
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++)			//높이를 나타내는 수만큼 삼각형 왼쪽 영역에 *를 출력 [하나씩 증가]
				{
					System.out.print("*");
				}
				for(int j=1; j<i; j++)			//높이를 나타내는 수보다 하나 적은 삼각형 오른쪽 영역에 *를 출력 [하나씩 증가]
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int i=1; i<=num-1; i++)			//num-1의 값을 입력받은 만큼 줄바꿈을 반복적으로 찍어냄.(역삼각형 높이 값)
			{
				for(int j=1; j<=i; j++)		//num의 값에서 시작하여 왼쪽 공백 영역을 출력 [하나씩 증가]
				{
					System.out.print(" ");
				}
				for(int j=num-1; j>=i; j--)			//높이를 나타내는 수만큼 삼각형 왼쪽 영역에 *를 출력 [하나씩 감소]
				{
					System.out.print("*");
				}
				for(int j=num-1; j>i; j--)			//높이를 나타내는 수보다 하나 적은 삼각형 오른쪽 영역에 *를 출력 [하나씩 감소]
				{
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		}
		su.close();
	}
}
