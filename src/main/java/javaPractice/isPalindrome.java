package javaPractice;

public class isPalindrome {
    public static void main(String[] args) {
        String str = "mommy";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("String is palindrome");
        }else System.out.println("Not a palindrome");
    }
}
