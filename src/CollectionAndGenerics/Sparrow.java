package CollectionAndGenerics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Sparrow extends Bird {
    public static void main(String[] args) {
	List<? extends Bird> birds=new ArrayList<Bird>();
	birds.add(new Sparrow());
	birds.add(new Bird());
	
	 List<? super IOException> exceptions = new ArrayList<Exception>();
	 exceptions.add(new Exception()); // DOES NOT COMPILE
	 exceptions.add(new IOException());
	 exceptions.add(new FileNotFoundException());
    }

}
class Bird { }
