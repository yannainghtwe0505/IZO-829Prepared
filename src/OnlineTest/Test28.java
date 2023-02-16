package OnlineTest;

class Country {
    public void name() {
        System.out.println("Country");
    }
}

class State extends Country {
    @Override
    public void name() {
        System.out.println("State");
    }
}

class County extends State {
    @Override
    public void name() {
        /* INSERT HERE */
        super.name();
    }
}

public class Test28 {
    public static void main(String[] args) {
        Country country = new County();
        country.name();
    }
}