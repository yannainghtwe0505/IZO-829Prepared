package DecisionMaking;

public class test8 {
    public static void main(String[] args) {
        int penguin = 50, turtle = 75;
         boolean older = penguin >= turtle;
         if (older = true) System.out.println("Success");
         else System.out.println("Failure");
         else if(penguin != 50) System.out.println("Other");

    }

    void findZookeeper(Long id) {
         System.out.print(switch(id) {
         case 10 -> {"Jane"}
         case 20 -> {yield "Lisa";};
         case 30 -> "Kelly";
         case 30 -> "Sarah";
         default -> "Unassigned";
         });
         }

}
