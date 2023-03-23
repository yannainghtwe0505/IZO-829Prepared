package BeyondClasses;

//Classes permitted to implement sealed interface
final class Duck implements sealedInterface {
}

//Interface permitted to extend sealed interface
non-sealed interface Floats extends sealedInterface {
}

public sealed interface sealedInterface permits Duck, Swan, Floats {
}

final class Swan implements sealedInterface {
}