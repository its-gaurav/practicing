package builder;

public class Main {
    public static void main(String[] args) {
        House h1 = new House
                .Builder()
                .buildFoundation("Concrete")
                .buildStructure("Wood and Brick")
                .buildRoof("Tiles")
                .buildInterior("modern")
                .build();

        System.out.println("House ::"+h1);


    }
}
