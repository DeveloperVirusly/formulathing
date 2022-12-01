/**
 * simple formulae thing.
 *
 * @author devVirusly
 * @version 0.1
 */

import java.util.*;

public class formulathing
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        String search;
        
        System.out.println("Hello! What formulae will you be searching for today?");
        search = in.nextLine();
        
        switch(search)
        {
            case "Simple Velocity":
                System.out.println("Displacement/Time \n d/t");
                break;
            
            case "Circular Velocity":
                System.out.println("Here's your search result :) \n 2 * pi * r/t");
                break;
                
            case "Average Velocity":
                System.out.println("Here's your search result :) \n v-u/t");
                break;
                
            case "Universal Gravitational Constant":
                System.out.println("Here's your search result :) \n 6.6743 × 10-11 m3 kg-1 s-2");
                break;
                
            case "Weight":
                System.out.println("Here's your search result :) \n w = mg");
                break;
                
            case "Mass":
                System.out.println("Here's your search result :) \n  m = Vρ");
                break;
                
            case "Mass-Energy Equation":
                System.out.println("Here's your search result :) \n E = mc^2");
                break;
        }
    }
}
