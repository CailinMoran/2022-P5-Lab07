import java.awt.*;
import java.applet.*;

public class Background {

    public static void drawWater(Graphics g){

        g.setColor(Color.blue);
        g.fillRect(0,100,999,649);
    }

    public static void drawSky(Graphics g){

        g.setColor(new Color(139,200,240));
        g.fillRect(0,0,999,100);

    }
}
