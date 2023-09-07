package day001;public class prime {

    public static void main(String[] args) {

        int num = 8;
        boolean x = false;
        for (int i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                x= true;
                break;
            }
        }

        if (x)
            System.out.println(num + " is a not prime number.");
        else
            System.out.println(num + " is prime number.");
    }
}
