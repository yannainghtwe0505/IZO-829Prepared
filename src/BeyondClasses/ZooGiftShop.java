package BeyondClasses;

class bb {
}

public class ZooGiftShop {
    interface SaleTodayOnly {
	int a = 50;

	int bool();

	int dollarsOff();

    }

    static int a = 40;

    public static int admission(int basePrice) {
	var b = new bb() {
	};
	int a = 40;
	SaleTodayOnly sale = new SaleTodayOnly() {
	    @Override
	    public int bool() {
		// TODO Auto-generated method stub
		return 100;
	    }

	    @Override
	    public int dollarsOff() {
		return 200;
	    }
	};
	System.out.println(sale);
	return basePrice - sale.dollarsOff();
    }

    public static void main(String[] args) {

	var a = ZooGiftShop.admission(30);
	System.out.println(a);
    }
}