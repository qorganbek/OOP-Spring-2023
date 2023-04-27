package com.example.test;

import com.example.domain.ShoppingCart;
import com.example.domain.Item;
import java.io.*;
import java.text.NumberFormat;
import java.util.List;

public class DeserializeTest {

    public static void main(String[] args) {
        String directory = "C:\\study\\Spring2023\\OOP\\";
        String cartId = null;
        System.out.println("Enter the ID of the cart file to deserialize or q exit.");
        // Wrap the System.in InputStream with a BufferedReader to read
        // each line from the keyboard.
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            cartId = in.readLine();
            if (cartId.equals("q")) {
                System.exit(0);
            }
        } catch (IOException e) { // Catch any IO exceptions.
            System.out.println("Exception: " + e);
            System.exit(-1);
        }

        // Attempt to open the file and deserialize it into an object
        String cartFile = directory + "cart" + cartId + ".ser";
        ShoppingCart cart = null;
        // Your code goes here....
        try (FileInputStream fis = new FileInputStream(cartFile);
             ObjectInputStream in = new ObjectInputStream(fis)){
            cart = (ShoppingCart)in.readObject();
        } catch (final ClassNotFoundException | IOException e){
            System.out.println("Exception deserializing " + cartFile + e);
            System.exit(-1);
        }
        System.out.println("Successfully deserializing shopping cart with ID: " + cart.getCartID());


        System.out.println("Shopping cart contains: ");
        List<Item> cartContains = cart.getItems();
        for (Item i : cartContains){
            System.out.println(i);
        }
        System.out.println("Shopping cart total: " + NumberFormat.getCurrencyInstance().format(cart.getCartTotal()));
    }
}