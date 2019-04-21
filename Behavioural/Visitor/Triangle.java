/**
 * A Triangle shape - a concrete "Element" implementation.
 * Maintains information about a triangle that can be used by a visitor
 * to do various calculations.
 * @author Samuel Freeman
 */
public class Triangle implements Shape {
   double[] sideLengths = new double[3];
   double base, height;

   public Triangle(double[] sideLengths, double base, double height) {
       this.sideLengths = sideLengths;
       this.base = base;
       this.height = height;
   }

   public void accept(Visitor v) {
       v.visit(this);
   }
    
}
