package q1;

import java.io.*;
import java.util.*;

public class MerchandiseInventoryTest {
	public static void main(String[] args) {
		String itemCode;
		int quantity;
		double unitPrice;
		List<Merchandise> allMerchandise = new ArrayList<>();

		
		try (BufferedReader br = new BufferedReader(new FileReader(
				new File("C:\\Users\\ve00ym324\\Documents\\tools\\Ym324Test\\src\\q1\\input.txt")))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				
				String[] tokens = line.split(" ");
				itemCode = tokens[0];
				quantity = Integer.parseInt(tokens[1]);
				unitPrice = Double.parseDouble(tokens[2]);
				allMerchandise.add(new Merchandise(itemCode, quantity, unitPrice));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		allMerchandise.forEach((M) -> System.out.println(M));
		System.out.println("=====================================");
		System.out.println("Sorted in ascending order by name");
		Collections.sort(allMerchandise,new ItemcodeComparator());
		for(Merchandise m: allMerchandise) {
			System.out.println(m);
		}
		System.out.println("=====================================");
		System.out.println("Sorted in descending order by price");
			Collections.sort(allMerchandise,new PriceComparator());
			for(Merchandise m: allMerchandise) {
				System.out.println(m);
			}
	}

}
