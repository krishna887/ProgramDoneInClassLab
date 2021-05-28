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
public interface RegularPolygon {
  public abstract int getNumberSide();
public  abstract int getSideLength();
public  int getPerimeter();
public int getInteriorAngle();
public static int totalSide()

{
    return 3+4;
}}

class EquilateralTriangle implements RegularPolygon{ private final int sidelength;
   public EquilateralTriangle(int sidelength){this.sidelength=sidelength;}
    int getNumberSides(){return 3;}
@Override
   public int getSideLength(){return sidelength;}
@Override
   public  int getPerimeter(){return(getNumberSides()*getSideLength());}
@Override
   public int getInteriorAngle(){return((getNumberSides()-2)*180/getNumberSides());
   }

    @Override
    public int getNumberSide() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 
class Square implements RegularPolygon{private final int sidelength;
public Square( int sidelength){this.sidelength=sidelength;}
 int getNumberSides(){return 4;}
 @Override
   public int getSideLength(){return sidelength;}
@Override
   public  int getPerimeter(){return(getNumberSides()*getSideLength());}
@Override
   public int getInteriorAngle(){return((getNumberSides()-2)*180/getNumberSides());
   }

    @Override
    public int getNumberSide() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

