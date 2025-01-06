//import single class
import java .util.Scanner;
import java.util.*;
public class Second {

    public static void main(String[] args) {
        Scanner myObj3 = new Scanner(System.in);
        System.out.println("Enter username");
        String username = myObj3.nextLine();
        Intro myObj = new Intro(12,username);
        System.out.println(myObj.x + " " + myObj.name);

        myObj.myPublicMethod(); // need a object to call this method
        // no need object to call this method
    }
}
