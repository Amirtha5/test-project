import java.util.*;


public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        if(n%==1  && n>=1 && n<=5){
            System.out.println("Odd");
        }
        else if(n%2==0 && n>=20){
            System.out.println("Even");

        }
        else{
            System.out.println("Odd");
        }
    }
}
