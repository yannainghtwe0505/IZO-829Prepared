package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestLazyEvaluated {
    public static void main(String[] args) {
	var cats = new ArrayList<String>();
	cats.add("Annie");
	cats.add("Ripley");
	var stream = cats.stream();
	cats.add("KC");
	System.out.println(stream.count());
	cats.add("bb");

    }

}
