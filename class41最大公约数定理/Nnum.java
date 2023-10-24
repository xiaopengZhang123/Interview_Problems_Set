package Test;

public class Nnum {
    // leetcode 878
    public static void main(String[] args) {
        int nnum = nnum(1000000000, 40000, 40000);
        System.out.println(nnum);
    }
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public static int nnum(int n,int a,int b){
        long l=0,r=Math.min(a,b)*n;
        long ans=0;
        int lCm=(a*b)/gcd(a,b);
        while(l<=r){
            long m=(l+r)/2;
            if((m/a+m/b-m/lCm)>=n){
                ans=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return (int)ans%1000000007;
    }
}
