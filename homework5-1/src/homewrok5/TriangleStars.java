package homewrok5;

import java.util.*;

public class TriangleStars {
	
	public void question2() {
		
		System.out.println("===========================================");
		Scanner su = new Scanner(System.in);
		
		String value = null; 
		String value2 = null;
		
		while(true) {
			
			System.out.print("직각삼각형의 왼쪽여백과 높이입력 : ");	
			value = su.next();
			value2 = su.next();
			
			if((!value.matches("^[0-9]*$")) || (!value2.matches("^[0-9]*$")))		//숫자가 아닌 다른 것을 입력하였을 때의 정규표현식 사용
			{
				System.out.println("자연수를 입력하셔야 합니다. 다시 입력하십시오.");
				continue;
			}
			
			int num = Integer.parseInt(value);			//num에는 왼쪽여백의 값을 입력.
			int num2 = Integer.parseInt(value2);		//num2에는 높이 값을 입력
			if(num == 0 || num2 == 0)
			{
				System.out.println("0으로는 직각삼각형을 만들 수 없습니다. 다시 입력하십시오.");
				continue;
			}
			
			for(int i=1; i<=num2; i++)			//num2의 값을 입력받은 만큼 줄바꿈을 반복적으로 찍어냄.(높이 값)
			{
				for(int j=1; j<=num-i; j++)		//num-i의 값을 입력받은 만큼 왼쪽여백의 값 반복적으로 찍어냄.
				{
					System.out.print(" ");
				}
				for(int k=1; k<=i; k++)			//높이를 나타내는 수만큼 *를 찍어냄. 높이가 1일 때 *를 찍는 것도 1개.
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
