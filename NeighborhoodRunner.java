import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

PainterPlus e = new PainterPlus(0, 0, "east", 150);

PainterTNT f = new PainterTNT(14,10,"west",90);

LastLine g = new LastLine(15,0,"south",16);
    // paints the top and bottom part of the TNT 
    e.paintRedPart("red");
    // paints the middle part of the TNT
    f.paintTNT("white");
    // paint the 16th colum of the grid
    g.paintEdge("red");
  }
}