/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukllaundry;

import java.util.ArrayList;

/**
 *
 * @author Inas
 */
public class JenisLaundry {
    
    private ArrayList <String> jenisLaundry=new ArrayList <String> ();
    private ArrayList <Integer> harga=new ArrayList <Integer> ();
    private ArrayList <Integer> durasi=new ArrayList <Integer> ();
   
    
    public JenisLaundry (){
        this.jenisLaundry.add("Pakaian");
        this.harga.add(6000);
        this.durasi.add(2);
        
        this.jenisLaundry.add("Selimut");
        this.harga.add(10000);
        this.durasi.add(4);
        
        this.jenisLaundry.add("Sepatu");
        this.harga.add(12000);
        this.durasi.add(3);
        
    }
    public int getJmlJenis(){
        return this.jenisLaundry.size();
    }
    
    public void setJenisLaundry(String jenisLaundry){
        this.jenisLaundry.add(jenisLaundry);
    }
    public String getJenisLaundry(int idLaundry){
        return this.jenisLaundry.get(idLaundry);
    }
    
    public void setHarga (int harga){
        this.harga.add(harga);
    }
    public Integer getHarga (int idLaundry){
        return this.harga.get(idLaundry);
    }
    
    public void setDurasi (int durasi){
        this.durasi.add(durasi);
    
    }
    
    public int getDurasi(int idLaundry){
        return this.durasi.get(idLaundry);
    }
    
    public void editDurasi (int idLaundry, int durasi){
        this.durasi.add(durasi);
    }

   

    

}
