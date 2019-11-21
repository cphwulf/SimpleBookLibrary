/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplebooklibrary;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author thor
 */
public class LibraryCompList implements Comparator<Library>{
    private List<Comparator<Library>> listComparators;
 
    @SafeVarargs
    public LibraryCompList(Comparator<Library>... comparators) {
        this.listComparators = Arrays.asList(comparators);
    }
 
    @Override
    public int compare(Library emp1, Library emp2) {
        for (Comparator<Library> comparator : listComparators) {
            int result = comparator.compare(emp1, emp2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}