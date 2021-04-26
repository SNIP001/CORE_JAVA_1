
package $01_StaticVsNonStatic;

public class StaticMethod {
    static {
        System.out.println("inside static block");
    }
    public static void main(String[] args) {
        
        //use class name to call static methods
        StaticMethod.method1();
        System.out.println("inside main method");
    }

    static void method1() {
        System.out.println("inside method 1");
    }
    
}
