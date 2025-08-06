package real.numbers;

import java.util.Scanner;

public class Console
{
    private static Scanner sc = new Scanner(System.in);
    
    public static String getLine(String prompt)
    {
        System.out.print(prompt);
        String s = sc.nextLine();        // read the whole line
        return s;
    }

    public static String getString(String prompt)
    {
        System.out.print(prompt);
        String s = sc.next();        // read the first string on the line
        sc.nextLine();               // discard the rest of the line
        return s;
    }
    
    
    public static int getInt(String prompt)
    {
        int i = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getRange(String prompt)
    {
        int i = 0;
        boolean isValid = false;
        while (!isValid)
        {
            i = getInt(prompt);
            if (i < 2) {
                System.out.println(
                    "Error! Number must be greater than 2.");
            }          
            else {
                isValid = true;
            }       
        }
        return i;
    }

    

}