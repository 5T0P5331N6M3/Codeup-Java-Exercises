package javaAssPrep.carShop;

import javaAssPrep.Describable;

public class Customer implements Describable
{
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String describe(String firstName, String lastName, String make, String model, String color, int year)
    {
        return String.format("Hey there %s %s, it looks like your %s, %d, %s, %s is ready to go!", firstName, lastName, color, year, make, model);
    }
}
