package CollectionAndGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DuckImp implements Comparable<DuckImp>{
    private String name;
    private int weight;

    @Override
    public String toString() {
	return name;
    }

    public DuckImp(String name, int weight) {
	super();
	this.name = name;
	this.weight = weight;
    }

    @Override
    public int compareTo(DuckImp o) {
	// TODO Auto-generated method stub
	return name.compareTo(o.name);
    }
    public static void main(String[] args) {
	Comparator<DuckImp> byWeight=new Comparator<DuckImp>() {

	    @Override
	    public int compare(DuckImp o1, DuckImp o2) {
		// TODO Auto-generated method stub
		return o1.weight-o2.weight;
	    }

	};
	var ducks=new ArrayList<DuckImp>();
	ducks.add(new DuckImp("mg",4));
	ducks.add(new DuckImp("lwin",5));
	Collections.sort(ducks);
	System.out.println(ducks);
	Collections.sort(ducks,byWeight);
	System.out.println(ducks);
    }

}
