import static org.junit.Assert.*;

public class ShoppingCartTest {

    @org.junit.Test
    public void getTotalPriceReturnCorrectValue() {
        // AAA
        // Arrange
        Item[] items = {
                new Item(10),
                new Item(5)
        };
        ShoppingCart cart = new ShoppingCart(items);
        int expectedTotalPrice = 1000;

        // Act
        int actualTotalPrice = cart.getTotalPrice();

        // Assert

        assertEquals("Total price is incorrect", expectedTotalPrice, actualTotalPrice);


    }
}