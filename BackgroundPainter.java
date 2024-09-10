import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus {

  public void paintBackground(String color, int size) {
    while (canMove("south")) {
      paintRow(color, size);
      turnToWest();

      if (canMove("south")) {
        paintRow(color, size);
        turnToEast();
      }
    }

    paintRow(color, size);
    turnAround();
    moveToCorner();
  }
  
  /*
   * Paints a line with the color where the length
   * of the line is specified by spaces
   */
  
  public void paintRow(String color, int spaces) {
    setPaint(spaces);

    while (canMove()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }
    paint(color);
  }

  public void paintLine(String color, int spaces) {
    while (spaces > 0) {
      paint(color);
      move();
      spaces--;
    }
  }
  

  /*
   * Turns the MuralPainter to the next row to
   * face west if it is currently facing east
   */
  
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }

  /*
   * Turns the MuralPainter to the next row to
   * face east if it is currently facing west
   */
  
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }

  /*
   * Turns the MuralPainter around to face the opposite direction
   */
  
  public void turnAround() {
    turnLeft();
    turnLeft();
  }
  
  /*
   * Moves the MuralPainter to the bottom right corner
   */
  
  public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }

  
}

