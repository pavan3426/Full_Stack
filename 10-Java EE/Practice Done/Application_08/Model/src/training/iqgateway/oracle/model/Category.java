package training.iqgateway.oracle.model;

import java.io.Serializable;

import java.sql.Timestamp;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
  @NamedQuery(name = "Categories.findAll", query = "select o from Categories o")
})
public class Category implements Serializable {
    @Column(name="CATEGORY_DESCRIPTION", length = 1000)
    private String categoryDescription;
    @Id
    @Column(name="CATEGORY_ID", nullable = false)
    private Long categoryId;
    @Column(name="CATEGORY_LOCKED_FLAG", nullable = false, length = 1)
    private String categoryLockedFlag;
    @Column(name="CATEGORY_NAME", nullable = false, length = 50)
    private String categoryName;
    
   
   
   
    @OneToMany(mappedBy = "categories")
    private List<Products> productsList;
    @ManyToOne
    @JoinColumn(name = "PARENT_CATEGORY_ID")
    private Category categories;
    @OneToMany(mappedBy = "parent")
    private List<Category> children;

    protected Category() {
    }

    public Category(String categoryDescription, Long categoryId,
                      String categoryLockedFlag, String categoryName,
                       Category categories) {
        this.categoryDescription = categoryDescription;
        this.categoryId = categoryId;
        this.categoryLockedFlag = categoryLockedFlag;
        this.categoryName = categoryName;
        this.categories = categories;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryLockedFlag() {
        return categoryLockedFlag;
    }

    public void setCategoryLockedFlag(String categoryLockedFlag) {
        this.categoryLockedFlag = categoryLockedFlag;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

  



    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }

    public Products addProducts(Products products) {
        getProductsList().add(products);
        products.setCategories(this);
        return products;
    }

    public Products removeProducts(Products products) {
        getProductsList().remove(products);
        products.setCategories(null);
        return products;
    }

    public Category getCategories() {
        return categories;
    }

    public void setCategories(Category categories) {
        this.categories = categories;
    }

    public List<Category> getChildren() {
        return children;
    }

    public void setChildren(List<Category> categoryList) {
        this.children = categoryList;
    }

    public Category addCategories(Category categories) {
        getChildren().add(categories);
        categories.setCategories(this);
        return categories;
    }

    public Category removeCategories(Category categories) {
        getChildren().remove(categories);
        categories.setCategories(null);
        return categories;
    }
}
