package com.pe.SeleniumRelated;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class FileHandling {

	/*
	 * Create a Folder
	 */
	public void CreateFolder() {
		File file = new File("/Users/chethankbidare/Downloads/MediBills/Chethan");
		file.mkdir();
	}
	
	/*
	 * Delete a Folder
	 */
	
	public void DeleteFolder() {
		File file = new File("/Users/chethankbidare/Downloads/MediBills/Chethan");
		file.delete();
	}
	/*
	 * Check the existence of the Folder
	 */
	
	public boolean verifyExistenceOfFolder() {
		File file = new File("/Users/chethankbidare/Downloads/MediBills/Chethan");
		if(file.exists())
			return true ;
		else
			return false ;
	}
	
	
	public void CreateNewFile() throws IOException {
		File file = new File("/Users/chethankbidare/Downloads/MediBills/Chethan/bidare.txt");
		file.createNewFile();
	}
	
	public boolean IsDownloaded(String fileName,String downloadPath) {
		File file = new File(downloadPath);
		File[] dir = file.listFiles();
		for(File f : dir) {
			if(f.getName().equalsIgnoreCase(fileName)) {
				System.out.println("Filedownloaded");
				return true ;
			}
			else
				return false ;
		}
		return false ;
		
	}
	
	
	
	
	/*
	 * using File Handler Class
	 */
	public void CreateFolder1() throws IOException {
		FileHandler.createDir(new File("/Users/chethankbidare/Downloads/MediBills/Chethan"));
	}
	
	public void DeleteFolder1() throws IOException {
		FileHandler.delete(new File("/Users/chethankbidare/Downloads/MediBills/Chethan"));
	}
	
	
	public void copyFile() throws IOException {
		FileHandler.copy(new File("From FIle"), new File("To"));
	}
	
	
	public static void main(String[] args) {
		FileHandling fh = new FileHandling();
		fh.CreateFolder();
		System.out.println(fh.verifyExistenceOfFolder());
		fh.DeleteFolder();
	}
}
