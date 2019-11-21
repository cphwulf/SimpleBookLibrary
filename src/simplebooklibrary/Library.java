package simplebooklibrary;

public class Library implements Comparable<Object>{
	//postnr,by,kortnavn,væsensnavn,adresse,latitude,bibliotekstype,id,longitude,navn
//	1420,København K,Christianshavn,Københavns Biblioteker,Dronningensgade 53,55.6723406,Folkebibliotek,710106,12.5921292,Christi     anshavns Bibliotek
	int id;
	String postalcode;
	String shortName;
	String longName;
	String city;
	String addresse;
	String typeOfLibrary;
	Double latitude;
	Double longitude;

	public Library(int id, String postalcode, String city, String shortName, String longName, String addresse, String typeOfLibrary, Double latitude, Double longitude) {
		this.id = id;
		this.postalcode = postalcode;
		this.shortName = shortName;
		this.city = city;
		this.longName = longName;
		this.addresse = addresse;
		this.typeOfLibrary = typeOfLibrary;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public int getId() {
		return id;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public String getShortName() {
		return shortName;
	}

	public String getLongName() {
		return longName;
	}

	public String getAddresse() {
		return addresse;
	}

	public String getTypeOfLibrary() {
		return typeOfLibrary;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	@Override
	public int compareTo(Object o) {
		// TODO: write compare on latitude
		return 0;
	}

	
}
