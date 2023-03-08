package DecisionMaking;

public class test8 {
    public static void main(String[] args) {

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
