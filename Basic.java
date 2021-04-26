//static-= class level
// non-static= object level

//banking example
// NON-STATIC----accountBalance , withdrawl() , checkBalance() 
//STATIC-----intrest, calculateIntrest()

package $01_StaticVsNonStatic;

public class Basic {
    //static block gets executed only once when the class is loaded
        static {
        System.out.println("inside static block 2");
    }
    static {
        System.out.println("inside static block 1");
    }
// static block execute in top to bottom order of program 
    public static void main(String[] args) {
        System.out.println("inside main method");
    }
}
