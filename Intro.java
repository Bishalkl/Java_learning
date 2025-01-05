public class Intro {

    int x;

    // creating constructor
    public Intro(int x) {
        this.x = x;
    }


    //method static no need to create a object to call method
    static  void myMethod() {
        System.out.println("I am static method");
    }

    // Public method need to craete a object to call method
    public void myPublicMethod() {
        System.out.println("I am public method");
    }

}
