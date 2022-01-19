package q1;

import java.util.Comparator;

public class PriceComparator implements Comparator<Merchandise> {

	@Override
	public int compare(Merchandise m1, Merchandise m2) {
		 return Double.compare(m1.getUnitPrice(), m2.getUnitPrice());
	}

}
