package Serie4_Ex3;
public class Brique extends Forme{
	 protected double r;
	 protected double h;
	protected double larg;
	protected double longu;
	  public Brique(Point3D p,double d,double r, double h, double larg, double longu)
	  {
		  super(p,d);
		  this.r=r;	
		  this.h=h;
		  this.larg=larg;
		  this.longu=longu;
	  }
	  public Brique()
	  {
		  
	  }
	  public double getr()
	  {
		  return r;
	  }
	  public double geth()
	  {
		  return h;
	  }
	  public double getlarg()
	  {
		  return larg;
	  }
	  public double getlongu()
	  {
		  return longu;
	  }
	  
	  public void setr(double r)
	  {
		  this.r=r;
	  }
	  public void seth(double h)
	  {
		  this.h=h;
	  }
	  
	  public void setlarg(double larg)
	  {
		  this.larg=larg;
	  }
	  
	  public void setlongu(double longu)
	  {
		  this.longu=longu;
	  }
	  @Override
	  public String toString() {
			return "Brique :["+super.toString()+ ", rayon:" +r+ ", hauteur:" +h+ ", largeur:" +larg+ ", longueur:" +longu+ "]" ; 
		} 
}

