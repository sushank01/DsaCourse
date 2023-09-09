package day001;
import java.util.*;

public class digitofano {

    // digits of a number

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();


        int nod = 0 ;
        int temp = n ;
        while ( temp != 0){
            temp = temp / 10;
            nod++;
        }

        int div =   (int)Math.pow(10, nod - 1);
                while ( div != 0 ){  //div ki jagah n aaya toh last wale zero count nahi hote  xxERROR404xx
                    int q = n / div ;
                    System.out.println(q);

                    n = n % div ;
                    div = div / 10;

                }

    }
}
