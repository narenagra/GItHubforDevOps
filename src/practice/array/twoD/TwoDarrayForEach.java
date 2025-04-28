package practice.array.twoD;

public class TwoDarrayForEach {
public static void main(String[] args) {
	int arrD[][]=new int [][] {{11,22,33,44,55},{11,77,88,99,25}};
	System.out.println("\n ----Iterate with ForEach()---------");
	for(int tArr[]: arrD) {
		for(int val: tArr) {
			System.out.println(val+"\t");
		}
		System.out.println("\n");
	}
}
}
