package com.java11.features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FilesReadWriteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Read and write text data using Files API
		
		var path="C:\\codeuserstory2.txt";
		try {
			Files.writeString(Path.of(path), "Testing write string method from files", StandardOpenOption.APPEND);
			String data= Files.readString(Path.of(path));
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
