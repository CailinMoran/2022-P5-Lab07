import java.awt.*;
import java.applet.*;

public class Lab07 extends Applet{
    public void paint(Graphics g) {
        Background.drawWater(g);
        Background.drawSky(g);

        Bubbles.drawBubble1(g);
        Bubbles.drawBubble2(g);
        Bubbles.drawBubble3(g);

        Fish.drawFin(g);
        Fish.drawBody(g);
        Fish.drawHead(g);
        Fish.drawEye(g);
        Fish.drawArmfin(g);
        Fish.drawTopfin(g);
    }
}
