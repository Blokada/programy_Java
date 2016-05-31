
public class MultiArray {
	public static void main(String[] args) {
		//tablica liczb ca�kowitych o rozmiarze 2x2
		int[][] multiArray=new int[3][3];
		
		//tablica liczb zmiennoprzecinkowych, kt�ra sk�ada si� z tablic o r�nych rozmiarach
		
		double[][] multiArray2=new double[3][];
		multiArray2[0]=new double[3];
		multiArray2[1]=new double[2];
		multiArray2[2]=new double[1];
		
		//W wyniku tablica multiArray2 ma nast�puj�co struktur�:
		/*
		 * XXX
		 * XX
		 * X
		 */
		
		//lub na konkretnych liczbach:
		int[][] multiArray3=new int[3][];
		multiArray[0]=new int[]{0, 1, 2};
		multiArray[1]=new int[]{3, 4};
		multiArray[2]=new int[]{5};
		
		//co daje w wyniku:
		/*
		 * 0 1 2
		 * 3 4
		 * 5
		 */
	}
}