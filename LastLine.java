import org.code.neighborhood.*;
public class LastLine extends Painter {


  public LastLine(int x, int y, String direction, int paint) {
        super(x, y, direction, paint);
    }

   
    public LastLine() {
        super(16, 0, "south", 16); 
    }
  public void paintEdge(String color){
    while (hasPaint()){
      moveFast();
    turnRight();
    turnRight();
    paint("darkRed");
    move();
    paint("darkRed");
    move();
    paint("darkRed");
    move();
    paint("darkRed");
    move();
    paint("darkRed");
    move();
    paint("white");
    move();
    paint("white");
    move();
    paint("white");
    move();
    paint("white");
    move();
    paint("white");
    move();
    paint("white");
    move();
    paint("darkRed");
    move();
    paint("darkRed");
    move();
    paint("darkRed");
    move();
    paint("darkRed");
    move();
    paint("darkRed");
    }
  }
  public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
      }
  public void moveFast() {
        while (canMove()) {
            move();
        }
  }
}