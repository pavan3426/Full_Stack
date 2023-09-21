package oracle.service;

import javax.ejb.Remote;

import training.iqgateway.oracle.model.Category;
import training.iqgateway.oracle.model.Products;

@Remote
public interface SessionEJB08 {
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    Category persistCategory(Category category);

    Category mergeCategory(Category category);

    void removeCategory(Category category);

    Products persistProducts(Products products);

    Products mergeProducts(Products products);
}
