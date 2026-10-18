import java.util.Scanner;

public class count_digits {
     public static void main(String args[]){
            Scanner s = new Scanner(System.in);
            System.out.println("etner a number");
            long n = s.nextLong();
            long rem=0;
            long sum=0;
            int count =0;
            while(n>0){
                rem=n%10;
                sum=sum*10+rem;
                count++;
                n=n/10;
            }
            System.out.println(count);
        }
}
