import java.util.Scanner;
 
public class TidyNumbers
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int q = 1;
        while (t-- > 0)
        {
            String qt = scn.next();
            char s[] = qt.toCharArray();
            String ans = "";
            if (s.length == 1)
            {
                ans = String.valueOf(s);
            }
            else            
			{
                for (int j = s.length - 1; j > 0; j--)
                {
                    if (s[j - 1] > s[j])
                    {
                        s[j - 1] = (char) (s[j - 1] - 1);
                        for (int k = j; k < s.length; k++)
                        {
                            s[k] = '9';
                        }
                    }
                }
                if (s[0] > s[1])
                {
                    s[0] = (char) (s[0] - 1);
                    for (int k = 1; k < s.length; k++)
                    {
                        s[k] = '9';
                    }
                }
                ans = String.valueOf(s);
            }
            BigInteger b = new BigInteger(ans);



            /*Brute Force Logic Small Dataset            
			for (long i = n; i >= 0; i--)
            {
                String s = String.valueOf(i);
                int l = s.length();
                boolean flag = true;
                for (int j = 0; j < l - 1; j++)
                {
                    char ch = s.charAt(j);
                    char ch2 = s.charAt(j + 1);
                    if (ch > ch2)
                    {
                        flag = false;
                        break;
                    }
                }
                if (flag == true)
                {
                    ans = i;
                    break;
                }
            }*/


            
            System.out.println("Case #" + q + ": " + b);
            q++;
        }
    
//Java Code for the problem. Approach similar to Praval’s Approach!