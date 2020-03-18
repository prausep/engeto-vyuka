/*
sčítaní čísel v poli
je Java v argumentech použít equals S1.EQUALS(S2)
sčítání dvou polí a[i]+b[i]
reverse string (bez string builder)
najdi průměr pole
je palindrom
obsahuje pole prvek x
najdi počet výskytů charů x v stringu y



*/

public class TretiHodina { //? ošetření přístupu k neexistujícímu prvku??

    public static int sumInArr (int[] s){
        int sum=0;
        for (int i:s) sum+=i;
        return sum;
    }

    public static boolean isJava (String[]args){
        //boolean res= false;
        for (int i=0;i<args.length;i++) if (args[i].equals("Java")) {
            //res=true;
            //break;
            return true; // !! místo předchozích případů
        }
        return false;
    }

    public static int[] sumArrs(int[] s1, int[] s2){
        int l;
        int m;
        l= Math.max (s1.length, s2.length);     //místo IFu !! který stejně potřebuješ :-(
        m= Math.min (s1.length, s2.length);
        int[] res =new int[l];
        for (int i=0; i<m; i++) {
            res[i]=s1[i]+s2[i];
        }
        if (s1.length>s2.length) {
            for (int i=m;i<l;i++) res[i]=s1[i];
        } else if (l!=m)  for (int i=m;i<l;i++) res[i]=s2[i];
        return res; // BEZ ZÁVOREK !!
    }

    public static String reverseString (String s){
        int x= s.length()-1;
        String sn="";
        for (int i=x;i>-1;i--) {
        sn+=s.charAt(i);
        }
        return sn;
    }

    public static double avgArr(int[] arr){
        double res=1.1;
        res= (double)sumInArr(arr)/arr.length;  //??? int/int vrací int ne double !!!
        return res;
    }

    public static boolean isPalindrom(String s){

        return true
    }
}
