package com.algoexpert.extras;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileOperations {

	private static String fileName = "//home//urvi//Documents//ReadMe.txt";

	private static void readFileNative() {
		try {
			BufferedReader bf = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = bf.readLine()) != null) {
				System.out.println(line);
			}
			bf.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void readFileStream() {
		try {
			Stream<String> stream = Files.lines(Paths.get(fileName));
			stream.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void writeFileNative() {
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(
					new FileWriter("//home//urvi//Documents//codeGneratedFile.txt"));
			for (int i = 0; i < 10; i++) {
				bufferedWriter.write("ThoughtWorks");
			}
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void readPropertyFile() {

	}

	public static void main(String[] args) {
		readFileNative();
		readFileStream();
		writeFileNative();
	}
}
