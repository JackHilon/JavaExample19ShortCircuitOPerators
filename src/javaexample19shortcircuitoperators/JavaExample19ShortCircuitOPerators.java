
package javaexample19shortcircuitoperators;


public class JavaExample19ShortCircuitOPerators {

    
    public static void main(String[] args) {
        
        int m=5, n=5;
        
        System.out.println("==== Logic AND operation ====");
        boolean b1= m <0 && n++ >0;
        System.out.println("m < 0 && n++ > 0 : "+b1);
        System.out.println("n = "+n);
        
        System.out.println();
        
        boolean b2= m <0 && n++ >0;
        System.out.println("m < 0 && n++ > 0 : "+b2);
        System.out.println("n = "+n);
        
        System.out.println();
        System.out.println("============================");
        System.out.println();
        
        System.out.println("==== Logic OR operation ====");
        boolean b3= m >0 || n++ >0;
        System.out.println("m > 0 || n++ > 0 : "+b3);
        System.out.println("n = "+n);
        
        System.out.println();
        
        boolean b4= m >0 || n++ >0;
        System.out.println("m > 0 || n++ > 0 : "+b4);
        System.out.println("n = "+n);
    }
    
}
