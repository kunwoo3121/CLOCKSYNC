import java.util.Scanner;

public class CLOCKSYNC {
	
	static int min;
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		int[][] clk = {{0,1,2},{3,7,9,11},{4,10,14,15},{0,4,5,6,7},{6,7,8,10,12},{0,2,14,15},{3,14,15},{4,5,7,14,15},{1,2,3,4,5},{3,4,5,9,13}};
		
		
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			int[] clock_time = new int[16];
			int[] clock_time_2 = new int[16];
			int[] button_cnt = new int[10];
			int cnt = 0;
			
			for(int j = 0; j < 16; j++)
			{
				clock_time[j] = sc.nextInt();
				clock_time[j] /= 4;
			}
			
			min = 31;
			
			while(true)
			{
				cnt = 0;
				
				for(int j = 0; j < 16; j++)
				{
					clock_time_2[j] = clock_time[j];
				}
				
				for(int j = 0; j < 10; j++)
				{
					cnt += button_cnt[j];
					if(button_cnt[j] == 0) continue;
					for(int k = 0; k < clk[j].length; k++)
					{
						clock_time_2[clk[j][k]] = (clock_time_2[clk[j][k]] + button_cnt[j]) % 4;
					}
				}
				
				int k;
				
				for(k = 0; k < 16; k++)
				{
					if(clock_time_2[k] != 3) break;
				}
				
				if(k == 16)
				{
					if(min > cnt) min = cnt;
				}
				
				if(cnt == 30) break;
				
				button_cnt[9]++;
					
				for(int j = 9; j >= 0; j--)
				{
					if(button_cnt[j] >= 4)
					{
						button_cnt[j-1]++;
						button_cnt[j] %= 4;
					}
					else break;
				}
				
			}

			if(min != 31) System.out.println(min);
			
			else System.out.println("-1");
		}
	}

}
