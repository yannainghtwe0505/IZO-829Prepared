package CollectionAndGenerics;

import java.util.ArrayList;
import java.util.Collections;

public class Duck implements Comparable<Duck>{
    
    private String name;	

    public Duck(String name) {
	super();
	this.name = name;
    }

    @Override
    public String toString() {
	return "Duck [name=" + name + "]";
    }

    @Override
    public int compareTo(Duck o) {
	// TODO Auto-generated method stub
	return name.compareTo(o.name);// sorts ascendingly by name
    }
    public static void main(String[] args) {
	var duck=new ArrayList<Duck>();
	duck.add(new Duck("World "));
	duck.add(new Duck("Hello "));
	Collections.sort(duck);
	System.out.println(duck);
	
    }

}
