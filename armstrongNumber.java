    import java.util.*;
    public class armstrongNumber {
        public static void main(String args[]){
            Scanner s = new Scanner(System.in);
            System.out.println("etner a number");
            int n = s.nextInt();
            int digit = 0;
            int og = n;
            int rem =0;
            int sum=0;
            while(n>0){
                digit++;
                n/=10;
            }
            n=og;
            while(n>0){
                rem = n%10;
                int pow=1;
                for(int i=0;i<digit;i++){
                    pow=pow*rem;
                }
                sum+=pow;
                n=n/10;
            }
            System.out.println(sum);

            if(sum==og){
                System.out.println("armstrong number");
            }
            else{
                System.out.println("not armstorng");
            }

            System.out.println(digit);

            
        }
        
    }
