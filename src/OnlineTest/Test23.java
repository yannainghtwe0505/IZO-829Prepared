package OnlineTest;

public class Test23 {

    public static void main(String[] args) {
        /* INSERT */
        // Print obj=s->System.out.print()
        Print obj = new Print() {

            @Override
            void show(String s) {
                // TODO Auto-generated method stub

            }
        };
        obj.show("The Certification Guide");
    }

}
// Reference variable to which lambda expression is assigned is known as target type. Target type can be a static variable, instance variable, local variable,
// method parameter or return type. Lambda expression doesn't work without target type and target type must be a functional interface. Functional interface was
// added in JDK 8 and it contains one non-overriding abstract method.
//
// Lambda expression cannot be used in this case because Print is abstract class.}