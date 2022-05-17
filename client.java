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
public class client implements user {
    
    private ArrayList <String> namaClient =new ArrayList <String> ();
    private ArrayList <String> alamat =new ArrayList <String> ();
    private ArrayList <String> telepon =new ArrayList <String> ();
    private ArrayList <Integer> saldo =new ArrayList <Integer> ();
    
public client () {
    this.namaClient.add("ABI");
    this.alamat.add("Malang");
    this.telepon.add("1234");
    this.saldo.add(200000);
    
    this.namaClient.add("BUDI");
    this.alamat.add("Kediri");
    this.telepon.add("5678");
    this.saldo.add(250000);
    
    this.namaClient.add("COKI");
    this.alamat.add("Surabaya");
    this.telepon.add("91011");
    this.saldo.add(300000);
    
}

    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    
    public int getSaldo(int idMember){
        return this.saldo.get(idMember);
    }
    
    //untuk perubahan saldo member 
    public void editSaldo(int saldo, int idMember){
        this.saldo.set(saldo, idMember);
    }
    
    public int getJmlClient(){
        return this.namaClient.size(); 
//size=mengetahui jumlah data arraylist nama member 
    }
    
    @Override
    public void setNama (String namaClient){
        this.namaClient.add(namaClient);
    }
    @Override
    public String getNama (int idClient){
        return this.namaClient.get(idClient);
    }
    
    @Override
    public void setAlamat (String alamat){
        this.alamat.add(alamat);
    }
    @Override
    public String getAlamat (int idClient){
        return this.alamat.get(idClient);
    }
    
    @Override
    public void setTelepon (String telepon){
        this.telepon.add(telepon);
    }
    @Override
    public String getTelepon (int idClient){
        return this.telepon.get(idClient);
    }
    
}
