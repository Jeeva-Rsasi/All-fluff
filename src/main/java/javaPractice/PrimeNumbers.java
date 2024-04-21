package javaPractice;

public class PrimeNumbers {
    public static void prime(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        prime(5);
    }
}
