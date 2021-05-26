package Serie4_Ex3;
import java.util.ArrayList;

public class DocumentGraphique {
	private  ArrayList<Forme> docs;
	
	public DocumentGraphique()
	{ 
		docs=new ArrayList<Forme>();
	}
	
	public void addForme(Forme f)
	{
		docs.add(f);
	}
	
public void removeForme(int p)
{
	docs.remove(p);
}

public ArrayList<Cube> getAllCubes()
{
	ArrayList<Cube> c=new ArrayList<Cube>();
	for(Forme v:docs)
	{
		if(v instanceof Cube)
		{
			c.add((Cube)v);
		}
	}
	return c;
}

}
