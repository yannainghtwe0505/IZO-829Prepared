package CollectionAndGenerics;

public class LegacyDuck implements Comparable{
    private String name;

    @Override
    public int compareTo(Object o) {
	// TODO Auto-generated method stub
	LegacyDuck d=(LegacyDuck)o;
	return name.compareTo(d.name);
    }

}
