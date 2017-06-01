package MarsRover;

/**
 *
 * @author Deerasha
 */
public class Rover {

    Zone zone;
    int movX;
    int movY;
    char cardinalPoint;
    String path;

    Rover(Zone zone, int x, int y, char cardinalPoint, String path) {
        //feature envy here... refactor
        this.zone = zone;
        this.zone.clear();
        this.zone.visit(x, y);
        this.cardinalPoint = cardinalPoint;
        rotate(); //point Rover in starting direction
        this.path = path;
    }

    /**
     * Selects the correct transform to move Rover on x and y axes.
     *
     */
    void rotate() {
        switch (cardinalPoint) {
            case 'E':
                movX = 1;
                movY = 0;
                break;
            case 'N':
                movX = 0;
                movY = 1;
                break;
            case 'W':
                movX = -1;
                movY = 0;
                break;
            case 'S':
                movX = 0;
                movY = -1;
                break;

        }
    }

    /**
     * Passes transform to the zone to be applied.
     */
    void move() {
        zone.visit(movX, movY);
    }

    //uses path to walk the given commands
    void traverse() {
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'M') { //a move
                move();
            } else { //rotation
                if (path.charAt(i) == 'L') {
                    turnLeft();
                } else {// 'R'
                    turnRight();
                }
                rotate();
            }
        }
    }

    void turnLeft() {
        switch (cardinalPoint) {
            case 'E':
                cardinalPoint = 'N';
                break;
            case 'N':
                cardinalPoint = 'W';
                break;
            case 'W':
                cardinalPoint = 'S';
                break;
            case 'S':
                cardinalPoint = 'E';
                break;
        }
    }

    void turnRight() {
        switch (cardinalPoint) {
            case 'E':
                cardinalPoint = 'S';
                break;
            case 'S':
                cardinalPoint = 'W';
                break;
            case 'W':
                cardinalPoint = 'N';
                break;
            case 'N':
                cardinalPoint = 'E';
                break;
        }
    }

    void reportPosition() {
        System.out.println(""+zone.currX+" " + zone.currY+" " + cardinalPoint);
    }

}//end class
