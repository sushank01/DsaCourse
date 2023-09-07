package day001;
import java.util.*;
public class countdigit {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();

        int x = 0   ;
        while (n != 0){
            n = n / 10 ;
            x++;

        }
        System.out.println(x);


    }
}




