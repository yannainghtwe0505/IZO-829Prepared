package Streams;

import java.io.IOException;
import java.util.List;

public class CheckedException {
    public void good() throws IOException {
	create().stream().count();
    }

    private static List<String> create() throws IOException {
	throw new IOException();
    }
    public static void main(String[] args) throws IOException {
	System.out.println(create());
    }
}
