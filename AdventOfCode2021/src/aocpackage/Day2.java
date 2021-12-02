package aocpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("day2");
		Scanner scan1 = new Scanner(file);
		Scanner scan2 = new Scanner(file);
		int res1 = part1(scan1);
		int res2 = part2(scan2);
		System.out.println("res1:  " + res1 + "  res2:  " + res2);
		
		
	}
	
	public static int part1(Scanner scan) {
		
		
		int hor = 0; 
		int depth = 0; 
		while(scan.hasNext()) {
			String input = scan.nextLine();
			int length = input.length();
			String[] spl = input.split(" ");
			String dir = spl[0];
			String siz = spl[1];
			
			if(dir.startsWith("f")) {
				
				hor += Integer.parseInt(siz);
			}else {
				if(dir.startsWith("d")) {
					depth += Integer.parseInt(siz);
				}else {
					depth -=  Integer.parseInt(siz);
				}
			}
		}
		return hor * depth;
		
	}
	public static int part2(Scanner scan) {
		int hor = 0; 
		int aim = 0; 
		int depth = 0; 
		while(scan.hasNext()) {
			String input = scan.nextLine();
			String[] spl = input.split(" ");
			String dir = spl[0];
			String siz = spl[1];
			
			if(dir.startsWith("f")) {
				
				hor += Integer.parseInt(siz);
				depth += aim * Integer.parseInt(siz);;
				
			}else {
				if(dir.startsWith("d")) {
					aim += Integer.parseInt(siz);
				}else {
					aim -=  Integer.parseInt(siz);
				}
			}
		}
		return hor * depth ;
		
	}

} 
