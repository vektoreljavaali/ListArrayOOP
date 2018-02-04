/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarrayoop;


import java.util.ArrayList;


/**
 *
 * @author vektorel
 */
public class ListArrayOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        ArrayList<tblmusteri> Lmst = new ArrayList<>();
      
        tblmusteri mst = new tblmusteri();
        mst.setId(1);
        mst.setAdi("Muhammet");
        
        Lmst.add(mst);
        
        mst = new tblmusteri();
        mst.setId(2);
        mst.setAdi("Ayşe");
       
        Lmst.add(mst);
        
             mst = new tblmusteri();
        mst.setId(3);
        mst.setAdi("Fatma");
       
        Lmst.add(mst);
        
                
        for (tblmusteri item : Lmst) {
            System.out.println("id.....: "+item.getId());
            System.out.println("adi.....: "+item.getAdi());
            System.out.println("--------------------------------");
        }
        
               
        
    }
    
}
