import com.sun.deploy.util.SyncAccess;

public class cut1 {
    public static void main(String[] args)
    {
        System.out.println(cutfunction(6));
    }
    private static int cutfunction(int num)
    {
        if(num==0)
        {
            return 0;
        }
        if(num == 1)
        {
            return 1;
        }
        if(num == 2)
        {
            return 1;
        }
        if(num == 3)
        {
            return 2;
        }
        int [] dp = new int[num+1];
        dp[0] =0;dp[1]=1;dp[2]=2;dp[3]=3;
        int max =0;
        for(int i = 4;i<=num;i++)
        {
            max = 0;
            for(int j = 1;j<=i/2;j++)
            {
                int val = dp[j]*dp[i-j];
                max = max>val?max:val;
            }
            dp[i] = max;
        }
        return dp[num];
    }
}
