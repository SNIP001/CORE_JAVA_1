
package $01_StaticVsNonStatic;

public class NonStaticMembers {
    int num;
    
    //java checks for any default constructor
    // if not it creates one
    
    //below is a default constructor
     NonStaticMembers() {
         System.out.println("inside the constructor");
    }
     
     //non-static block gets executed every time if we create an object
     {
         System.out.println("inside the non-static block");
     }
    public static void main(String[] args) {
        System.out.println("inside the main method");
        
        //using 'new' keyword we can create [instance of a class or object]
        new  NonStaticMembers();
        new  NonStaticMembers();
        new  NonStaticMembers();
        
    }
    static {
        System.out.println("inside the static block");
    }
}
