package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {

	private static final int LIGHT_VAN_MAX_WEIGHT = 20;
	private static final int PRODUCT_NOT_PRESENT = -1;
	
	private final List<Product> products = new ArrayList<>();
	
	public void add(Product product) {products.add(product);}
	
	public void replace(Product oldProduct, Product newProduct) {
		final int index = products.indexOf(oldProduct);
		if (index != PRODUCT_NOT_PRESENT) {	products.set(index, newProduct);}
	}
	
	public void prepare() {
		//sort list of products by weight
			//Collections.checkedSortedMap(products, Product.BY_WEIGHT);
			//products.sort();
		//find product index that needs the heavy van
		
		//assign views of the product list for heavy and light vans
	}
	
	public List<Product> getHeavyVanProducts() {return null;}
	public List<Product> getLightVanProducts() {return null;}
	
	@Override
	public Iterator<Product> iterator() {return products.iterator();}

}
