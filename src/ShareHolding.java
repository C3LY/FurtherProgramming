/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cy214
 */
class ShareHolding {
    
    private String name;
    private Sterling price;
    private int quantity;

    public ShareHolding(String name, Sterling price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Sterling getPrice() {
        return price;
    }

    public void setPrice(Sterling price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public Sterling getCurrentValue(){
        return getPrice().multiplyBy(this.getQuantity());
    }
    
    
    

    
    
}
