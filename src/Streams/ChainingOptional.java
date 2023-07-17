package Streams;

import java.util.Optional;

public class ChainingOptional {
    public static void main(String[] args) {
	Optional<Integer> result = Optional.empty().map(ChainingOptionals::calculator);
    }
}
