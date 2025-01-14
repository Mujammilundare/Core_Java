 import java.util.*;

public enum Color 
	{ 
RED, BLUE, YELLOW, GREEN, ORANGE, PURPLE; 

public static EnumSet<Color> getPrimaryColors() 
	{ 
		return EnumSet.of(RED, BLUE, YELLOW); 
	} 

public static EnumSet<Color> getSecondaryColors() 
	{ 
		return EnumSet.complementOf(getPrimaryColors()); 
    }
	
public static void main(String[] args) 
	{ 
	System.out.println("Primary Colors: "+Color.getPrimaryColors()); 
	System.out.println("Secondary Colors: "+Color.getSecondaryColors()); 
	System.out.println("Universe: "+EnumSet.allOf(Color.class)); 
	} 
}	 

