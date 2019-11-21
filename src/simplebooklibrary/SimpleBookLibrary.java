package simplebooklibrary;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleBookLibrary {
	public static void main(String[] args) {
		String filename = "Data/biblioteker.csv";
		ArrayList<Library> libraries = new ArrayList<>();
		ImportLibrariesFromFile myImp = new ImportLibrariesFromFile(filename);
		libraries = myImp.importFromFile();
		for (int i = 0;i < 14;i++) {
			System.out.println(libraries.toArray()[i]);
		}
		Collections.sort(libraries);
		for (int i = 0;i < 14;i++) {
			System.out.println(libraries.toArray()[i]);
		}
	}
	
}
