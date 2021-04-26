
package $01_StaticVsNonStatic;

public class InvokeNonStaticMethod {
    public static void main(String[] args) {
        // creating object with reference name obj
        InvokeNonStaticMethod obj = new InvokeNonStaticMethod();
        
        // calling non-static methods using obj
        obj.callRaghul();
    }
    //non-static method
    void callRaghul(){
        System.out.println("call raghul ashok");
    }
}
