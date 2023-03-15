package Method;

public class ZooTickets {
    public static void main(String[] args) {
	int tickets = 2; // tickets = 2
	String guests = "abc"; // guests = abc
	addTickets(tickets); // tickets = 2
	String guests2 = addGuests(guests); // guests = abcd
	System.out.println(tickets + guests2); // 2abcd
	System.out.println(addTickets(tickets));
    }

    public static int addTickets(int tickets) {
	tickets++;
	return tickets;
    }

    public static String addGuests(String guests) {
	guests += "d";
	return guests;
    }
}