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

        g.setColor(new Color(250,123,63));
        g.fillOval(300,275,225,175);


    }

    public static void drawHead(Graphics g){
        g.setColor(Color.red);
        g.fillOval(300,300,90,126);


    }

    public static void drawEye(Graphics g){
        g.setColor(Color.black);
        g.fillOval(350,350,25,25);

    }

    public static void drawArmfin(Graphics g){
        Polygon tria=new Polygon();
        tria.addPoint(475,375);
        tria.addPoint(475,400);
        tria.addPoint(425,375);
        g.setColor(Color.red);
        g.fillPolygon(tria);
    }

    public static void drawTopfin(Graphics g){
        Polygon tri=new Polygon();
        tri.addPoint(395,275);
        tri.addPoint(475,250);
        tri.addPoint(475,290);
        g.setColor(Color.red);
        g.fillPolygon(tri);


    }

}

