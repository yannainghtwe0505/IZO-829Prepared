package BeyondClasses;

public class Deer {
    protected static class Diet {
	private Food getFavorite() {
	    return Food.BERRIES;
	}
    }

    enum Food {
	APPLES, BERRIES, GRASS
    }

    public static void main(String[] seasons) {
	System.out.print(switch (new Diet().getFavorite()) {
	case APPLES -> "a";
	case BERRIES -> "b";
	default -> "c";
	});
    }
}