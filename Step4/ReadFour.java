package Step4;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            // Print out a running total of all the
            // values in the input file.
            try {
                //Create scanner and select input path
                Scanner fileIn = new Scanner(new File("Step4/input.txt"));
                //Create file to write into
                PrintWriter fileOut = new PrintWriter(new File("Step4/output.txt"));

                int sum = 0;
                //Read and write the total
                while (fileIn.hasNext()) {
                    String lineIn = fileIn.nextLine();

                    sum += Integer.parseInt(lineIn);

                    fileOut.println("Running total = " + sum);
                }
                fileOut.close();
            }
            catch (IOException e){
                System.out.println("File not found, try again Corinne.");
        }
    }
}
