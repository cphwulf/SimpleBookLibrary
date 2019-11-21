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
		ArrayList<Library> sortOnLatLong2librarys = new ArrayList<>(librarys);
		ArrayList<Library> sortOnLatLong3librarys = new ArrayList<>(librarys);
		ArrayList<Library> sortOnLatLong4librarys = new ArrayList<>(librarys);
		System.out.println(" --- NOSORT ----");
		for (int i = 0;i < 14;i++) {
			System.out.println(librarys.toArray()[i]);
		}
		Collections.sort(librarys);
		System.out.println(" --- SORTING ----");
		for (int i = 0;i < 14;i++) {
			System.out.println(librarys.toArray()[i]);
		}

		System.out.println(" --- SORTING Lat ----");
		//Collections.sort(sortOnLatLonglibrarys, new LibraryLatComparator());
		Collections.sort(sortOnLatLonglibrarys, new LibraryLatComparator());
		for (int i = 0;i < 14;i++) {
			System.out.println(sortOnLatLonglibrarys.toArray()[i]);
		}
		System.out.println(" --- SORTING Long ----");
		Collections.sort(sortOnLatLong2librarys, new LibraryLongComparator());
		for (int i = 0;i < 24;i++) {
			System.out.println(sortOnLatLong2librarys.toArray()[i]);
		}
		System.out.println(" --- SORTING Lat Long ----");
		Collections.sort(sortOnLatLong3librarys, new LibraryCompList(new LibraryPostalComparator(), new LibraryLongComparator()));
		for (int i = 0;i < 24;i++) {
			System.out.println(sortOnLatLong3librarys.toArray()[i]);
		}
		System.out.println(" --- SORTING Long ----");
		Collections.sort(sortOnLatLong4librarys, new LibraryPostalComparator());
		for (int i = 0;i < 14;i++) {
			System.out.println(sortOnLatLong4librarys.toArray()[i]);
		}
		System.out.println(" --- SORTING Lat Long ----");

		// TODO code application logic here
	}
	
}
