public class Second {

    public static void main(String[] args) {
        System.out.println("hello world");
        Intro myObj = new Intro(12);
        Intro myObj2 = new Intro(12);
        System.out.println(myObj.x+" "+myObj2.x);

        myObj2.myPublicMethod(); // need a object to call this method
        // no need object to call this method
    }
}
