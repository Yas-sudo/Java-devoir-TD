package Serie4_Ex3;
public class CylindrePlein extends Forme{
	 private double r;
	 private double h;
	  
	  public CylindrePlein(Point3D p,double d,double r, double h)
	  {
		  super(p,d);
		  this.r=r;	
		  this.h=h;
	  }
	  public double getr()
	  {
		  return r;
	  }
	  public double geth()
	  {
		  return h;
	  }
	  public void setr(double r)
	  {
		  this.r=r;
	  }
	  public void seth(double h)
	  {
		  this.h=h;
	  } 
	  @Override
	  public String toString() {
			return "CylindrePlein :["+super.toString()+ ", rayon:" +r+ ", hauteur:" +h+ "]" ; 
		} 
	  
	  
	  

}
