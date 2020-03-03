import java.sql.SQLOutput;

public class Main {   //System.out.println("nazdar\n".repeat(10)); zopakuje string 10
    public static void main(String[] args) {
        Example1 exampl = new Example1();
        // Example1.triangle(4);
        // Example1.tree2(4);
        //Example1.square(6);

        //Example1.clock(5); //omezená funkčnost
        //Example1.multiplicant(11, 8);
        for (int i=3;i<100;i++) Example1.isPrime6K1(i);
        //Example1.isPrime6K1(6);
        System.out.println(19%7);
    }
}
//