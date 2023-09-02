import java.io.*;

/**
 *<h1>Add Two Numbers!</h1> 
 * The AddNum program implements an application that
 * simply adds two given integer numbers and Prints
 * the output on the scareen
 * <p>
 * <b>Note:</b>Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 * 
 * @author claudia
 * @version 1.0
 * @since 2023-09-02
 */

public class AddNum{
    /**
     * This method is used to add two integers. This is
     * a the simplest form of a class method,just to
     * show the usage of various javadoc Tgas.
     * @param numA This is the first paramter to addNm method
     * @param numB This is the second parameter to addNum method
     * @return int This returns sum of numA and numb.
     */
    public int addNum(int numA,int numB){
        return numA +numB;
    }
    /**
 * This is the main method which makes use of addNum method.
 * @param args Unsed.
     * @throws java.io.IOException
 * @excaption IOException On input error
 * @see IOException
 */

public static void main(String[] args) throws IOException {
        AddNum obj = new AddNum();
        int sum = obj.addNum(10, 20);
   
        System.out.println("Sum of 10 and 20 is: " + sum);
    }

}
