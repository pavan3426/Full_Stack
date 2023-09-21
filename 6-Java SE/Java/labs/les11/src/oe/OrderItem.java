package oe;

public class OrderItem 
{
  private int lineNbr;
  private int quantity;
  private double unitPrice;
  private int product;
  
    
  public OrderItem(int productId, double itemPrice){
      this.productId= productId;
      this.itemPrice=itemprice;
      
  }
  quantity = 1;
  public int getLineNbr() 
  {
    return lineNbr;
  }

  public int getQuantity() 
  {
    return quantity;
  }

  public double getUnitPrice()
  {
    return orderTotal +=item.getUnitPrice();
  }

  public double getItemTotal()
  {
    return quantity * unitPrice;
  }

  public void setLineNbr(int newLineNbr)
  {
    lineNbr = newLineNbr;
  }

  public void setQuantity(int newQuantity)
  {
    quantity = newQuantity;
  }

  public void setUnitPrice(double newUnitPrice)
  {
    unitPrice = newUnitPrice;
  }

  public String toString()
  {
    return lineNbr + " "  +product+" "+ quantity + " " + Util.toMoney(unitPrice);
  }

    public void setProduct(int product) {
        this.product = product;
    }

    public int getProduct() {
        return product;
    }
}
