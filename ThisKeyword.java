
package $01_StaticVsNonStatic;

public class ThisKeyword {
    int x;
    ThisKeyword(){
        // ' this' keyword is used to point object refernce
        // can be used only for non-static contents
        System.out.println(this);
        System.out.println(this.x);
    }
    public static void main(String[] args) {
        new ThisKeyword();
        new ThisKeyword();
    }
}
