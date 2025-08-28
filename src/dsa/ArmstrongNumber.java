package dsa;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int digit=calculateDigits(153);
        System.out.println(armstrongNumber(n,digit));
    }

    static int calculateDigits(int n){
        return String.valueOf(n).length();
    }

    static boolean armstrongNumber(int n,int digits) {
        // code here
        int sum=0,a=n;
        if(a>999||a<99){
            return false;
        }
        while(a>0){
            int r=a%10;
            sum=sum+productsum(r,digits);
            a=a/10;
        }
        return sum==n;

    }

    static int productsum(int a,int n){
        if(a==0){
            return 0;
        }
        int p=1,x=1;
        while(x<=n){
            p=p*a;
            x++;
        }
        return p;
    }
}
