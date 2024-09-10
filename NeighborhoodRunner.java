import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

  // Instantiates BackgroundPainter
  BackgroundPainter bp = new BackgroundPainter();

    // Painter paints background white
    bp.paintBackground("white", 32);

  // Instantiates SpidermanPainter
  SpidermanPainter sp = new SpidermanPainter();

    // Painter paints Spiderman
    sp.paintSpiderman();
    
  }
}