package CollectionAndGenerics;

import javax.security.auth.login.CredentialException;

public class Crate<T> {
    private T contents;
    public T lookInCrate() {
	return contents;
    }
    public void packCrate(T contents) {
	this.contents=contents;
    }
    public static void main(String[] args) {
	Elephant elephant=new Elephant();
	Crate<Elephant> crateElephant=new Crate<>();
	crateElephant.packCrate(elephant);
	Elephant inNewHome=crateElephant.lookInCrate();
    }
}
class Elephant{
    
}