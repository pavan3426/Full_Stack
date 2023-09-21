package oracle.ui.backing;

import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;

import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.data.RichTree;

import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelAccordion;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.nav.RichCommandToolbarButton;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.model.Category;

import oracle.model.Product;

import oracle.services.SessionEJBLocal;

import org.apache.myfaces.trinidad.model.ChildPropertyTreeModel;
import org.apache.myfaces.trinidad.model.TreeModel;

public class ProductBrowsingBean {
    private TreeModel treeModel;
    private RichForm form1;
    private RichDocument document1;
    private RichTree categoryTree;
    private RichOutputText outputText1;
    private RichPanelSplitter panelSplitter1;
    private RichPanelAccordion panelAccordion1;
    private RichShowDetailItem showDetailItem1;
    private RichPanelGroupLayout panelGroupLayout1;
    private RichPanelHeader panelHeader1;
    private RichTable productsTable;
    private RichPanelHeader ph1;
    private RichPanelFormLayout pfl1;
    private RichInputText it1;
    private RichInputText it2;
    private RichInputText it3;
    private RichInputText it4;
    private RichInputText it5;
    private RichInputText it6;
    private RichInputText it7;
    private RichCommandToolbarButton addProduct;


    public SessionEJBLocal getSessionBean() 
                                throws NamingException {
        InitialContext ic = new InitialContext();
        Object lookupObject =
               ic.lookup("java:comp/env/ejb/local/SessionEJB");
        return (SessionEJBLocal)lookupObject;
    }

    public ProductBrowsingBean() {
    }

    public TreeModel getTreeModel() throws NamingException {
        
        if (treeModel == null)  {
            List<Category> categories = getSessionBean().queryCategoryFindRoot();    
            this.treeModel = new ChildPropertyTreeModel(categories, "children");
        }
        
        return treeModel;
    }

    public List<Product> getAllProducts() throws NamingException {
        List<Product> products = getSessionBean().queryProductFindAll();
        return products;
    }


    public void setForm1(RichForm form1) {
        this.form1 = form1;
    }

    public RichForm getForm1() {
        return form1;
    }

    public void setDocument1(RichDocument document1) {
        this.document1 = document1;
    }

    public RichDocument getDocument1() {
        return document1;
    }

    public void setCategoryTree(RichTree categoryTree) {
        this.categoryTree = categoryTree;
    }

    public RichTree getCategoryTree() {
        return categoryTree;
    }

    public void setOutputText1(RichOutputText outputText1) {
        this.outputText1 = outputText1;
    }

    public RichOutputText getOutputText1() {
        return outputText1;
    }

    public void setPanelSplitter1(RichPanelSplitter panelSplitter1) {
        this.panelSplitter1 = panelSplitter1;
    }

    public RichPanelSplitter getPanelSplitter1() {
        return panelSplitter1;
    }

    public void setPanelAccordion1(RichPanelAccordion panelAccordion1) {
        this.panelAccordion1 = panelAccordion1;
    }

    public RichPanelAccordion getPanelAccordion1() {
        return panelAccordion1;
    }

    public void setShowDetailItem1(RichShowDetailItem showDetailItem1) {
        this.showDetailItem1 = showDetailItem1;
    }

    public RichShowDetailItem getShowDetailItem1() {
        return showDetailItem1;
    }

    public void setPanelGroupLayout1(RichPanelGroupLayout panelGroupLayout1) {
        this.panelGroupLayout1 = panelGroupLayout1;
    }

    public RichPanelGroupLayout getPanelGroupLayout1() {
        return panelGroupLayout1;
    }

    public void setPanelHeader1(RichPanelHeader panelHeader1) {
        this.panelHeader1 = panelHeader1;
    }

    public RichPanelHeader getPanelHeader1() {
        return panelHeader1;
    }

    public void setProductsTable(RichTable table1) {
        this.productsTable = table1;
    }

    public RichTable getProductsTable() {
        return productsTable;
    }

    public void setPh1(RichPanelHeader ph1) {
        this.ph1 = ph1;
    }

    public RichPanelHeader getPh1() {
        return ph1;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }


    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }


    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }


    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
    }


    public void setAddProduct(RichCommandToolbarButton ctb1) {
        this.addProduct = ctb1;
    }

    public RichCommandToolbarButton getAddProduct() {
        return addProduct;
    }

    public String addProduct() {
        // Add event code here...
        String url= "images/17.jpg";
        String shhippingClassCode="CLASS1";
        Long supplierId = 123L;
        Long warrantyMonths = 12L;
        String status = null;
        Category category = null;
                      
        return null;
    }
    
//    Product newProduct = new Product( (String)this.getNpAdditionalInfo().getValue(),
//                             );
}
