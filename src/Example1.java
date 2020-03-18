import java.time.LocalTime; // import the LocalTime class


public class Example1 {

    public static void triangle(int row) {
        for (int i=0; i<row+1; i++) {
            System.out.println();
            for(byte n=0; n<i; n++) {
                System.out.print("*");
            }
        }
    }

    public static void tree(int row) {
        for (int n = 0; n < row+1; n++) {
            System.out.println();
            for (int empty = row; empty > n; empty--) {
                System.out.print("_");
            }
            for (int star = 0; star < n * 2 - 1; star++) {
                System.out.print("*");
            }
        }
    }

    public static void tree2(int row) {
        System.out.println();
        int stars = 1;
        int spaces = row-1;
        for (int n = 0; n < row+1; n++) {
            for (int empty = 0; empty < spaces; empty++) {
                System.out.print(" ");
            }
            for (int star = 0; star < stars; star++) {
                System.out.print("*");
            }
            stars=stars+2;
            spaces--;
            System.out.println();
        }
    }
    public static void printFor(int row) {
        for (int i=0; i<row; i++) System.out.println(i);
    }

    public static void square(int row) {
        for (int n = 0; n < row; n++) {
            System.out.print("*");
        }
        System.out.println();
        for (int h = 0; h < row - 2; h++) {
            System.out.print("*");
            for (int n=0;n<row-2;n++) System.out.print(" ");
            System.out.println("*");
        }
        for (int n = 0; n < row; n++) {
            System.out.print("*");
        }
    }

    public static void clock(int column){
        /*
        if (column<3) {
            System.out.println("nemožné");
            exit;
        }
        */
        System.out.println();
        //int row=(((column+1)/2)*2)-1; // nebo vydělit 2 zaokrouhlit nahoru a odečíst -1
        int half=(column/2)+1;

        for (int l=-2;l<3;l++){
            //vypsat mezery
            for (int e=0;e<2-Math.abs(l);e++) System.out.print("_");
            //vypsat hvězdy
            for (int e=0;e<Math.abs(2*l)+1;e++) System.out.print("*");
            System.out.println();
        }

        for (int l=-3;l<4;l++){
            //vypsat mezery
            for (int e=0;e<3-Math.abs(l);e++) System.out.print("_");
            //vypsat hvězdy
            for (int e=0;e<Math.abs(2*l);e++) System.out.print("*");
            System.out.println();
        }

    }
    // mělo se to udělat přes .format("%-{num}s", ...) //printf f formátuje výstup
    public static void multiplicant (int iterace, int mn){
        int maxSpaceI = (int) Math.log10(iterace)+1;
        int maxSpaceN = (int) Math.log10(mn)+1; // zbytečné mn se nemění
        for (int i=1;i<iterace+1;i++){
            System.out.print(i);
            for (int s=0;s<(int) maxSpaceI-Math.log10(i);s++) System.out.print(" ");
            System.out.print("* "+mn);
            for (int s=0;s<(int) maxSpaceN-Math.log10(mn);s++) System.out.print(" ");
            System.out.println("= "+(i*mn));
        }
    }

    //String.format("|%20d|", 93);
    /*public static void multiplicantF (int iterace, int mn){
        for (int i=1;i<iterace+1;i++){
            System.out.print(i);
            for (int s=0;s<(int) maxSpaceI-Math.log10(i);s++) System.out.print(" ");
            System.out.print("* "+mn);
            for (int s=0;s<(int) maxSpaceN-Math.log10(mn);s++) System.out.print(" ");
            System.out.println("= "+(i*mn));
        }
    }*/

    public static void isPrime(int n){
        boolean is = true;
        for (int i=2;i<(int)Math.sqrt(n);i++){
            if (n%i==0) {
                is=false;
                break;
            }
        }
        if (is) System.out.println("Number "+n+" is prime.");
            else System.out.println("Number "+n+" isn't prime.");
    }
    public static void isPrime6K1(int n){
        boolean is = true;
        if (n!=3) {
            if (((n+1) % 6 == 0)|((n-1) % 6 ==0)) {
                for (int k=1; k<((n+1)/6); k++){
                    if ((n % (6*k+1) == 0)|(n % (6*k-1) == 0)) {
                        is = false;
                        break;
                    }
                }
            } else is=false;
        }
        if (is) System.out.println("Number "+n+" is prime.");
        else System.out.println("Number "+n+" isn't prime.");
    }
    public static void FibonacciF(int n){
        LocalTime StartT = LocalTime.now();
        LocalTime EndT = LocalTime.now();
        int first = 0;
        int secound =1;
        int swap;
        if (n==1)
            {System.out.println("Fibonacci "+n+"-th number is " +first);}
        else if (n==2)
            {System.out.println("Fibonacci "+n+"-th number is " +secound);}
        else
            {for (int i=2; i<n; i++){
                swap=secound;
                secound= first+secound;
                first=swap;
                //System.out.print(secound+", ");
            }
            System.out.println("Fibonacci "+n+"-th number is " +secound);
        }
        EndT=LocalTime.now();
    }
    public static void FizzBuzz(int n){
        if (n % 3 == 0) System.out.print("Fizz");
        if (n % 5 == 0) System.out.print("Buzz");
        System.out.println();

        /*
        if (n % 3 == 0) {
            if (n%5==0) System.out.println("FizzBuzz");
                else System.out.println("Fizz");
            } else if (n%5==0) System.out.println("Buzz");
        else System.out.println();
        */
    }
    public static void toBinary(int n){
        //System.out.println("Binary is " + Integer.toBinaryString(n));

    }



}
