package OOP_hw2;
public abstract class Reptiles {
    protected String name;

    public Reptiles(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Name: %s", name);
    }
    
    public abstract String feed();
    
}
