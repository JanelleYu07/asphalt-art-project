import org.code.neighborhood.*;

public class SpidermanPainter extends BackgroundPainter {

/*
*  Painter paints Spiderman face and body
*/
  
  public void paintSpiderman() {
    paintFace();
    paintBody();
    
    if (isFacingWest()) {
      turnAround();
      moveToCorner();
    } // End of if statement
      
    else {
    moveToCorner();
     } // End of else statement
    
    } // End of paintSpiderman method
 
  /*
  * Painter paints Spiderman face
  */
  
  public void paintFace() {
    
    /*
    * Painter moves to the beginning of the face
    */
    
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
    turnRight();
    move();
    move();
    move();
    move();
    turnLeft(); 

    // Painter paints 1st row of face
   paintLine("black", 7);

    
    // Painter paints 2nd row of face
    turnToWest();
    paint("black");
    move();
    paintLine("red",7);
    paint("black");
    move();

    // Painter paints 3rd row of face
    turnToEast();
    paint("black");
    move();
    paintLine("red",9);
    paint("black");
    move();

    // Painter paints 4th row of face
    turnToWest();
    paint("black");
    move();
    paintLine("red", 11);
    paint("black");
    move();

    // Painter paints 5th row of face
    turnToEast();
    paint("black");
    move();
    paint("red");
    move();
    paintLine("black", 2);
    paintLine("red",7);
    paintLine("black", 2);
    paint("red");
    move();
    paint("black");

    // Painter paints 6th row of race
    turnToWest();
    paintLine("black", 2);
    paintLine("white",2);
    paint("black");
    move();
    paintLine("red", 5);
    paint("black");
    move();
    paintLine("white", 2);
    paint("black");
    move();
    paint("black");

    // Painter paints 7th row of face
    turnToEast();
    paint("black");
    move();
    paintLine("white", 4);
    paint("black");
    move();
    paintLine("red", 3);
    paint("black");
    move();
    paintLine("white", 4);
    paint("black");
    
    // Painter painter 8th row of face
    turnToWest();
    paint("black");
    move();
    paintLine("white", 5);
    paint("black");
    move();
    paint("red");
    move();
    paint("black");
    move();
    paintLine("white", 5);
    paint("black");

    // Painter paints 9th row of face
    turnToEast();
    paint("black");
    move();
    paintLine("white", 6);
    paint("black");
    move();
    paintLine("white", 6);
    paint("black");

    // Painter paints 10th row of face
    turnToWest();
    paint("black");
    move();
    paintLine("white", 6);
    paint("black");
    move();
    paintLine("white", 6);
    paint("black");

    // Painter paints 11th row of face
    turnToEast();
    move();
    paintLine("black", 2);
    paintLine("white", 3);
    paint("black");
    move();
    paint("red");
    move();
    paint("black");
    move();
    paintLine("white", 3);
    paint("black");
    move();
    paint("black");

    // Painter paints 12th of face
    turnToWest();
    paint("black");
    move();
    paint("red");
    move();
    paintLine("black", 3);
    paintLine("red", 3);
    paintLine("black", 3);
    paint("red");
    move();
    paint("black");

    // Painter paints 13th row of face 
    turnToEast();
    move();
    paint("black");
    move();
    paintLine("red", 9);
    paint("black");



    // Painter paints 14th row of face
    turnToWest();
    move();
    paintLine("black", 2);
    paintLine("red", 5);
    paint("black");
    move();
    paint("black");

    // Painter paints 15th row of face
    turnToEast();
    move();
    move();
    paintLine("black", 4);
    paint("black");
  } // End of paintFace


  /*
  *  Painter paints body of Spiderman
  */
  
  public void paintBody() {

    // Paints 1st row of body 
    move();
    paintLine("red", 2);
    paint("black");
    turnAround();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paintLine("red", 2);
    paint("black");
    move();

    // Paints 2nd row of body
    turnToEast();
    paint("black");
    move();
    paintLine("red", 5);
    paint("black");
    move();
    paintLine("red", 5);
    paint("black");

    // Paints 3rd row of body
    move();
    turnToWest();
    paint("black");
    move();    
    paintLine("blue", 2);
    paint("black");
    move();        
    paint("blue");
    move();    
    paint("red");
    move();   
    paintLine("black", 3);
    paint("red");
    move();   
    paint("blue");
    move();   
    paint("black");
    move();   
    paintLine("blue", 2);
    paint("black"); 
    move();

    // Paints 4th row of body
    turnToEast();
    paint("black"); 
    move();
    paintLine("red", 2);
    paint("blue");
    move();
    paint("black");
    move();
    paint("blue");
    move();
    paint("black");
    move();
    paint("red");
    move();
    paint("black");
    move();
    paint("red");
    move();
    paint("black");
    move();
    paint("blue");
    move();
    paint("black");
    move();
    paint("blue");
    move();
    paintLine("red", 2);
    paint("black");

    // Paints 5th row of body
    turnToWest();
    paint("black");
    move();
    paintLine("red", 2);
    paintLine("black", 2);
    paintLine("red", 7);
    paintLine("black", 2);
    paintLine("red", 2);
    paint("black");

    // Paints 6th row of body
    turnToEast();
    move();
    paintLine("black", 2);
    paint("white");
    move(); 
    paint("black"); 
    move();
    paintLine("blue", 7);
    paint("black");
    move();
    paint("white");
    move();
    paintLine("black", 2);

    // Paints 7th row of body
    turnToWest();
    move();
    move(); 
    move();
    paint("black");
    move();
    paintLine("blue", 9);
    paint("black");
    

    // Paints 8th row of body
    turnToEast();
    paint("black");
    move();
    paintLine("blue", 3);
    paintLine("black", 3);
    paintLine("blue", 3);
    paint("black");

    // Paints 9th row of body
    move();
    turnToWest();
    paintLine("black", 2);
    paintLine("red", 2);
    paint("black");
    move();
    move();
    move();
    move();
    paint("black");
    move();
    paintLine("red", 2);
    paintLine("black", 1);
    paint("black");

    // Paints 10th row of body
    turnToEast();
    paintLine("black", 1);
    paintLine("red", 3);
    paint("black");
    move();
    move();
    move();
    move();
    paintLine("black", 1);
    paintLine("red", 3);
    paint("black");
    
    // Paints 11th row of body
    turnToWest();
    paintLine("black", 5);
    move();
    move();
    move();
    paintLine("black", 5);

    
  } // End of paintBody
  
}