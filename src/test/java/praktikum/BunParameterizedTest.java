package praktikum;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunParameterizedTest {
    private final String name;
    private final float price;
    private Bun bun;

    public BunParameterizedTest(String name, float price) {
        bun = new Bun(name, price);
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "Булочка: ({0}), Цена: {1}")
    public static Object[] bunData() {
        return new Object[][]{
                {"black bun", 100},
                {"white bun", 200},
                {"red bun", 300},
        };
    }

    @Test
    public void getNameBunTest() {
        String actualName = bun.getName();
        assertEquals("Имя булочки отличается", name, actualName);
    }

    @Test
    public void getPriceBunTest() {
        float actualPrice = bun.getPrice();
        assertEquals("Цена на булочку отличается", price, actualPrice, 0);
    }
}
