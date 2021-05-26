package Serie4_Ex3;
public class Forme {
	protected Point3D  p;
	protected double d;
	
	//constructeur

	public Forme(Point3D p, double d) {
		this.p=p;
		this.d = d;
	}
	public Forme()
	{
		
	}

 public void setP(Point3D p)
 {
	 this.p=p;
 }
	
 public void setd(double d)
 {
	 this.d=d;
 }	

 public double getd()
 {
	 return d;
 }

 public Point3D getp()
 {
	 return p;
 }

 
 
 public void deplacer(double a, double b, double c) 
 { 
	 p.deplacer(a,b,c);	 
 }
 
@Override
public String  toString() 
{
	return "Forme: ["+p.toString()+ "Densité="+d+ "]";
}
 


 

}
