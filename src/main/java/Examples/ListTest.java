package Examples;
import java.util.*;
/**
 *
 * @author koonp@641102064111
 * Create on 4:40:39 PM Sep 7, 2022
 * This file is part of "Examples" Package.
 */
public class ListTest {
    public static void main(String[] args){
        LinkedList A = new LinkedList(); LinkedList B = new LinkedList();
        A.add("Doraemon"); A.add("Ikuesan"); A.add("Hatori"); A.add("Dragonball"); A.add(2,"Conan");
        System.out.print("Index in A = "+A.size());
        System.out.println(" Include\n"+A);
        if(A.contains("Conan")){
            System.out.println("Conan at Index "+A.indexOf("Conan")+1);
        }
        A.remove(3);
        System.out.println("index "+4+" was deleted then");
        System.out.println("A = "+A);
        for(int i=0;i<A.size();i++){
            B.add(A.get(i));
        }
        B.set(2, "Hatori");
        System.out.println("B = "+B);
        if(!(A.equals(B))){
            System.out.println("A not equal B");
        }
        A.clear();
        System.out.println("deleted all index of A");
        System.out.println("A = "+A);
        if(A.isEmpty()){
            System.out.print("A is empty list");
        }
    }
}

