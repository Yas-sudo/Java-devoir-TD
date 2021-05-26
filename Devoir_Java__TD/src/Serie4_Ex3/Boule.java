package Serie4_Ex3;
public class Boule extends Forme {
  private double r;
  
  public Boule(Point3D p, double d,double r)
  {
	  super(p,d);
	  this.r=r;	
  }
  public double getr()
  {
	  return r;
  }
  public void setr(double r)
  {
	  this.r=r;
  }

  @Override
  public String toString() {
		return "Boule :["+super.toString()+ ", rayon" +r+ "]";
	} 
  
  
}
