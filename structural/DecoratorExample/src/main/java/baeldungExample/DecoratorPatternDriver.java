package baeldungExample;

public class DecoratorPatternDriver {

    public static void main(String[] args) {

        //CrhistmasTree with one garland
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        System.out.println("tree1.decorate(): "+ tree1.decorate());

        // christmas tree with two Garlands and one Bubble lights
        ChristmasTree tree2 = new BubbleLights(new Garland(new Garland((new ChristmasTreeImpl()))));
        System.out.println("tree2.decorate(): "+ tree2.decorate());
    }
}
