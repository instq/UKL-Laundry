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
public class petugas implements user{
    
    private ArrayList<String> namaPetugas=new ArrayList<String>();
    private ArrayList<String> alamat=new ArrayList<String>();
    private ArrayList<String> telepon=new ArrayList<String>();
    private ArrayList<Integer> jabatan=new ArrayList<Integer>();
    
public petugas (){
    this.namaPetugas.add("DODI");
    this.alamat.add("Sawojajar");
    this.telepon.add("4321");
    this.jabatan.add(3);
    
}

    @Override
    public void setNama(String namaPetugas) {
        this.namaPetugas.add(namaPetugas);
    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setJabatan(int jabatan){
        this.jabatan.add(jabatan);
    }

    @Override
    public String getNama(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAlamat(int idPetugas) {
        return this.alamat.get(idPetugas);
    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTelepon(int idPetugas) {
        return this.telepon.get(idPetugas);
    //To change body of generated methods, choose Tools | Templates.
    }
    
    public  Integer getJabatan (int idPetugas){
        return this.jabatan.get(idPetugas);
    }
     public int getJmlPetugas(){
        return this.namaPetugas.size(); 
//size=mengetahui jumlah data arraylist nama member 
    }
   
}
