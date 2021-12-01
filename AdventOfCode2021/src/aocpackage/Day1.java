package aocpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("day1");
		Scanner scan1 = new Scanner(file);
		Scanner scan2 = new Scanner(file);
		int res1 = part1(scan1);
		int res2 = part2(scan2);
		System.out.println("res1:  " + res1 + "  res2:  " + res2);
		
		
	}
	
	public static int part1(Scanner scan) {
		
		String current = scan.nextLine();
		int count = 0; 
		while(scan.hasNext()) {
			String input2 = scan.nextLine();
			
			int first = Integer.parseInt(current);
			int second = Integer.parseInt(input2);
			if(second > first) {
				count++; 
			}
			
			current = input2; 
		}
		return count;
		
	}
	public static int part2(Scanner scan) {
		int count = 0; 
		String first = scan.nextLine();
		String second = scan.nextLine(); 
		String third = scan.nextLine();
		
		while(scan.hasNext()) {
			String fourth = scan.nextLine(); 
			int i1 = Integer.parseInt(first);
			int i2 = Integer.parseInt(second);
			int i3 = Integer.parseInt(third);
			int i4 = Integer.parseInt(fourth);
			int sum1 = i1 + i2 + i3; 
			int sum2 = i2 + i3 + i4; 
			if(sum2 > sum1) {
				count++; 
			}
			first = second; 
			second = third; 
			third = fourth; 
		}
		
		return count; 
		
	}

} 
