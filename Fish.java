import java.awt.*;
import java.applet.*;

public class Fish{
    public static void drawFin(Graphics g){
        Polygon tri=new Polygon();
        tri.addPoint(575,275);
        tri.addPoint(525,350);
        tri.addPoint(575,425);
        g.setColor(Color.red);
        g.fillPolygon(tri);
    }

    public static void drawBody(Graphics g){

        g.setColor(Color.yellow);
        g.fillOval(300,275,225,175);


    }

    public static void drawHead(Graphics g){
        g.setColor(Color.red);
        g.fillOval(280,289,90,156);


    }

    public static void drawEye(Graphics g){


    }
}

