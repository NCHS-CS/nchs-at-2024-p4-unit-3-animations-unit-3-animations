import java.awt.Graphics;

/**
 * Technology:
 *    Draw various shapes
 *    Images
 *    RGB
 *    Stack
 *    Fill Algorithm
 *    
 * @author jstride
 *
 */

public class FillPanel extends AnimatedPanel {

	@Override
	public void updateAnimation() {
	}
	
	public FillPanel() {

	}
		
	// do NOT override paint(Graphics g). 
    // Use paintComponent(Graphics g) because...
	// paint(Graphics g) will draw borders and children--to much!
	@Override
	public void paintComponent(Graphics g){  
        super.paintComponent(g);

	}

}
