import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rifki
 */
public class Tugas1 {
        public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int[] n = new int[7];
        int kecil=100,besar=-100,jumlah=0;
        for (int i=1; i<=n.length; i++)
        {
          System.out.print("Masukan Praktikum ke-"+i+" = ");
          n[i-1] = inputUser.nextInt();
		  
          if(n[i-1]<kecil)
              kecil=n[i-1];
		  
          if(n[i-1]>besar)
              besar=n[i-1];
		  
          jumlah+=n[i-1];

        }
        float rata=jumlah/n.length;
		
        System.out.println("\nNilai Praktikum anda Nilai terkecil   = "+kecil);
        System.out.println("Nilai Praktikum anda terbesar         = "+besar);
        System.out.println("Nilai Praktikum anda rata-rata        = "+rata);
		
        for (int i=1; i<=n.length; i++)
        {  
          System.out.print(n[i-1]+" ");
        }
        System.out.println(" ");
    }
     
}
