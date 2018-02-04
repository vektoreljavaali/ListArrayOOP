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
public class OdevArray {
    
    public static void main(String[] args) {
        
        tblislemler islem;
        ArrayList<tblislemler> Lislem;
        tblmusteri musteri;
        ArrayList<tblmusteri> Lmusteri;
        
        //1. müşteri için kayıtlar
        //işlem listesi
        Lislem = new ArrayList<tblislemler>();
        //ilk işlem kaydı
        islem = new tblislemler();
        islem.setAdi("alış");
        islem.setTutari(15);
        Lislem.add(islem);
       //2. işlem ykaydı
        islem = new tblislemler();
        islem.setAdi("satış");
        islem.setTutari(5);
        Lislem.add(islem);
        //3. işlem kaydı
        islem = new tblislemler();
        islem.setAdi("alış");
        islem.setTutari(25);
        Lislem.add(islem);
        //ilk ümüşteri kaydı
        Lmusteri = new ArrayList<tblmusteri>();
        musteri = new tblmusteri();
        musteri.setId(1);
        musteri.setAdi("Muhammet");
        musteri.setIslem(Lislem);
        Lmusteri.add(musteri);
        //-------------------------------------------
        
        //2. müşteri işlemleri 
        // işlemler listesi
        Lislem = new ArrayList<tblislemler>();
        // 1. işlem kaydı
        islem = new tblislemler();
        islem.setAdi("alış");
        islem.setTutari(50);
        Lislem.add(islem);
        //2. işlem kaydı
        islem = new tblislemler();
        islem.setAdi("satış");
        islem.setTutari(20);
        Lislem.add(islem);
        //2. müşteriyi ekle
        musteri= new tblmusteri();
        musteri.setId(2);
        musteri.setAdi("Ayşe");
        musteri.setIslem(Lislem);
        Lmusteri.add(musteri);
        
        
        for(tblmusteri item : Lmusteri){
        
            System.out.println("müşterinin id.....: "+item.getId());
            System.out.println("müşterinin id.....: "+item.getAdi());
            double toplam=0;
            for(tblislemler islemitem : item.getIslem()){
                System.out.println("       yapılan işlem.....: "+islemitem.getAdi());
                System.out.println("       yapılan tutar.....: "+islemitem.getTutari());
            if(islemitem.getAdi().equals("alış"))toplam+=islemitem.getTutari();
            else toplam-=islemitem.getTutari();
               
            }
             System.out.println("               Toplam....:"+toplam);
            System.out.println("------------------------------------------------");  
            
        }
        
                
                
                
        
        
        
        
        
        
        
    }
}
