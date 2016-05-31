
public class Tabs {
	public static void main(String[] args) {
		int[] tab = new int[5];
		String[] words = new String[10];
		
		//tablice posiadaj¹ indeksy numerowane od 0
		tab[0]=1;
		tab[1]=2;
		
		//ale elementów nie musimy uzupe³niaæ w okreœlonym porz¹dku
		words[0]="Ala";
		words[3]="kot";
		
		System.out.println("Pierwszy element tablicy tab[] = " + tab[0]);
		System.out.println("Czwarty element tablicy words[] = " + words[3]);
		
	}
}