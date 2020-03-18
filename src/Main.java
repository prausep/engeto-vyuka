import java.util.ArrayList;

public class Main {   //System.out.println("nazdar\n".repeat(10)); zopakuje string 10
    public static void main(String[] args) {
        Example1 exampl = new Example1(); // jsou statické není potřeba vytvářet objekt
        // Example1.triangle(4);
        // Example1.tree2(4);
        //Example1.square(6);

        //Example1.clock(5); //omezená funkčnost
        //Example1.multiplicant(11, 8);
        //Example1.isPrime6K1(6);
        //for (int i=3;i<100;i++) Example1.isPrime6K1(i);
        //for (int i=1;i<11 ;i++) Example1.FibonacciF(i);
        //Example1.FibonacciF(20);
        //int[] ar = {3, 1, 5, 15};
        //for (int i:ar) Example1.FizzBuzz(i);
        Recurse Recourse = new Recurse(); // zbytečné vytvářet instanci pro statické metody patřící třídě

        /*int [] ar={0,1,3,5,16,17};
        for (int i:ar) {
            Recurse.toBinary(i);
            System.out.println();
        }*/
        //Recurse.toDecimal("1011");

        //druhaHodina.halloBob(args[0]);
        //System.out.println(druhaHodina.suma(4));
        //System.out.println(druhaHodina.suma2(4));
        //int[] ar ={1900,2000,4};
        //for (int i:ar) druhaHodina.leapYear(i);
        //System.out.println(druhaHodina.interest(0.5,100));
        //System.out.println(druhaHodina.runTime());
        //druhaHodina.rozkladNaPrvocisla(87);
        //for (int i:druhaHodina.rozkladNaPrvocisla(78)) System.out.println(i);
        Test.pole(100);
        //System.out.println(druhaHodina.NSD(40902,24140)) ;

        System.out.println(TretiHodina.sumInArr(new int [] {1,2,3,5,5}));
        //System.out.println(TretiHodina.isJava(args));
        //for (int i: TretiHodina.sumArrs(new int [] {1,2,3,5,5},new int [] {3,2,3,1} ))System.out.println(i);
        //System.out.println(TretiHodina.reverseString("Ahoj"));
        System.out.println(TretiHodina.avgArr(new int[]{1,2,3,5,5}));



    }
}
//