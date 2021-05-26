package Serie4_Ex3;
public class Point3D {
  private  double x,y,z;
  Point3D(double x, double y, double z)  
  {
	   this.x=x;
	   this.y=y;
	   this.z=z;
  }


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Point3D other = (Point3D) obj;
	if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
		return false;
	if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
		return false;
	if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
		return false;
	return true;
}


public String toString() {
	return "Point:[x=" + x + ", y=" + y + ", z=" + z + "]";
}
	
public double getX()
{
	return x;
}
public double getY()
{
	return y;
}	
public double getZ()
{
	return z;
}
 public void setX(double x)
 {
	 this.x=x;
 }

 public void setY(double y)
 {
	 this.y=y;
 }

 public void setZ(double z)
 {
	 this.z=z;
 }

 public void deplacer(double dx, double dy , double dz)
 {
	x=x+dx;
	y=y+dy;
	z=z+dz;
 }

 

	
}
