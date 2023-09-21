package oracle.service;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import training.iqgateway.oracle.model.Category;
import training.iqgateway.oracle.model.Products;

@Stateless(name = "SessionEJB08", mappedName = "Application_08-Model-SessionEJB08")
public class SessionEJB08Bean implements SessionEJB08, SessionEJB08Local {
    @PersistenceContext(unitName="FOD")
    private EntityManager em;

    public SessionEJB08Bean() {
    }

    public Object queryByRange(String jpqlStmt, int firstResult,
                               int maxResults) {
        Query query = em.createQuery(jpqlStmt);
        if (firstResult > 0) {
            query = query.setFirstResult(firstResult);
        }
        if (maxResults > 0) {
            query = query.setMaxResults(maxResults);
        }
        return query.getResultList();
    }

    public Category persistCategory(Category category) {
        em.persist(category);
        return category;
    }

    public Category mergeCategory(Category category) {
        return em.merge(category);
    }

    public void removeCategory(Category category) {
        category = em.find(Category.class, category.getCategoryId());
        em.remove(category);
    }

    public Products persistProducts(Products products) {
        em.persist(products);
        return products;
    }

    public Products mergeProducts(Products products) {
        return em.merge(products);
    }
}
