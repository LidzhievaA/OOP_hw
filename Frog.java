public class Frog extends Reptiles implements SwimSpeed{
    public Frog(String name){
        super(name);
    }

    @Override
    public int getSwimSpeed() {
        return 7;
    }

    @Override
    public String feed() {
        return "насекомые";
    }

    @Override
    public String toString() {
        return String.format("Frog: %s, SwimSpeed: %d, Food: %s ", super.toString(), getSwimSpeed(), feed());
    }

    
}
