public class Main {
    public static void main(String[] args) {
        Reptiles snake = new Snake("Змей");
        Reptiles frog = new Frog("Квакша");

        Terrarium terrarium = new Terrarium();
        terrarium.addAnimal(snake).addAnimal(frog);

        System.out.println(terrarium);

        for (SwimSpeed swimmer : terrarium.swimmers()) {
            System.out.println(swimmer);
        }

        System.out.println("--Swimmer-champion--");
        System.out.println(terrarium.getSwimmerChampion());
    }
}
