package main;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class TestingClass {
	
	final static Logger Log = Logger.getLogger(TestingClass.class);

	public static void main(String[] args) {
		
		ArrayList<String> Gram201 = new ArrayList<String>();//iki metni karsilastirmak icin
		ArrayList<String> Gram202 = new ArrayList<String>();
		ArrayList<String> filePaths = new ArrayList<String>();//linkleri tutmak için
		make20Gram make20gram = new make20Gram();
		Jaccard jaccard = new Jaccard();
		ReadFile read = new ReadFile();
		float similarity;
		int sameText = 0;
		
		
		Measure f1;
		
		
		String getFilePath = "C:\\Users\\damla\\Desktop\\Texts\\FilePaths.txt";
		read.ReadLine(filePaths, getFilePath );//Arrayde dosya yollari var.
		
	
		int i = 0;
		
		for(i = 0 ; i<20; i=i+2)
		{
			make20gram.Create20Gram(Gram201, read.Read(filePaths.get(i)));
			make20gram.Create20Gram(Gram202, read.Read(filePaths.get(i+1)));
			
			similarity = jaccard.jaccard(Gram201, Gram202);
			System.out.println(similarity);
			if (similarity >= 1)
				sameText++;
			Gram201.clear();
			Gram202.clear();
				
		}
		
		f1 = new Measure(sameText,10);
		Log.info("Accuracy : " + f1.accuracy());

	}

}
