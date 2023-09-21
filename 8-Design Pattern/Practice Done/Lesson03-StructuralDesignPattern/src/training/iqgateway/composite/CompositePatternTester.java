/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.composite;

/**
 *
 * @author pavankumar.boyapati
 */
public class CompositePatternTester {
    
    public static void main(String[] args) {
        Shape triangleShape1 = new Triangle();
        Shape triangleShape2 = new Triangle();
        
        Circle circleShape1 = new Circle();
         Circle circleShape2 = new Circle();
    
         Drawing drawingRef = new Drawing();
         drawingRef.add(triangleShape1);
         drawingRef.add(triangleShape2);
         drawingRef.add(circleShape1);
         drawingRef.add(circleShape2);
         drawingRef.draw("Blue");
         
         drawingRef.clear();
         
         drawingRef.add(triangleShape1);
         drawingRef.add(triangleShape2);
         drawingRef.add(circleShape1);
         drawingRef.add(circleShape2);
         drawingRef.draw("Green");
         
         
         
         
    
    
    }
}
