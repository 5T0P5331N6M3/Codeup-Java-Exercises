package javaAssPrep;

import static java.lang.Math.PI;

public class review
{
    public static double circumference(double radius)
    {
        return 2 * (PI * radius);
    }
    public static int circumference(int radius)
    {
        return (int) (2 * (PI * radius));
    }

    public static double total(double bill, double tipPercentage)
    {
        return  bill + ((tipPercentage / 100) * bill);
    }

    public static void even(int[] nums)
    {
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                System.out.println(nums[i]);
            }
        }
    }

}
