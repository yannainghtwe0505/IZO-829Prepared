package CollectionAndGenerics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UsingSet {
    public static void main(String[] args) {
//	Set<Integer>  set=new HashSet<>();
	Set<Integer>  set=new TreeSet<>();
	boolean b1=set.add(10);
	boolean b2=set.add(20);
	boolean b3=set.add(0);
	boolean b4=set.add(40);
	set.forEach(System.out::println);
    }

}
