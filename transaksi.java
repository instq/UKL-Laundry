/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukllaundry;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Inas
 */
public class transaksi {
    
    private ArrayList <Integer> idCLient=new ArrayList <Integer> ();
    private ArrayList <Integer> idLaundry=new ArrayList <Integer> ();
    private ArrayList <Integer> banyak=new ArrayList <Integer> ();
    
    public transaksi (){
        this.idCLient.add(2);
        this.idLaundry.add(1);
        this.banyak.add(1);
        
        this.idCLient.add(0);
        this.idLaundry.add(0);
        this.banyak.add(2);
        
        this.idCLient.add(1);
        this.idLaundry.add(1);
        this.banyak.add(0);
        
        this.idCLient.add(2);
        this.idLaundry.add(0);
        this.banyak.add(1);
    }
    public void prosesTransaksi (client Client, transaksi Transaksi, JenisLaundry jenisLaundry){
    Scanner myObj=new Scanner(System.in);
    System.out.println("Selamat Datang");
    System.out.println("Masukkan ID Client");
    int idClient=myObj.nextInt();
    System.out.println("Selamat datang "+Client.getNama(idClient));
    ArrayList<Integer> idLaundry =new ArrayList<Integer>();
    ArrayList<Integer> banyak=new ArrayList<Integer>();
    int i=0;
    int temp=0;
    do {
        System.out.println("Masukkan kode Jenis Laundry");
        temp=myObj.nextInt();
        if (temp!=99){
            idLaundry.add(temp);
            System.out.println(jenisLaundry.getJenisLaundry(idLaundry.get(i))+"sebanyak ");
            banyak.add(myObj.nextInt());
            i++;            
        }        
    }while (temp!=99);
    
    System.out.println("Transaksi belanja "+Client.getNama(idClient)+"sebagai berikut");
    System.out.println("Nama barang \tQty \tHarga \tJumlah \t");
    
    int total=0;
    int x=idLaundry.size();
    for (int j=0; j<x; j++){
        int jumlah=banyak.get(j)*jenisLaundry.getHarga(idLaundry.get(j));
        total+=jumlah;
        System.out.println(jenisLaundry.getJenisLaundry(idLaundry.get(j))+"\t"+jumlah);
        Transaksi.setTransaksi(jenisLaundry, idClient, idClient, jumlah);
    }
    
    System.out.println("Total belanja = "+total);
    Client.editSaldo(idClient, Client.getSaldo(idClient)-total);
}
    public void setTransaksi(JenisLaundry jenislaundry, int idClient, int idLaundry, int banyak) {
        this.idCLient.add(idClient);
        this.idLaundry.add(idLaundry);
        this.banyak.add(banyak);
        jenislaundry.editDurasi(idLaundry, jenislaundry.getHarga(idLaundry) - banyak);
    }

    public int idjenislaundry(int id) {
        return this.idLaundry.get(id);
    }

    public int getBanyak(int id) {
        return this.banyak.get(id);
    }

    public int idclient(int id) {
        return this.idLaundry.get(id);
    }

    public int getJmlTransaksi() {
        return this.idCLient.size();
    }

    

    int getIdLaundry(int i) {
        return this.idLaundry.get(i);
    }
}
        