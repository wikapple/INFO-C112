import java.util.Scanner;

public class ChapterFivePractice {
    
    public static void checkFermat(int a, int b, int c, int n, int aBase, int bBase, int cBase, int nBase){
        System.out.println("a = " + a + " b = " + b + " c = " + c + " n = " + n);
        if (((Math.pow(a, n)) + (Math.pow(b, n)) == (Math.pow(c, n)))
                && (n > 2)){
            System.out.println("Holy smokes, Fermat was wrong!");
            System.out.print(Math.pow(a, n) + Math.pow(b, n));
            System.out.println("=" + Math.pow(c, n));
            System.out.println("a = " + a + " b = " + b + " c = " + c + " n = " + n);
    }   else if(n > 2){
            checkFermat(a, b, c, n-1, aBase, bBase, cBase, nBase);
    }   else if (c > 1){
            checkFermat(a, b, c -1, nBase, aBase, bBase, cBase, nBase);
    }   else if (b > 1){
            checkFermat(a, b-1, cBase, nBase, aBase, bBase, cBase, nBase);
    }   else if (a > 1){
            checkFermat(a-1, bBase, cBase, nBase, aBase, bBase, cBase, nBase);
    }   else{
            System.out.println("no, that doesn't work.");
    }
        
}
    
    public static void main(String[]args){
        int a, b, c, n;
        int aBase, bBase, cBase, nBase;
        
        a = 5; b=5; c=5; n=5;
        aBase = a; bBase = b; cBase=c; nBase=n;
        checkFermat(a, b, c, n, aBase, bBase, cBase, nBase);
    }
}
    