package ua.mainacademy;

import ua.mainacademy.model.Cart;

public class ApplicationRunner
{
    public static void main( String[] args )
    {
        Cart cart = new Cart();
        cart.setStatus(Cart.Status.OPEN);

    }
}
