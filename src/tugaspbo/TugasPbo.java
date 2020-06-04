 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo;

/**
 *
 * @author Donnix Afrilliando
 */
public class TugasPbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int n=0;
     try{
          n = System.in.read();
     }
    catch(java.io.IOException y){
      System.out.println(y);
    }
     System.out.println("Hasil : "+ (char) n);
    }
    
}
