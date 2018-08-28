/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

/**
 *
 * @author CRex64
 */
public class BookStore {
    private int idBarang;
    private String namaBarang;
    private String merekBarang;
    public static int hargaBarang;
    
    public BookStore (int idBrg, String namaBrg, int hargaBrg, String merkBrg){
        this.idBarang = idBrg;
        this.namaBarang = namaBrg;
        this.hargaBarang = hargaBrg;
        this.merekBarang = merkBrg;
    }
    
    public void info(){
        System.out.println("Id Barang       : " + this.idBarang);
        System.out.println("Nama Barang     : " + this.namaBarang);
        System.out.println("Harga Barang    : " + this.hargaBarang);
        System.out.println("Merek Barang    : " + this.merekBarang);
    }
}