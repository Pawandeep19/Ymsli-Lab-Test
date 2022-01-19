package q1;

import java.util.Comparator;

public class ItemcodeComparator implements Comparator<Merchandise>{

	@Override
	public int compare(Merchandise m1, Merchandise m2) {
		return m1.getItemCode().compareTo(m2.getItemCode());
		
	}

}
