package homewrok5;

import java.util.*;

public class IsoscelesTriangleStars {

	public void question3() {
		
		System.out.println("===========================================");
		Scanner su = new Scanner(System.in);
		
		String value = null; 
		
		while(true) {
			
			System.out.print("이등변삼각형의 높이 입력 : ");	
			value = su.nextLine();
			
			if(!value.matches("^[0-9]*$"))		//숫자가 아닌 다른 것을 입력하였을 때의 정규표현식 사용
			{
				System.out.println("자연수를 입력하셔야 합니다. 다시 입력하십시오.");
				continue;
			}
			
			int num = Integer.parseInt(value);			
			
			if(num == 0)
			{
				System.out.println("0으로는 이등변삼각형을 만들 수 없습니다. 다시 입력하십시오.");
				continue;
			}
			
			for(int i=1; i<=num; i++)			//num의 값을 입력받은 만큼 줄바꿈을 반복적으로 찍어냄.(높이 값)
			{
				for(int j=num; j>=i; j--)		//num의 값에서 시작하여 왼쪽 공백 영역을 출력 [하나씩 감소]
				{
					System.out.print("  ");
				}
				for(int j=1; j<=(2*i)-1; j++)			//높이를 나타내는 수만큼  *를 출력 [하나씩 증가]
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

