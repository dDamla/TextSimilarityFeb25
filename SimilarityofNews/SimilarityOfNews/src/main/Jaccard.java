package main;

import java.util.ArrayList;

public class Jaccard {
	
	
	public float jaccard(ArrayList<String> list1, ArrayList<String> list2)
    {
        int intersection = 0;
        int union = 0;
        float jaccard;
        
        for(String s1 : list1)
        {
            for(String s2 : list2)
            {
                if(s1.equalsIgnoreCase(s2))
                    intersection++;
            }      
            
        }
        
        union = list1.size() + list2.size() - intersection;
       
        jaccard = (float) intersection/union;
        
        return jaccard;
    }
    
    

}
