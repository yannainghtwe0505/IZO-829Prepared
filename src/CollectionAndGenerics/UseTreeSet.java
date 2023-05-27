package CollectionAndGenerics;

import java.util.Set;
import java.util.TreeSet;

public class UseTreeSet {
    static class Rabit {
	int a;
    }
    public static void main(String[] args) {
	Set<Duck> ducks=new TreeSet<>();
	ducks.add(new Duck("puddle"));
	Set<Rabit> rabit=new TreeSet<>((r1,r2)->r1.a-r2.a);
	rabit.add(new Rabit());
	
    }

}
