package baeldungExample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasTreeImplTest {
    @Test
    public void givenDecoratorPattern_WhenDecoratorsInjectedAtRuntime_thenConfigSuccess() {
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        assertEquals(tree1.decorate(), "Christmas tree with Garland");

        ChristmasTree tree2 = new BubbleLights(new ChristmasTreeImpl());
        assertEquals(tree2.decorate(), "Christmas tree with Bubble Lights");
    }

}