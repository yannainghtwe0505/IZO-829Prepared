package LambadasAndFunctionalP;
 interface LearnToSpeak{
	void speak(String sound);
}
public class Duckling {
	public static void teacher(String name,LearnToSpeak l) {
		l.speak(name);
	}
	public static void makeSound(String sound) {
//		LearnToSpeak learner = s -> System.out.println(s);
		LearnToSpeak learner = System.out::println;
		teacher(sound, learner);
	}
	public static void main(String[] args) {
		makeSound("Hi");
		LearnToSpeak learner = System.out::println;
		System.out.println(learner );
	}

}
