/*
Answer Q2
Name: Md Naimul Islam
ID: 2014000000038
*/

import java.io.*;
import java.util.Scanner;

public class FileTest {

	public static int[] getNumberFreqFromFile(String location) throws FileNotFoundException{
		File myFile = new File(location);
		Scanner kb = new Scanner(myFile);
		int arr[] = new int [13];
		String n;
		n = kb.next();
		for (int i=0; i<n.length(); i++) {
			int index = n.codePointAt(i);
			arr[index-48] = arr[index-48] + 1;
		}
		
		return arr;
	}

	public static void printFreq(int[] arr){
		for (int i = 0; i<13; i++) {
			if (arr[i] != 0) {
				System.out.println((char)(48+i) + " has appeared " + arr[i] + "x");
			}
			
		}
	}


	public static void main(String[] args) {
		
		String location = "/home/arif/a.txt";
		try{
				printFreq(getNumberFreqFromFile(location));
			
		}catch(Exception err){
			System.out.println(err);
		}
		
	}
}