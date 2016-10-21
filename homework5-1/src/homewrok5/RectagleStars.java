package homewrok5;

import java.util.*;

public class RectagleStars {
	
	public void question1() {
	
		System.out.println("===========================================");
		Scanner su = new Scanner(System.in);
		
		String value = null; 
		
		while(true) {
			
			System.out.print("정사각형 크기입력 : ");	
			value = su.nextLine();
			
			if(!value.matches("^[0-9]*$"))		//숫자가 아닌 다른 것을 입력하였을 때의 정규표현식 사용
			{
				System.out.println("자연수를 입력하셔야 합니다. 다시 입력하십시오.");
				continue;
			}
			
			int num = Integer.parseInt(value);		
			if(num == 0)
			{
				System.out.println("0으로는 정사각형을 만들 수 없습니다. 다시 입력하십시오.");
				continue;
			}
			
			for(int i=1; i<=num; i++)			//num의 값을 입력받은 만큼 줄바꿈을 반복적으로 찍어냄.
			{
				for(int j=1; j<=num; j++)		//num의 값을 입력받은 만큼 *를 반복적으로 찍어냄.
				{
					System.out.print(" * ");
				}
				System.out.print("\n");
			}
			break;
		}
		su.close();
	}

}
