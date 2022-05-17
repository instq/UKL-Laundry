/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukllaundry;

/**
 *
 * @author Inas
 */
public class laporan {
    public void laporan(JenisLaundry barang){ 
        int x=barang.getJmlJenis();
    

        System.out.println(); 
        System.out.println("Tabel Laundry"); 
        System.out.println();
        System.out.println("Jenis Laundry \tDurasi/jam \tHarga"); 
        for (int i = 0; i < x; i++) {
        System.out.println(barang.getJenisLaundry(i)+"\t"+ barang.getDurasi(i)+"\t\t"+barang.getHarga(i));
        }
    }
    public void Laporan (petugas petugas){
        int x=petugas.getJmlPetugas();
        
        System.out.println(); 
        System.out.println("Tabel Petugas"); 
        System.out.println();
        System.out.println("Jenis Laundry \tDurasi/jam \tHarga"); 
        for (int i = 0; i < x; i++) {
        System.out.println(petugas.getNama(i)+"\t"+ petugas.getAlamat(i)+"\t\t"+petugas.getTelepon(i)+"\t\t"+petugas.getJabatan(i));
        }
        
        }
        public void laporan(client client){ 
        int x=client.getJmlClient();

        System.out.println(); 
        System.out.println("Tabel Client "); 
        System.out.println();
        System.out.println("Nama \tAlamat \t\t\tTelepon \tSaldo"); 
        for (int i = 0; i < x; i++) {
        System.out.println(client.getNama(i)+"\t"+ client.getAlamat(i)+"\t\t"+client.getTelepon(i)+"\t"+ client.getSaldo(i));
        }
    }
       
public void laporan(transaksi transaksi, JenisLaundry barang){ 
            int x=transaksi.getJmlTransaksi();
            
            System.out.println();
            System.out.println("Laporan Transaksi");
            System.out.println();
            System.out.println("Jenis Laundry\tTotal \tHarga \tJumlah");
            
            int total=0;
            for (int i = 0; i < x; i++){
                int jumlah=transaksi.getBanyak(i)*barang.getHarga(transaksi.getIdLaundry(i));
                    total+=jumlah; 
                            
                System.out.println(barang.getJenisLaundry(transaksi.getIdLaundry(i))+"\t"+transaksi.getBanyak(i)+"\t"+barang.getHarga(transaksi.getIdLaundry(i))+"\t"+jumlah);
            }
            System.out.println("Total Omset ="+total);
            }
            }