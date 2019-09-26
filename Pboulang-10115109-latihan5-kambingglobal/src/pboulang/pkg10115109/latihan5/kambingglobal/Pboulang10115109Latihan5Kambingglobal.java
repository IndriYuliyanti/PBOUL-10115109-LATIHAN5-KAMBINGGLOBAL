/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan5.kambingglobal;

/**
 *
 * @author User
 */
public class Pboulang10115109Latihan5Kambingglobal {

    int jumlahKambing = 88;
    
    //method menampilkan jumlah kambing
    public void getJumlahKambing() {
            System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("jumlah kambing setelag ditambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
         Pboulang10115109Latihan5Kambingglobal kambingSusu = new Pboulang10115109Latihan5Kambingglobal();
        
        //menampilkan jumlah kambing yang ada saat program pertama
        kambingSusu.getJumlahKambing();
        
        //menambahkan satu kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
  
        
        
        
    }
    
}
