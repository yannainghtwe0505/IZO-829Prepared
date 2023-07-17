package BeyondClasses;

sealed class Bird {
    public final class Flamingo extends Bird {
    }
}

final class EmperorTamarin extends Monkey {
}

sealed class Friendly extends Mandrill permits Silly {
}

non-sealed class Mandrill extends Monkey {
}

sealed class Monkey {
}

class Sealed {

}

final class Silly {
}