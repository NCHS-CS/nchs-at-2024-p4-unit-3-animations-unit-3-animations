
/*
 * Concepts needed:
 *  - paintComponent @Override
 *  - gravity
 *  - OOP using Ball object
 *  - Color, clearRect, setColor, drawLine
 */
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;

/* 
 IS-A:  AnimatedPanel
 HAS-A: 
    - floor
    - Collection of Balls

 DOES:
    - Knows about Balls and asks them to move & draw themselves
    - Deals with click events
*/
public class BallPanel extends AnimatedPanel {

    private List<Ball> balls = new ArrayList<>();
    private static final int FLOOR = Main.HEIGHT - 100;

    @Override
    public void updateAnimation() {
        moveBalls();
    }

    public BallPanel() {
        addEventHandlers();
        createBalls();
    }

    /*
     * Create the initial number of balls on our panel
     */
    private void createBalls() {
        for (int count = 0; count < 4; count++) {
            addBall();
        }
    }

    /*
     * This method will create a single ball and add it to our list.
     * Add the ball relatively high on the screen
     */
    public void addBall() {
        // TODO: create a ball

        // we add it to our list
        // balls.add(ball);
    }

    private void addEventHandlers() {
        // a mouse listener requires a full interface with lots of methods.
        // to get around having implement all, we use the MouseAdapter class
        // and override just the one method we're interested in.

        // TODO: Hook up the mousePressed event to call onMouseClicked
        // using an inline/inner anonymous class
    }

    /**
     * The method that gets called when the user clicks the mouse.
     * This will add the piece, update the local board and UI.
     * 
     * @param me The MouseEvent data structure provided by the event.
     */
    private void onMouseClicked(MouseEvent me) {
        // TODO: get the coordinates of the click event.
        int x = 0;
        int y = 0;
        System.out.printf("Mouse Clicked at (%d, %d)\n", x, y);
        // TODO: Do something else creative with click events
    }

    public void moveBalls() {
        //System.out.println("move balls");
        // TODO: Move all the balls
    }

    // do NOT override paint(Graphics g).
    // Use paintComponent(Graphics g) because...
    // paint(Graphics g) will draw borders and children--too much!
    //
    // Question: What does this @Override do?
    // A:
    @Override
    public void paintComponent(Graphics g) {
        // Always call our superclass implementation first
        super.paintComponent(g);

        // BEFORE we work on the below TODOs, just draw stuff
        // using the Graphics object.

        // TODO: set the background color on the JPanel to White

        // TODO: Use the Graphics object to clear the whole panel/canvas,
        // set the pen color, and draw our floor

        // TODO: Draw stuff (such as all the balls)

    }
}
