package com.pe.Strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberOfWordsSentencesCharactersLines {

	@SuppressWarnings("resource")
	public void getCount(File file) throws FileNotFoundException {
		Scanner sc = new Scanner(file);
		int words = 0;
		int sentences = 0 ;
		int characters = 0 ;
		int lines = 0;
		while(sc.hasNextLine()) {
			String lineData = sc.nextLine();
			words += new StringTokenizer(lineData, " ").countTokens();
			sentences += new StringTokenizer(lineData,".").countTokens();
			characters += lineData.length();
			lines++ ;
		}
		System.out.println("words "+words);
		System.out.println("sentences "+sentences);
		System.out.println("characaters " +characters);
		System.out.println("lines "+lines);
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		NumberOfWordsSentencesCharactersLines nwscl = new NumberOfWordsSentencesCharactersLines();
		File file = new File("");
		nwscl.getCount(file);
	}
}
