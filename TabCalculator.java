
public class TabCalculator {
	public static void main(String[] args) {
		double[] nums=new double[] {2.5, 15.7, 1024.6, 33, 56.82, 1.1, 23.90, 999.25, 550.6, 15.7};
		
		System.out.println("Elementy tablicy: ");
		System.out.println(nums[0] + " " + nums[1] + " " + nums[2] + " " +
				nums[3] + " " + nums[4] + " " + nums[5] + " " +
				nums[6] + " " + nums[7] + " " + nums[8] + " " + nums[9] + " ");
		
		double sum = nums[0] + nums[2] + nums[4] +  nums[6] + nums[8];
		System.out.println("Suma elementów na indeksach nieparzystych: " + sum);
		
		System.out.println("Ostatni element tablicy: " + nums[nums.length-1]);
		
	}
}