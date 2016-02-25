package main;



public class Measure {
	
	int similarText;
	int allComparison;

	public Measure(int similar, int all)
	{
		similarText = similar;
		allComparison = all;
	}
	
	public float accuracy()
	{
		return (float) similarText/allComparison;
	}
    
    
    

}
