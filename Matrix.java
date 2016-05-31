
public class Matrix {
	public static void main(String[] args) {
		//rozmiar tablicy
		int n=3;
		
		boolean[][] array=new boolean[n][n];
		
		//uzupe³niamy przek¹tn¹
		array[0][0] = true;
		array[1][1] = true;
		array[2][2] = true;
		
		/*
		 * Wyœwietlamy element w prawym dolnym koñcu tablicy
		 * array[array.length-1] - indeks ostatniego wiersza
		 * array[array.length-1].length-1 - indeks ostatniej kolumny w ostatnim wierszu
		 */
		
		System.out.println("Prawy dolny element: " + array[array.length-1][array[array.length-1].length-1]);
	}
}