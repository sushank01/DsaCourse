package day001;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class fibonacci {
    //fibonacci number

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 0 ; i < n ; i++ )
        {
            System.out.println(a);
            int c = a + b ;
            a = b ;
            b = c ;


        }

    }


}




   