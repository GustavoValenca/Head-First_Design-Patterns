package Enumeration_and_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ItEnumTestDrive {
    public static void main(String[] args){
        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();
        IteratorEnumeration<String> adapter = new IteratorEnumeration<String>(it);

        while(adapter.hasMoreElements()){
            System.out.println("Vai falando: " + adapter.nextElement());
        }
    }
}