package Serie4_Ex3;
public class Cube extends Brique{

	public Cube(Point3D p,double d,double r, double h, double larg, double longu)
	  {
		super(p,d, r, h, larg, longu);  
		  this.r=r;	
		  this.h=larg;
		  this.larg=larg;
		  this.longu=larg;
	  }
	
@Override	
public	String  toString()
{
	return "Cube :["+super.toString()+"]";
}
	  
}
