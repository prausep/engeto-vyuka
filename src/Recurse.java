public class Recurse {
    public static void toBinary(int n){
        if (n>0) {
            toBinary(n/2);
            System.out.print(n=n % 2);
        }

    }

   /* public static int fibonacci(int n) {
        return
    }*/

    public static void toDecimal(String binNum){ // odečíst asci nulu pro převod na 1 O
        int result=0;
        int sLength=binNum.length();
        for (int i=sLength-1; i>-1;i--){
            int n= binNum.charAt(i); //Character.getNumericValue
            result = result + (n * (int)Math.pow(2,sLength-i));
            System.out.println(n);
        }
        System.out.println(result);

    }
}
