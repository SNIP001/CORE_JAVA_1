
package $01_StaticVsNonStatic;

public class InvokeStaticMethod {
    //object creatrion 1
    static InvokeStaticMethod obj = new InvokeStaticMethod();
    
     static {
        //address 1
        System.out.println(InvokeStaticMethod.obj);
        //calling the static method inside the main method
       InvokeStaticMethod.obj= InvokeStaticMethod.init();
    }
     
//    static {
//        //address 1
//        System.out.println(StaticMethodReference.obj);
//        //calling the static method inside the main method
//        StaticMethodReference.init();
//    }
    public static void main(String[] args) {
        // address 2
        System.out.println(InvokeStaticMethod.obj);  
    }
    
//     static void init(){
//        //object creation 2
//          StaticMethodReference.obj= new StaticMethodReference();
//    }
    
    
    static InvokeStaticMethod init(){
        //object creation 2
        return new InvokeStaticMethod();
    }
}
// this program prints differnt address because the object is created twice