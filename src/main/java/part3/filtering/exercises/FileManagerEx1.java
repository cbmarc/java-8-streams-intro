package part3.filtering.exercises;

import java.io.IOException;
import java.nio.file.Path;

import services.FileService;

/**
 * Count the number of lines in �data.txt� excluding the header and duplicate lines 
 * 
 * @author aohz
 *
 */
public class FileManagerEx1 {

	public static void main(String[] args) {
		Path path = FileService.getFilePath();
		try {
			printLineNumber(path);
			printLineNumberUsingFilter(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void printLineNumber(Path path) throws IOException {
	
	}

	public static void printLineNumberUsingFilter(Path path) throws IOException {
	
	}

}