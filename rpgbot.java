public class RpgBot
{
	public RpgBot()
	{
		//
	}
	public abstract Move move();
	public abstract SpecialAttack makeSpecialAttack();
	public abstract Attack attack(Entity m);
	private int x = 0, y = 0;
	protected void final setTargetX(int xIn)
	{
		if(xIn < -5 || xIn > 5)
		{
			throw new Exception();
		}
		x = xIn;
	}
	protected void final setTargetY(int yIn)
	{
		if(yIn < -5 || yIn > 5)
		{
			throw new Exception();
		}
		y = yIn;
	}
}
