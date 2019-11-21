package simplebooklibrary;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportLibrariesFromFile {
	String filename;
	public ImportLibrariesFromFile(String filename) {
		this.filename = filename;
	}
	
	public ArrayList<Library> importFromFile() {
		//postnr,by,kortnavn,væsensnavn,adresse,latitude,bibliotekstype,id,longitude,navn
		// 1420,København K,Christianshavn,Københavns Biblioteker,Dronningensgade 53,55.6723406,Folkebibliotek,710106,12.5921292,Christi     anshavns Bibliotek
		//(int id, String postalcode, String city, String shortName, String longName, String addresse, String typeOfLibrary, Double latitude, Double longitude)
		ArrayList<Library> libraries = new ArrayList<>();
		File fh = new File(filename);
		try {
			Scanner sc = new Scanner(fh);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] lineArr = line.split(",");
				try {
					
				Library library = new Library(Integer.parseInt(lineArr[7]), lineArr[0], lineArr[1], lineArr[2], lineArr[3], lineArr[4],lineArr[9], Double.parseDouble(lineArr[5]), Double.parseDouble(lineArr[8]));
				libraries.add(library);
				} catch (Exception e) {
					System.out.println("Error in reading line:" + e);
				}
			}
			
		} catch (Exception e) {
			System.out.println("Error" + e);
		}
		
		return libraries;
	}
}
