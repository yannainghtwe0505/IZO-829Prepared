package CollectionAndGenerics;

public class MissingDuck implements Comparable<MissingDuck> {
    private String name;
    @Override
    public int compareTo(MissingDuck o) {
	// TODO Auto-generated method stub
	if(o==null) throw new IllegalArgumentException("Poor formed Duck");
	if(this.name==null && o.name==null)return 0;
	else if (this.name == null) return -1;
	else if (o.name == null) return 1;
	else return name.compareTo(o.name);
    }
    
    public static void main(String[] args) {
	MissingDuck a=new MissingDuck();
	a.name="null";
	MissingDuck b=new MissingDuck();
	b.name=null;
	System.out.println(a.compareTo(b));
	System.out.println();
    }
}
