import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Inheritance {

    public static void main(String[] args) {

//        for local date
        LocalDate myDateObj = LocalDate.now();
        System.out.println(myDateObj);

//        for local time
        LocalTime myTimeObj = LocalTime.now();
        System.out.println(myTimeObj);

//        now for format it
        DateTimeFormatter myFormatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter myFormatTime = DateTimeFormatter.ofPattern("HH:mm:ss");

//        store it
        String formattedDate = myDateObj.format(myFormatDate);
        String formattedTime = myTimeObj.format(myFormatTime);
        System.out.println(formattedDate + " " + formattedTime);

//        creating array list
        ArrayList<Integer> value = new ArrayList<>();
        value.add(12);
        value.add(14);
        value.add(15);
        value.add(56);
        value.add(2);

//        sort accordingly reverser order
        value.sort(Collections.reverseOrder());
//       creating output using foreach loop
        for(int var : value) {
            System.out.println(var);
        }

//        LinkedList
        LinkedList<String> name = new LinkedList<>();
        name.add("Bishal");
        name.add("Komal");
        name.add("Bishnu");
        name.add("Kapil");

//        sort it according to alphabetically
        Collections.sort(name);

        for( String names : name) {
            System.out.println(names);
        }


//        HashMap
        HashMap<String, String> capitalCities = new HashMap<>();

//        Add key and value (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Nepal", "Kathamandu");
        capitalCities.put("USA", "Washington Dc");
        System.out.println(capitalCities);

//        Loop Through a Hashmap get the only key of it
        for(String i: capitalCities.keySet()) {
            System.out.println(i);
        }

//        Loop Through a Hashmap get the only values of it
        for(String i: capitalCities.values()) {
            System.out.println(i);
        }

//        Loop Through a Hashmap get both value and key in same loop
        for(String i : capitalCities.keySet()) {
            System.out.println("Key: " + i + " value " + capitalCities.get(i));
        }

//        Size of HashMap
        System.out.println(capitalCities.size());

//        Access an item
        System.out.println(capitalCities.get("Nepal"));

//        Remove an Item
        System.out.println(capitalCities.remove("USA"));
        System.out.println(capitalCities);

//        Clear an Item
        capitalCities.clear();
        System.out.println(capitalCities);

//        Iterator
        // Make a collection
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

//        Get the iterator
        Iterator<String> it = cars.iterator();

//        Print the first item

//        loop through it
        do {
            System.out.println(it.next());
        } while (it.hasNext());

        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
    }
}
