/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IF11_10116497_LATIHAN5;

/**
 *
 * @author Adam jordy
 */
public class Jajargenjang implements BangunDatar {
    int luas,keliling;
    
    final int sisiAb = 50;
    final int sisiBc = 60;
    final int sisiCd = 70;
    final int sisiDa = 80;
    final int alas = 100;
    final int tinggi = 120;
    
    public void hitungluas(){
        luas = alas*tinggi;
        System.out.println("luas Jajargenjang : " +luas);
        
    
    }
    public void hitungkeliling(){
        keliling = sisiAb + sisiBc + sisiCd + sisiDa;
        System.out.println("keliling jajargenjang :" +keliling);
    }
}
