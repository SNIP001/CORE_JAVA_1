
package $01_StaticVsNonStatic;


public class DemoObject {
    static DemoObject obj;
    static 
    {
         //prints the adress of the object
        System.out.println(DemoObject.obj);
        DemoObject.obj = new DemoObject();
      }
    public static void main(String[] args) {
        
         //prints the adress of the object
        System.out.println(DemoObject.obj);
    }
}
