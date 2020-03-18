//package PetrPrause;

import java.util.ArrayList;

public class druhaHodina {
    /*
    1 metoda hallo (string name)
    2 pokud Bob vypíše halo jinak ne
    3 součet čísel a) for b) n/2(n+1)
    4 binomické číslo
    5 přestupný rok dělitelný 4 !100  400
    6 prvočíslo erastenovo síto.
    8 počítaní úroků
    9 změření času System.current.timeMillis
    10 čtvrté dokonalé číslo se rovná součtu svých dělitelů 6=3+2+1
     */

    public static void hallo(String name){
        System.out.println("hallo "+name);
    }

    public static void halloBob(String name){
        if (name.equals("Bob")) System.out.println("hallo "+name);
        else System.out.println("nejsi bob");
    }

    public static int suma(int n){
        int x=0;
        for (int i=1; i<n+1; i++) x=x+i;
        return x;
    }
    public static int suma2 (int n){
        return n*(n+1)/2;
    }

    private static int factorial(int n){
        int x=0;
        for (int i=1; i<n+1; i++) x*=i;
        return x;
    }

    public static long binomic(int n, int k){
        long fn = druhaHodina.factorial(n);
        long fk = druhaHodina.factorial(k);
        return fn/((fn-fk)*fk);
    }

    public static void leapYear(int y){
        if (y%4==0 && y%100!=0) System.out.println("Rok "+y+" je přestupný");
        else if (y%400==0) System.out.println("Rok "+y+" je přestupný");
        else System.out.println("Rok "+y+" je nepřestupný");
    }
    public static long interest(double interest, int amout){
        return Math.round((1+interest)*amout);
    }

    public static long runTime (){
         long start=System.currentTimeMillis();
         System.out.println(start);
         long x= factorial(20);
        try {                               // bez toho nefunguje Thread.sleep (asi)
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end=System.currentTimeMillis();
         System.out.println(end);
         return end-start;
    }

    public static ArrayList<Integer> rozkladNaPrvocisla(int n){
        int i=2;
        ArrayList<Integer> x = new ArrayList<Integer>();
        while (n!=1){
            if (n%i==0) {
                n=n/i;
                x.add(i);
            }else {
                i++;
            }
        }
        return (x);
    }

    public static int NSD(int u, int v) {
        int r;
        while (v != 0) {
            r=u%v;
            u=v;
            v=r;
        }
        return u;
    }
    // nejmenší společný násobek A,B = (a * b) / NSD(a, b)


}
