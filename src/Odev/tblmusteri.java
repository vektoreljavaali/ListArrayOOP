/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Odev;

import java.util.ArrayList;

/**
 *
 * @author vektorel
 */
public class tblmusteri {
   
    private int id;
    private String adi;
    private ArrayList<tblislemler> islem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public ArrayList<tblislemler> getIslem() {
        return islem;
    }

    public void setIslem(ArrayList<tblislemler> islem) {
        this.islem = islem;
    }
    
    
    
}
