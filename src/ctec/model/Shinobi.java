package ctec.model;

public class Shinobi extends Ninja
{
	public Shinobi()
	{
		super();
	}
	
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if(compared instanceof Ninja)
		{
			if(this.getShurikenNum() > ((Ninja) compared).getShurikenNum())
			{
				comparedValue = 1;
			}
			else if(this.getShurikenNum() < ((Ninja) compared).getShurikenNum())
			{
				comparedValue = -1;
			}
			else
			{
				comparedValue = 0;
			}
		}
		
		return comparedValue;
	}

}
