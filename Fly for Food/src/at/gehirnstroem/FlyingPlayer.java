package at.gehirnstroem;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class FlyingPlayer {
	
	Player thePlayer;
	double fineFoodLevel;
	Location lastLocation;
	
	public FlyingPlayer(Player thePlayer){
		this.thePlayer = thePlayer;
		fineFoodLevel = (double) thePlayer.getFoodLevel();
		lastLocation = thePlayer.getLocation().clone();
	}
	
	public void syncFoodLevel()
	{
		thePlayer.setFoodLevel((int) fineFoodLevel);
	}
	
	public void setFineFoodLevel(double newFineFoodLevel)
	{
		if(newFineFoodLevel>20)
			newFineFoodLevel = 20;
		else if(newFineFoodLevel<0)
			newFineFoodLevel = 0;
		
		fineFoodLevel = newFineFoodLevel;
		this.syncFoodLevel();
	}
	

}
