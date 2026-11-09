import java.util.*;
public class Solution {
  public static int solution(int number)
    {
	
	int sum = 0 ;
	    for(int i =1;i<number;i++)
	    {  
            if (i % 3== 0||i%5==0)
            {
                sum+=i;   
            }
	    }
    System.out.println(sum);
    return sum;

}
}