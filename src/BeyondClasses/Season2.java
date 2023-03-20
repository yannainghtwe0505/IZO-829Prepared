package BeyondClasses;

public enum Season2 {
    FALL {
	@Override
	public String getHours() {
	    return "9am-5pm";
	}
    },
    SPRING {
	@Override
	public String getHours() {
	    return "9am-5pm";
	}
    },
    SUMMER {
	@Override
	public String getHours() {
	    return "9am-7pm";
	}
    },

    WINTER {
	@Override
	public String getHours() {
	    return "10am-3pm";
	}
    };

    public abstract String getHours();
}