package Serie4_Ex3;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Point3D p=new Point3D(3,4,56);
		System.out.println(p.toString());
		
		Forme f = new Forme(p,1);
		System.out.println(f.toString());
		
			Brique b = new Brique(p,1,7.7,5,9,1); 
			System.out.println(b.toString());
		
			Boule bo=new Boule(p,3,4.9);
			System.out.println(bo.toString());
			
			CylindrePlein c = new CylindrePlein(p,1.2,8.9,7);
			System.out.println(c.toString());
			
			Cube cu = new Cube(p,3,77,6,9,2); 
			System.out.println(cu.toString());
			
			DocumentGraphique docs=new DocumentGraphique();
			docs.addForme(b);
			docs.addForme(bo);
			docs.addForme(cu);   
			
			ArrayList<Cube> cub=docs.getAllCubes();
			for(Cube cb:cub)
			{
				System.out.println(cb.toString());
			}
		}
		
   
}


