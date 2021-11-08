//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line) {
		setList(line);
	}

	public void setList(String line) {
		wordRay = line.split(" ");
	}

	public void sort() {
	
		for (int i = 0; i < wordRay.length - 1; i++)  
        {  
            int ind = i;  
            for (int j = i + 1; j < wordRay.length; j++)
            {  

            	
                if (wordRay[j].compareTo(wordRay[ind]) < 0)
                {  
                    ind = j;
                }  
            }  
           
            String temp = wordRay[ind];   
            wordRay[ind]= wordRay[i];  
            wordRay[i] = temp;  
        }  
	}
	


	public String toString() {
		String output = "";
		for (int Int = 0; Int < wordRay.length; Int++) {
			output += "word " + Int + " :: " + wordRay[Int] + "\n";
		}
		return output + "\n";
	}
}
