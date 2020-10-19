
package tugasguru;

import java.util.Scanner;
public class penilangan {


    public static void main(String[] args) {
    Scanner input = new Scanner ( System.in );
        
        System.out.println("===== Daftar Tilang =====");
        System.out.println("masukan baraang yang belum anda bawa berdasarkan angka\njika tidak ada masukan 0");
        daftar();
        int a = input.nextInt();
        if (a == 0) {
            System.out.println("silahkan anda bisa lewat");
        }
        else if (a != 0 && a > 0 && a < 4 ){
            System.out.println("masukan barang yang tidak anda bawa lagi jika tidak ada masukan 0");
            int b = input.nextInt();
        
            if (b == 0){
                bawa(a);
            }
            else if (b == a){
                System.out.println("anda sudah memasukanya, tolong ulangi program dan masukan yang lain");
                
            }
            else if(b > 0 && b < 4 && b != a){
                System.out.println("apakah anda tidak membawa semua barang barang\nmasukan\n1. untuk iya\n0. untuk tidak");
                int c = input.nextInt();
                if (c == 1){
                    System.out.println("anda terkena denda masker, STNK dan SIM");
                }
                if (c == 0){
                    System.out.print("anda terkena ");
                    bawa(a);
                    System.out.print(" dan ");
                    bawa(b);
                }
                else {
                    System.out.println("maaf format yang anda masukan tidak valid");
                }
                
            }
        }
        else {
            System.out.println("maaf format yang anda masukan tidak valid");
        }
        
        
        
        
    }
    public static void daftar(){
        String WajibBawa[] = {"masker", "STNK", "SIM"};
        int a = 0;
        for (String x : WajibBawa){
            a++;
            System.out.println(a+". "+x);
        }
    }
    public static void bawa(int a){
        if (a == 1){
            System.out.print("denda masker 50.000");
        }
        else if (a == 2){
            System.out.print("denda STNK 350.000");
        }
        else if (a == 3){
            System.out.print("denda SIM 500.000");
        }
        /*if (a == 0){
            System.out.println("silahkan anda dapat memasukinya");
        }*/
        else {
            System.out.print("maaf format yang anda masukan tidak valid");
        }
    }
    
}
