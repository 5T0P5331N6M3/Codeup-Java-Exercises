package javaAssPrep;

import javaAssPrep.carShop.Car;
import javaAssPrep.carShop.Customer;

public class DealershipApp
{
    public static void main(String[] args)
    {
        Customer bob = new Customer("Casanova", "Ugly");
        Car kia = new Car("EV6", "Kia", "Glacier", 2022);

        System.out.println(bob.describe(bob.getFirstName(), bob.getLastName(), kia.getMake(), kia.getModel(), kia.getColor(), kia.getYear()));
    }
}
