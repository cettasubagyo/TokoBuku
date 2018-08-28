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
public class Buyer extends BookStore {
    private String namaBuyer, noTelp, alamat;
    private int idBuyer, total;
    
    public Buyer (String namaBuy, String almt, int idBuy, String noTelp,
    int idBrg,String namaBrg, int hargaBrg,String merekBrg){
        super(idBrg, namaBrg, hargaBrg, merekBrg);
        this.idBuyer = idBuy;
        this.namaBuyer = namaBuy;
        this.noTelp = noTelp;
        this.alamat = almt;
        this.total = total;
    }
        
    public void info (){
        System.out.println("Id Buyer        : " + this.idBuyer);
        System.out.println("Nama Buyer      : " + this.namaBuyer);
        System.out.println("Nomor Telepon   : " + this.noTelp);
        System.out.println("Alamat          : " + this.alamat);
        super.info();
    }
}