import java.awt.Color;
import java.awt.Graphics;

/* 
 IS-A:  Object (no parent)
 HAS-A: 
    - (x,y) Coordinate
    - vertical velocity
    - understanding of where the floor is
    - a size (diameter)
    - color
    - STATIC gravity force acting on it
 DOES:
    - Draws itself
    - Moves itself according to gravity
    - Can tell if (x,y) is inside the ball (for clicking)
*/
public class Ball {

	// Add private instance fields here

    // Allow an external entity to change our global gravity
	public static int gravity = -3;

    /*
    * Create a Ball with these values
    */
	public Ball(int x, int y, int size, int floor, Color color) {
		// TODO: Not Yet Implemented
	}
	
	public boolean inside(int x, int y) {
		// TODO: Not Yet Implemented
        return false;
	}

    /*
    * Update the vertical velocity according to gravity
    * Updates the (x, y) coordinate given its velocity
    *    Assures that it stays above the floor
    *    Bounces off the floor if it hits the floor 
    * 
    */
	public void move() {
		// TODO: Not Yet Implemented
	}

    /*
    * Draws the ball using the Graphics object.
    */
	public void draw(Graphics g) {
		// TODO: Not Yet Implemented
        // consider drawing it a random color each time to illustrate some animation
        // using AnimatedPanel::getRandColor
	}
	
}
