package Enumeration_and_Iterator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumItTestDrive {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<Integer>(5);

        for (int i = 1; i <= 5; i++){
            v.add(i);
        }

        Enumeration<Integer> enumeration = v.elements();
        EnumerationIterator<Integer> adapter = new EnumerationIterator<Integer>(enumeration);

        while(adapter.hasNext()){
            System.out.println("Fala: " + adapter.next());
        }
    }
}
