package CollectionAndGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MultiFieldComparator implements Comparator<Squirrel> {
    public int compare(Squirrel s1, Squirrel s2) {
	int result = s1.getSpecies().compareTo(s2.getSpecies());
	if (result != 0)
	    return result;
	return s1.getWeight() - s2.getWeight();
    }
    public static void main(String[] args) {
	var a=new ArrayList<Squirrel>();
	a.add(new Squirrel(4,"mg"));
	a.add(new Squirrel(5,"ma"));
	a.add(new Squirrel(6,"ma"));
	a.add(new Squirrel(7,"ma"));
	System.out.println(a);
//	Collections.sort(a,new MultiFieldComparator());
	Comparator<Squirrel> c = Comparator.comparing(Squirrel::getSpecies)
		.thenComparingInt(Squirrel::getWeight).reversed();
	Collections.sort(a,c);
	System.out.println(a);
    }
}