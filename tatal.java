mport java.util.*;
public class total {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,a;
        while(n>0){
         a=n%10;
            sum+=a;
            n=n/10;
        }
            System.out.println(sum);
    
    }
    