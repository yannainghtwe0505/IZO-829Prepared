package BeyondClasses;

import java.util.ArrayList;
import java.util.List;

class Leopard implements Walk {
    public List move() { // X
	return null;
    }
}

class Panther implements Run {
public move() { // Z
return null;
}
}

interface Run extends Walk {
    public ArrayList move();
}

interface Walk {
    private static List move() {
	return null;
    }
}