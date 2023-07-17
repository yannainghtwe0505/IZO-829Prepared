package CollectionAndGenerics;

public class Squirrel {
    private int weight;
    private String species;
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getSpecies() {
        return species;
    }
    
    @Override
    public String toString() {
	return "weight=" + weight + " species=" + species + "]";
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public Squirrel(int weight, String species) {
	super();
	this.weight = weight;
	this.species = species;
    }
    
}
