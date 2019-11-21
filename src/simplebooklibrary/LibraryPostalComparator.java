package simplebooklibrary;
import java.util.Comparator;

/** *
 * @author thor
 */
public class LibraryPostalComparator implements Comparator<Library>  {
	@Override
	public int compare(Library o1, Library o2) {
		return (o1.getPostalcodeAsInt() - (o2.getPostalcodeAsInt()));
	}
	
}
