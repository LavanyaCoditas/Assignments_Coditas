package Assignment2;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;



    public class HashSet_TreeSet_LinkedHashSet {

        public static void main(String[] args) {

            HashSet<Integer> hashset2 = new HashSet<>();
            hashset2.add(63);
            hashset2.add(902);
            //Dupilcates will not be added
            //It is unordered
            hashset2.add(63);
            hashset2.add(572);
            hashset2.add(882);
            System.out.println("HashSet : " + hashset2);

            //Order of insertion is maintained
            LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>();
            linkedhashset.add(34);
            linkedhashset.add(32);
            linkedhashset.add(33);
            linkedhashset.add(33);
            System.out.println("LinkedHashSet : " + linkedhashset);

          //stored elements in sorted order and no duplicates implements navigational methods
            TreeSet<Integer> treeset = new TreeSet<>();
            treeset.add(3);
            treeset.add(2);
            treeset.add(1);
            treeset.add(4);
            treeset.add(3);
treeset.addLast(21);
            System.out.println("TreeSet : " + treeset);

        }
    }

