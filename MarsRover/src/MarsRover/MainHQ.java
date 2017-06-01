package MarsRover;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deerasha
 */
public class MainHQ {

    public static void main(String[] args) {

        try {
            if (args.length == 0) {
                System.out.println("Enter the input file name as an argument.");
                System.exit(-1);
            } else {
                Scanner fin = new Scanner(new FileReader(args[0]));
                while (fin.hasNextLine()) {
                    int n = fin.nextInt();
                    int m = fin.nextInt();
                    int x = fin.nextInt();
                    int y = fin.nextInt();
                    char r = fin.next().charAt(0);
                    String path = fin.next();
                    //System.out.println("" + n + m + x + y + r + path);
                    Zone zone = new Zone(n, m);
                    Rover rover = new Rover(zone, x, y, r, path);
                    rover.traverse();
                    rover.reportPosition();
                    //zone.print();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainHQ.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Commands file could not be found.");
        }
    }
}//end class
