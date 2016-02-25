package main;

import java.util.ArrayList;

public class make20Gram {
	
	public void Create20Gram(ArrayList<String> twentygram, String text)          
    {
        
        text = text.replace("\n", "");
        text ="_" + text + "_";
   
             for(int i = 0; i<text.length()-19; i++)
          {
              String x = text.substring(i,i+20);
              twentygram.add(x); 
          }
  
    }
    

}
