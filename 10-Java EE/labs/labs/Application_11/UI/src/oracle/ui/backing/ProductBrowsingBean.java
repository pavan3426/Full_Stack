package oracle.ui.backing;

import oracle.services.SessionEJB11Local;
import oracle.model.Product;
import java.util.*;
import oracle.model.Category;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;


import oracle.adf.view.rich.component.rich.data.RichTree;

import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.output.RichActiveOutputText;

import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.services.SessionEJB11Local;

import org.apache.myfaces.trinidad.component.UIXGroup;
import org.apache.myfaces.trinidad.model.TreeModel;
import org.apache.myfaces.trinidad.model.ChildPropertyTreeModel;


public class ProductBrowsingBean {
    private RichForm f1;
    private RichDocument d1;
    private RichTree categoryTree;
    private RichActiveOutputText aot1;
    private RichPanelSplitter ps1;
    private RichOutputText ot1;
    private UIXGroup g1;
    private RichPanelSplitter ps2;

    public ProductBrowsingBean() {
        super();
    }

    public SessionEJB11Local getSessionBean() throws NamingException{
        InitialContext ic = new InitialContext();
        Object lookupObject = ic.lookup("java:comp/env/ejb/local/SessionEJB11");
        return (SessionEJB11Local)lookupObject;
    }
    public List<Product> getAllProducts() throws NamingException{
        List<Product> products= this.getSessionBean().queryProductFindAll();
        return products;
    }


    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }


    public void setCategoryTree(RichTree categoryTree) {
        this.categoryTree = categoryTree;
    }

    public RichTree getCategoryTree() {
        return categoryTree;
    }

    public void setAot1(RichActiveOutputText aot1) {
        this.aot1 = aot1;
    }

    public RichActiveOutputText getAot1() {
        return aot1;
    }

    public void setPs1(RichPanelSplitter ps1) {
        this.ps1 = ps1;
    }

    public RichPanelSplitter getPs1() {
        return ps1;
    }


    public void setOt1(RichOutputText ot1) {
        this.ot1 = ot1;
    }

    public RichOutputText getOt1() {
        return ot1;
    }

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }

    public void setPs2(RichPanelSplitter ps2) {
        this.ps2 = ps2;
    }

    public RichPanelSplitter getPs2() {
        return ps2;
    }
}
