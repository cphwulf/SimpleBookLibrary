package simplebooklibrary;
import java.util.Comparator;

/**
 *
 * @author thor
 */
public class LibraryLongComparator implements Comparator<Library>{

	@Override
	public int compare(Library o1, Library o2) {
		return o1.getLongitude().compareTo(o2.getLongitude());
	}
	
}
