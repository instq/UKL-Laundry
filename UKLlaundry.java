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
public class UKLlaundry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        client c=new client();
        petugas p=new petugas();
        JenisLaundry j=new JenisLaundry();
        transaksi t=new transaksi();
        laporan l=new laporan();
        
        l.Laporan(p);
        l.laporan(j);
        l.laporan(c);
        l.laporan(t, j);
        t.prosesTransaksi(c, t, j);
        l.laporan(t, j);
        l.laporan(j);
        l.laporan(c);
    }
    }