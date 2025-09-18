import org.code.neighborhood.*;

public class PainterTNT extends Painter {

  public PainterTNT(int x, int y, String direction, int paint) {
        super(x, y, direction, paint);
    }

  public PainterTNT() {
        super(0, 0, "east", 90); 
    }

  public void paintTNT(String color){
    while (hasPaint()){
       paintLine("white");

    turnRight();

    paint("white");
    move();
    turnRight();
    paint("white");
    move();
    paint("white");
    move();
    paint("white");
    move();
    paint("black");
    move();
    paint("white");
    move();
    paint("white");
    move();
    paint("black");
    move();
    paint("white");
    move();
    paint("white");
    move();
    paint("black");
    move();
    paint("white");
    move();
    paint("white");
    move();
    paint("black");
    move();
    paint("white");
    move();
    paint("white");
    
    turnLeft();
    move();
    turnLeft();
    paint("white");
    move();
    paint("white");
    move();
    paint("black");
    move();
    paint("white");
    move();
    paint("white");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("white");
    move();
    paint("black");
    move();
    paint("white");
    move();
    paint("white");
    move();
    paint("black");
    move();
    paint("white");
    move();
    paint("white");
    move();
    paint("white");

    turnRight();
    move();
    turnRight();
    paint("white");
    move();
    paint("white");
    move();
    paint("white");
    move();
    paint("black");
    move();
    paint("white");
    move();
    paint("white");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("white");
    move();
    paint("black");
    move();
    paint("white");
    move();
    paint("white");
    move();
    paint("black");
    move();
    paint("white");
    move();
    paint("white");

    turnLeft();
    move();
    turnLeft();
    paint("white");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("white");
    move();
    paint("black");
    move();
    paint("white");
    move();
    paint("white");
    move();
    paint("black");
    move();
    paint("white");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("white");
    move();
    paint("white");

    turnRight();
    move();
    turnRight();
    paintLine("white");
    }
  }
      public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
      }

  public void paintLine(String color){
    while (canMove()){
        paint(color);
        move();
    }
}
  }
