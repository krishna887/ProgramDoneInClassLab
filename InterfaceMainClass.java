/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.labtask;

/**
 *
 * @author pavilion
 */
public class InterfaceMainClass {
    public static void main(String[] args) { 
       EquilateralTriangle obj = new EquilateralTriangle(3);
        System.out.println("the perim of eq triangle is"+obj.getPerimeter());
        System.out.println("the side of equilateral triangle is "+obj.getNumberSides());
        System.out.println("the interior angle of eq triangle is"+obj.getInteriorAngle());
        Square obj1=new Square(4);
        System.out.println("sides of square is"+obj1.getNumberSides());
                System.out.println("perimeter of square is"+obj1.getPerimeter());
                System.out.println("interior angle of square is"+obj1.getInteriorAngle());
                RegularPolygon.totalSide();
            
        
    }
    
}
