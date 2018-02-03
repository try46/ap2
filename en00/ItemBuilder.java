/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en00;


public class ItemBuilder {

    private String name;
    private int value;

    public ItemBuilder() {
    }

    public ItemBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ItemBuilder setValue(int value) {
        this.value = value;
        return this;
    }

    public Item createItem() {
        return new Item(name, value);
    }
    
}
