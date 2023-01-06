package com.que2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
public static void main(String[] args) throws IOException {
	Path p = Paths.get("a1.txt");
	List<String> list= Files.readAllLines(p);
	System.out.println("Reading from the file");
	for(String line:list) {
	System.out.println(line);
	
	Path p1=Paths.get(".");
	Files.walk(p, 4).forEach(s-> System.out.println(s));
	}
}
}
