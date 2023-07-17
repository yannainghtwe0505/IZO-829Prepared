package BeyondClasses;

public enum Season2 {
    FALL(3) {
	@Override
	public String getHours() {
	    return "9am-5pm";
	}
    },
    SPRING(4) {
	@Override
	public String getHours() {
	    return "9am-5pm";
	}
    },
    SUMMER(2) {
	@Override
	public String getHours() {
	    return "9am-7pm";
	}
    },

    WINTER(1) {
	@Override
	public String getHours() {
	    return "10am-3pm";
	}
    };

    public static void main(String[] args) {
	var a = Season2.FALL;
	System.out.println(a);
    }

    Season2(int a) {
	System.out.println(a);
    }

    public abstract String getHours();
}