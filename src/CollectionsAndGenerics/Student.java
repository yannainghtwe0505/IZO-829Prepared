package CollectionsAndGenerics;

public class Student {
	private String name, cname;
	private int attend;

	public Student(String name, String cname, int attend) {
		this.name = name;
		this.cname = cname;
		this.attend = attend;
	}

	public String getName() {
		return name;
	}

	public String getCname() {
		return cname;
	}

	public int getAttend() {
		return attend;
	}

}
