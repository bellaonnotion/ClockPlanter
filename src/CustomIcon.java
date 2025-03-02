package src;
import becker.robots.icons.Icon;
import java.awt.*;

public class CustomIcon extends Icon {
    private final int width = 30;  // Set custom icon width
    private final int height = 30; // Set custom icon height

    
    public int getIconWidth() {
        return width;
    }

    
    public int getIconHeight() {
        return height;
    }

    
    protected void paintIcon(Graphics g) {
        g.setColor(Color.RED);  // Set drawing color to red
        g.fillOval(0, 0, width, height);  // Draw a red circle
    }
}
