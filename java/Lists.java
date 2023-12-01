import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Lists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(); // Creating list of integres
        List<String> s =  new ArrayList<String>(); // Creating list of Strings
        s.add("Aniketh");
        s.add("Srivani");//adding element using add()
        s.add("Balaji");
        s.add("Vanitha");
        for (String string : s) { // Iterating over the list -> s
            System.out.print(string + " ");
        }

        list.add(12);
        list.add(21);
        list.add(32);
        // list.add(2,34); // If the size is present already it will add else error
        // list.add(10,34); // this gives an error
        list.add(4);

        Collections.sort(list); // Sorting an list

        System.out.println(list.get(1)); // Accessing an element using index
        // list.clear(); // Deleting all elements of the list using clear()
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

        list.add(12);
        list.add(124);
        list.add(1232);
        list.add(122);

        ListIterator<Integer> itr = list.listIterator(); // Iterator used to traverse over the list in backward and forward direction

        // hasNext() -> checks if next index is available and returns true
        // next() -> returns the current index value
        while (itr.hasNext()) { // Traversing in forward direction
            System.out.println(itr.next());
        }

        // hasPrevious() -> checks if previous index is avaiable and returns true
        // previous() -> checks if the previous index is avaiable
        while (itr.hasPrevious()) { // Traversing in backward direction
            System.out.println(itr.previous());
        }
    }
}
