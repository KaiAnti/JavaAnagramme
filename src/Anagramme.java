
public class Anagramme {

	public static void main(String[] args) {
		char[] wortA = new char[] { 'L', 'a', 'm', 'p', 'e' };
		char[] wortB = new char[] { 'P', 'a', 'l', 'm', 'e' };
		char[] tempWort = new char[wortA.length]; //es ist egal ob wortA oder wortB lenth genommer wird da sie gleich lang sein müssen
		int tempWortCounter = 0;
		boolean sindAnagramme;

		
		//Anagramme müssen gleich lang sein sonnst sind es keine
		if (wortA.length == wortB.length)
		{
			//gehe jedes zeich von wortA durch und schreibe es in BuchstabeA
			for(char BuchstabeA : wortA)
			{

				//gehe jedes zeich von wortB druch
				for(int i = 0; i < wortB.length; i++)
				{
					//vergleich beide zeich wenn sie klein gescheiben werden 
					if(Character.toLowerCase(wortB[i]) == Character.toLowerCase(BuchstabeA))
					{
						//schreibe den gleich Buchstaben werg für die kontrolle für später
						tempWort[tempWortCounter] = wortB[i];
						
						//entferne den buchstaben aus WortB
						wortB[i] = '#';
						
						//index für Temp Wort hoch zählen
						tempWortCounter++;
						
						// damit es schneller geht und
						// doppelte buchstaben von wort B mitgezählt werden
						break; 
					}
					
				}				
				
			}
		}
		else {
			sindAnagramme = false;
			System.out.print("es sind keine Anagramme, weill die wörter nich gleich lang sind");
		}
		
		
		//nur wenn der counter und das word gleich größ ist dann sind es Anagramme
		if(wortA.length == tempWortCounter)
		{
			sindAnagramme = true;
			System.out.println("es sind Anagramme!");
		}
		else
		{
			System.out.println("es sind KEIN Anagramme");
		}
		
	}

}
