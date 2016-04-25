package ctec.model;

public abstract class Ninja
{
	//Three Data Members.
	private String ninjaName;
	private int shurikenNum;
	private boolean nunchakuUser;
	
	
	public String getNinjaName()
	{
		return ninjaName;
	}
	public void setNinjaName(String ninjaName)
	{
		this.ninjaName = ninjaName;
	}
	public int getShurikenNum()
	{
		return shurikenNum;
	}
	public void setShurikenNum(int shurikenNum)
	{
		this.shurikenNum = shurikenNum;
	}
	public boolean isNunchakuUser()
	{
		return nunchakuUser;
	}
	public void setNunchakuUser(boolean nunchakuUser)
	{
		this.nunchakuUser = nunchakuUser;
	}
}
