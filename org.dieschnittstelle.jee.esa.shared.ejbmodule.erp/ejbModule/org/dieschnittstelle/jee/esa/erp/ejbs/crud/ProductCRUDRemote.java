package org.dieschnittstelle.jee.esa.erp.ejbs.crud;

import java.util.List;

import org.dieschnittstelle.jee.esa.erp.entities.AbstractProduct;

public interface ProductCRUDRemote {

	public AbstractProduct createProduct(AbstractProduct prod);

	public List<AbstractProduct> readAllProducts();

	public AbstractProduct updateProduct(AbstractProduct update);

	public AbstractProduct readProduct(int productID);

	public boolean deleteProduct(int productID);

}
