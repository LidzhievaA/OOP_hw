public class Snake extends Reptiles implements SwimSpeed{
    public Snake(String name){
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Snake: %s, SwimSpeed: %d, Food: %s ", super.toString(), getSwimSpeed(), feed());
    }

    @Override
    public int getSwimSpeed() {
       return 5;
    }

    @Override
    public String feed() {
        return "Мышь";
    }
   
}
