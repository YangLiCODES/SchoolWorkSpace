package minGap;
/*Student Name: Yang Li  			Date:06/15/2017
 * Lab#4- Write a Java program that asks the user to enter an array of integers then find 
 the min gap.*/

import java.util.Scanner;

public class minGap {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("How many numbers you are going to enter: ");
		int max=sc.nextInt();
		//create an array
		int[] nums =new int [max];
		System.out.println("Please enter all the numbers: ");
		for(int i=0;i<max;i++){
			nums[i]=sc.nextInt();
		}
	minGap(nums);
	System.out.println("The minGap is: ");
	System.out.println(minGap(nums));
	}
	
	public static int minGap(int[] nums) {
		//if inputs less than 2 numbers, then return 0.
		if(nums.length<2){
			return 0;	
		}
		//first gap
		int x=Math.abs(nums[1]-nums[0]);
		for(int i=0;i<nums.length-1;i++){
			
			if(x>Math.abs(nums[i+1]-nums[i])){
				x=Math.abs(nums[i+1]-nums[i]);		
			}			
		}
		return x;
	}

}
		
		
	