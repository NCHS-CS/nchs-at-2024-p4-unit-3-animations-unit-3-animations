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

	private int x;
    private int y;
    private int yVelocity;
    private int floor;
    private int size;
    private Color color;

    // Allow an external entity to change our global gravity
	public static int gravity = -3;

    /*
    * Create a Ball with these values
    */
	public Ball(int x, int y, int size, int floor, Color color) {
		this.x = x;
        this.y = y;
        this.size = size;
        this.floor = floor;
        this.yVelocity = 0;
        this.color = color;
	}
	
	public boolean inside(int x, int y) {
		if ((x >= this.x && x <= this.x+size)
            &&

        }
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
		yVelocity -= gravity;
        y += yVelocity;

        if (y + size > floor) {
            y = floor - size;
            yVelocity *= -1;
        }
    }

    /*
    * Draws the ball using the Graphics object.
    */
	public void draw(Graphics g) {
        // consider drawing it a random color each time to illustrate some animation
        // using AnimatedPanel::getRandColor
        g.setColor(this.color);
        g.fillOval(this.x, this.y, size, size);
	}
	
}
