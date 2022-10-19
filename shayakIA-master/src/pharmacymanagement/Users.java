/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement;

/**
 *
 * @author aarog
 */
class Users {
    private String id, name, address, number;
    
    public Users(String id, String name, String address, String number){
        this.id = id;
        this.name = name;
        this.address = address;
        this.number = number;

    }
    
    public String getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getNumber(){
        return number;
    }
}
