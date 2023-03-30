package BeyondClasses;

final class sealclasschild extends sealclassParent {
}

public sealed class sealclassParent {
    final class sealedchild {
    }

    public sealed class Snake permits Snake.Cobra {
	final class Cobra extends Snake {
	}
    }
}