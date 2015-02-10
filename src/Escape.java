
/*E-Scape by Gerald Blake
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;
import java.lang.String;
public class Escape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String theText ="";
		int state = 0;
		boolean done = false;
		boolean hasPrinted = false;
		Scanner s = new Scanner(System.in);
		String [] theTokens;
        
		while(!done)
		{
			switch(state)
			{
                case 0:
                    if(!hasPrinted)
                    System.out.println("\n\n[***ESCAPE A GAME BY GERALD BLAKE***]\n[[ : ) : ) : ) : ) : ) ]]\n <<ENJOY>>\nYou must seek out the ancient Entity for he is the only one " +
                            "who can save the planet earth from the Enigmanimus the\n" +
                            " Intersteller Phenomina that has destroyed thousands of galaxies for centuries");
                    hasPrinted = true;
                    System.out.println("The Entity resides in the Everse you can teleport there with the teleporter");
                   
                    System.out.println("What do you want to do?");
                    theText = s.nextLine();
                    theTokens  = theText.split(" ");
                    
                    for(int i = 0; i < theTokens.length;i++)
                    {
                        
                        if(theTokens[i].equalsIgnoreCase("teleport")
                                || theTokens[i].equalsIgnoreCase("everse")|| theTokens[i].equalsIgnoreCase("teleporter"))
                        {
                           
                            hasPrinted=false;
                            state = 1;
                            
                            
                        }
                    
                        
                    }
                    
                    
                    break;
                case 1:
                    if(!hasPrinted)
                    {
                        System.out.println("You are now in the Everse");
                        System.out.println("I must ask the Entity about earth!");
                    }
                    hasPrinted = true;
                    System.out.println("Entity: What do you want?");
                    theText = s.nextLine();
                    theTokens  = theText.split(" ");
                    for(int i = 0; i < theTokens.length;i++)
                    {
                        
                        if(theTokens[i].equalsIgnoreCase("earth"))
                        {
                            
                            System.out.println("Ahh you want to save the earth you must answer my riddle and I shall help you");
                            System.out.println("Ask about the riddle");
                            
                        }
                        if(theTokens[i].equalsIgnoreCase("riddle"))
                        {
                            System.out.println("Name a class of a dense star!");
                            
                            
                        }
                        if(theTokens[i].equalsIgnoreCase("dwarf"))
                        {
                            System.out.println("That is Correct Here is the Portkey when you turn it" +
                                    " on you will be transported to the north galaxy acquire the first piece of the puzzle");
                            state = 2;
                            hasPrinted = false;
                            
                        }
                        
                    }
                 
                  
                    break;
                case 2:
                
                        System.out.println("I must turn on the port key");
                    
                        theText = s.nextLine();
                        theTokens  = theText.split(" ");
                        for(int i = 0; i < theTokens.length;i++)
                        {
                            
                            if(theTokens[i].equalsIgnoreCase("on"))
                            {
                                
                                System.out.println("Port Key on!");
                                System.out.println("You are now being transferred to the North Galaxy");
                                
                                hasPrinted = false;
                                state = 3;
                            }
                        }
                  
                    break;
                    case 3:
                    
                        System.out.println("I am in the North Galaxy Now I must acquire the item in front of me");
                        theText = s.nextLine();
                        theTokens  = theText.split(" ");
                        for(int i = 0; i < theTokens.length;i++)
                        {
                            
                            if(theTokens[i].equalsIgnoreCase("acquire"))
                            {
                                
                                System.out.println("You now have quadrant1");
                                System.out.println("You are now being transfered to the Everse");
                                
                                hasPrinted = false;
                                state = 4;
                            }
                        }
            
                        break;
                    case 4:
                        if(!hasPrinted)
                        System.out.println("You are in the everse!");
                       hasPrinted = true;
                        System.out.println("You must ask the entity about the next riddle!");
                        theText = s.nextLine();
                        theTokens  = theText.split(" ");
                        for(int i = 0; i < theTokens.length;i++)
                        {
                        if(theTokens[i].equalsIgnoreCase("riddle"))
                        {
                            System.out.println("What happens when the unstoppable force meets the immovable object!");
                            
                            
                        }
                        if(theTokens[i].equalsIgnoreCase("stop")||theTokens[i].equalsIgnoreCase("surrender")||theTokens[i].equalsIgnoreCase("draw")||theTokens[i].equalsIgnoreCase("nothing"))
                        {
                            System.out.println("That is Correct Here is the Portkey when you turn it" +
                                    " on you will be transported to the South galaxy acquire the second piece of the puzzle");
                            state = 5;
                            hasPrinted = false;
                            
                        }
                        }
        
                    break;
                    case 5:
                        System.out.println("I must turn on the port key");
                        
                        theText = s.nextLine();
                        theTokens  = theText.split(" ");
                        for(int i = 0; i < theTokens.length;i++)
                        {
                            
                            if(theTokens[i].equalsIgnoreCase("on"))
                            {
                                
                                System.out.println("Port Key on!");
                                System.out.println("You are now being transfered to the South Galaxy");
                                
                                hasPrinted = false;
                                state = 6;
                            }
                            
                        }
                 
                        break;
                    case 6:
                        System.out.println("I am in the South Galaxy Now I must acquire the item in front of me");
                        theText = s.nextLine();
                        theTokens  = theText.split(" ");
                        for(int i = 0; i < theTokens.length;i++)
                        {
                            
                            if(theTokens[i].equalsIgnoreCase("acquire"))
                            {
                                
                                System.out.println("You now have quadrant2");
                                System.out.println("You are now being transfered to the Everse");
                                
                                hasPrinted = false;
                                state = 7;
                            }
                        }
                   
                     break;
                    case 7:
                        if(!hasPrinted)
                            System.out.println("You are in the everse!");
                            hasPrinted = true;
                            System.out.println("You must ask the entity about the next riddle!");
                            theText = s.nextLine();
                            theTokens  = theText.split(" ");
                            for(int i = 0; i < theTokens.length;i++)
                            {
                            if(theTokens[i].equalsIgnoreCase("riddle"))
                            {
                                System.out.println("Name the Object that models the Reason as to why the sky is blue or red or orange etc!");
                                
                                
                            }
                            if(theTokens[i].equalsIgnoreCase("prism"))
                            {
                                System.out.println("That is Correct Here is the Portkey when you turn it" +
                                        " on you will be transported to the East galaxy acquire the third piece of the puzzle");
                                
                                hasPrinted = false;
                                state = 8;
                                
                            }
                            }
              
                        break;
                    case 8:
                        System.out.println("I must turn on the port key");
                        
                        theText = s.nextLine();
                        theTokens  = theText.split(" ");
                        for(int i = 0; i < theTokens.length;i++)
                        {
                            
                            if(theTokens[i].equalsIgnoreCase("on"))
                            {
                                
                                System.out.println("Port Key on!");
                                System.out.println("You are now being transfered to the East Galaxy");
                                
                                hasPrinted = false;
                                state = 9;
                            }
                        }
                 
                        break;
                    case 9:
                        System.out.println("I am in the East Galaxy Now I must acquire the item in front of me");
                        theText = s.nextLine();
                        theTokens  = theText.split(" ");
                        for(int i = 0; i < theTokens.length;i++)
                        {
                            
                            if(theTokens[i].equalsIgnoreCase("acquire"))
                            {
                                
                                System.out.println("You now have quadrant3");
                                System.out.println("You are now being transfered to the Everse");
                                
                                hasPrinted = false;
                                state = 10;
                            }
                        }
                   
                     break;
                    case 10:
                        if(!hasPrinted)
                            System.out.println("You are in the everse!");
                        hasPrinted = true;
                            System.out.println("You must ask the entity about the next riddle!");
                            theText = s.nextLine();
                            theTokens  = theText.split(" ");
                            for(int i = 0; i < theTokens.length;i++)
                            {
                            if(theTokens[i].equalsIgnoreCase("riddle"))
                            {
                                System.out.println("Name one of the many natures of fire");
                                
                                
                            }
                            if(theTokens[i].equalsIgnoreCase("survival")|| theTokens[i].equalsIgnoreCase("survive")||theTokens[i].equalsIgnoreCase("energy"))
                            {
                                System.out.println("That is Correct Here is the Portkey when you turn it" +
                                        " on you will be transported to the West galaxy acquire the fourth and final piece to the puzzle");
                                state = 11;
                                hasPrinted = false;
                                
                            }
                            }
    
                        break;
                    case 11:
                        System.out.println("I must turn on the port key");
                        
                        theText = s.nextLine();
                        theTokens  = theText.split(" ");
                        for(int i = 0; i < theTokens.length;i++)
                        {
                            
                            if(theTokens[i].equalsIgnoreCase("on"))
                            {
                                
                                System.out.println("Port Key on!");
                                System.out.println("You are now being transfered to the West Galaxy");
                                
                                hasPrinted = false;
                                state = 12;
                            }
                        }
                        break;
                    case 12:
                        System.out.println("I am in the West Galaxy Now I must acquire the item in front of me");
                        theText = s.nextLine();
                        theTokens  = theText.split(" ");
                        for(int i = 0; i < theTokens.length;i++)
                        {
                            
                            if(theTokens[i].equalsIgnoreCase("acquire"))
                            {
                                
                                System.out.println("You now have quadrant4 the final piece to the puzzle");
                                System.out.println("You are now being transfered to the Everse");
                                
                                hasPrinted = false;
                                state = 13;
                            }
                        }
                  
                     break;
                    case 13:
                        if(!hasPrinted)
                            System.out.println("You are in the everse!");
                          hasPrinted = true;
                            System.out.println("You must ask the entity how to use quadrants!");
                            theText = s.nextLine();
                            theTokens  = theText.split(" ");
                            for(int i = 0; i < theTokens.length;i++)
                            {
                            if(theTokens[i].equalsIgnoreCase("quadrant")|| theTokens[i].equalsIgnoreCase("quadrants"))
                            {
                                System.out.println("You must goto earth and combine the qudrants and cast them onto the Enigmanimus");
                                System.out.println("You must take the telporter to Earth!!!");
                                
                                
                            }
                            if(theTokens[i].equalsIgnoreCase("teleporter")|| theTokens[i].equalsIgnoreCase("teleport")||theTokens[i].equalsIgnoreCase("earth"))
                            {
                                System.out.println("You are now being transported to earth. Remember what you have to do");
                                state = 14;
                                hasPrinted = false;
                                
                            }
                            }
                    
                        break;
                    case 14:
                        if(!hasPrinted)
                            System.out.println("You are on Earth and the Enigmanimus surrounds the planet!!!!");
                        hasPrinted = true;
                            System.out.println("You must combine the quadrants");
                            theText = s.nextLine();
                            theTokens  = theText.split(" ");
                            for(int i = 0; i < theTokens.length;i++)
                            {
                            if(theTokens[i].equalsIgnoreCase("combine"))
                            {
                                System.out.println("The quadrants have been combined");
                                
                                state= 15;
                                hasPrinted =false;
                            }
                        
                            }
                    
                        break;
                    case 15:
                        
                            System.out.println("Cast the ancient power onto the Enigmanimus!!!");
                            theText = s.nextLine();
                            theTokens  = theText.split(" ");
                    
                            for(int i = 0; i < theTokens.length;i++)
                            {
                            if(theTokens[i].equalsIgnoreCase("cast"))
                            {
                                System.out.println("The Enigmanimus is Exploding you have saved the earth!!!");
                                
                                state= 16;
                                hasPrinted =false;
                            }
                        
                            }
                    
                        break;
                    case 16:
                        System.out.println("You won the game!!");
                        done = true;
                        break;
			}
			
			
		}
	}

}
