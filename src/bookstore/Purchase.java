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
public class Purchase extends Buyer{
    public static int total;
    
    public Purchase (String namaBuy, String almt, int idBuy, String noTelp,
    int idBrg,String namaBrg, int hargaBrg,String merekBrg, int total){
        super(namaBuy,almt,idBuy,noTelp,idBrg,namaBrg,hargaBrg,merekBrg);
        this.total=total;
    }
    public void Print(){
        super.info();
        System.out.println("Total Barang    : " + this.total);
    }
    public static void main(String[] args) {
        System.out.println("Pembelian");
        Purchase a = new Purchase("cetta","nahelop",3,"089988887777",5,"Sarung",75000,"Wadimor", 2);
        a.Print();
        System.out.println("Total Harga" + (hargaBarang * total));
                
    }
    
}