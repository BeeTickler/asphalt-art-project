import org.code.neighborhood.*;
public class PainterPlus extends Painter {


  public PainterPlus(int x, int y, String direction, int paint) {
        super(x, y, direction, paint);
    }

   
    public PainterPlus() {
        super(0, 0, "east", 150); 
    }
    
    public void takeAllPaint() {
        while (isOnBucket()) {
            takePaint();
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
     public void paintToEmpty(String color) {
        while (hasPaint()) {
            paint("white");   
          move();

           }
        }
       public void paintDonut(String color) {
        while (hasPaint()) {
          
          turnRight();
          paint("white");
          move();
          paint("white");
          move();
          
          
          }
       }
      public void paintBoarder(String color) {
    
    while (canMove("east")) {
        paint(color);
        move();
    }
    paint(color); 

    
    turnRight();
    while (canMove("south")) {
        move();
        paint(color);
    }

   
    turnRight();
    while (canMove("west")) {
        move();
        paint(color);
    }

    
    turnRight();
    while (canMove("north")) {
        move();
        paint(color);
    }
      }
    public void moveUpRight() {
    if (canMove("north") && canMove("east")) {
        turnRight();
          move();
          turnRight();
          move();
          
    }
}
    public void moveUpLeft() {
    if (canMove("north") && canMove("west")) {
          turnLeft();
          move();
          turnLeft();
          move();
          
    }
}
    public void moveDownRight() {
    if (canMove("south") && canMove("east")) {
          turnRight();
          move();
          turnRight();
          move();
          turnLeft();
    }
}
    public void moveDownLeft() {
    if (canMove("south") && canMove("west")) {
          turnRight();
          move();
          turnRight();
          move();
    }
}
  public void paintRedRectangle(String color){
    if (canMove()){
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      turnLeft();
      move();
      paint(color);
      turnLeft();
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      
    } 
  }
    public void paintDarkRedLine (String color) {
      if (canMove()){
        turnRight();
        paint(color);
        move();
        paint(color);
        move();
        paint(color);
        move();
        paint(color);
        move();
        paint(color);
      }
    }
  public void shortReset(){
    turnLeft();
    move();
     turnLeft();
    move();
    move();
    move();
    move();
    turnRight();
  }
      public void longReset(){
        turnLeft();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    turnRight();
    move();
      }
    public void moveBottomRow(){
      turnRight();
    move();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
    }
public void paintLine(String color){
    while (canMove()){
        paint(color);
        move();
    }
}
  public void paintRedPart(String color){
    while (hasPaint()){
      paintRedRectangle("red");

    longReset();

    paintDarkRedLine("darkRed");

    shortReset();

    paintRedRectangle("red");

    longReset();

    paintDarkRedLine("darkRed");

    shortReset();
    
    paintRedRectangle("red");

    longReset();

    paintDarkRedLine("darkRed");

    shortReset();

    paintRedRectangle("red");

    longReset();

    moveBottomRow();
    
    paintRedRectangle("red");

    longReset();

    paintDarkRedLine("darkRed");

    shortReset();

    paintRedRectangle("red");

    longReset();

    paintDarkRedLine("darkRed");

    shortReset();
    
    paintRedRectangle("red");

    longReset();

    paintDarkRedLine("darkRed");

    shortReset();

    paintRedRectangle("red");

    longReset();
    
    turnLeft();
    }
  }
  }
    


