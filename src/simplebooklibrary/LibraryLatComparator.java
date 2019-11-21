package simplebooklibrary;
import java.util.Comparator;

/**
 *
 * @author thor
 */
public class LibraryLatComparator implements Comparator<Library> {

	@Override
	public int compare(Library o1, Library o2) {
		return o1.getLatitude().compareTo(o2.getLatitude());
	}
	
}
