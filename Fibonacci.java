/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author gagandeep gahir
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fnum=0,snum=1,total;
        System.out.println(fnum + "\n"+ snum);
         for(int i=2;i<15;i++){
         total=fnum+snum;
         fnum=snum;
         snum=total;
         System.out.println(total);
         }
    }
    
}
