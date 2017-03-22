import java.util.Scanner;

/**
 * Created by tkanchanawanchai6403 on 3/22/2017.
 */
public class Main {
    public static void main(String [] args) {
        double area =0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of the points ");
        int numPoints = keyboard.nextInt();

        System.out.println("Enter the coordinates of the points ");
        String coord = keyboard.nextLine();

        String [] set = coord.split(" ");

        //create x (even index) and y (odd index) arrays
        //convert to double

        //find area of polygon
        double firstPart;
        double secondPart;
        for(int i=0; i<numPoints; i++) {
            if(i!=numPoints) {
                firstPart+= (x[i]*y[i+1]);
                secondPart+= (y[i]*x[i+1]);
            } else {
                firstPart+= (x[i]*y[0]);
                secondPart+= (y[i]*x[0]);
            }
        }
        area = (firstPart-secondPart)/2;


        System.out.println("The total area is " + area);

    }
}
