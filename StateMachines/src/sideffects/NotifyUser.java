package sideffects;

import libstatemachines.SideEffect;

/*
 * This class is just to demonstrate how the delegation
 * of SideEffect is being used.
 * 
 * --> Strategy Pattern
 */

public class NotifyUser implements SideEffect{
	
	String username;
	String notificationText;
	
	public NotifyUser(String user, String notif) {
		
		this.username = user;
		this.notificationText = notif;
	}

	@Override
	public boolean applySideEffect() {
		
		System.out.println("Hello, " + username + ": " + notificationText);
		
		return true;
	}

}
