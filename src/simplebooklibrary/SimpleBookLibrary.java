package simplebooklibrary;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleBookLibrary {
	public static void main(String[] args) {
		String filename = "Data/biblioteker.csv";
		ArrayList<Library> librarys = new ArrayList<>();
		ArrayList<Library> sortOnLatlibrarys = new ArrayList<>();
		ImportLibrariesFromFile myImp = new ImportLibrariesFromFile(filename);
		librarys = myImp.importFromFile();
		ArrayList<Library> sortOnLatLonglibrarys = new ArrayList<>(librarys);
		System.out.println(" --- NOSORT ----");
		for (int i = 0;i < 14;i++) {
			System.out.println(librarys.toArray()[i]);
		}
		Collections.sort(librarys);
		System.out.println(" --- SORTING ----");
		for (int i = 0;i < 14;i++) {
			System.out.println(librarys.toArray()[i]);
		}

		System.out.println(" --- SORTING ----");
		//Collections.sort(sortOnLatLonglibrarys, new LibraryLatComparator());
		Collections.sort(sortOnLatLonglibrarys, new LibraryLatComparator());
		for (int i = 0;i < 14;i++) {
			System.out.println(sortOnLatLonglibrarys.toArray()[i]);
		}
		System.out.println(" --- SORTING ----");
		Collections.sort(sortOnLatLonglibrarys, new LibraryLongComparator());
		for (int i = 0;i < 14;i++) {
			System.out.println(sortOnLatLonglibrarys.toArray()[i]);
		}


		// TODO code application logic here
	}
	
}
