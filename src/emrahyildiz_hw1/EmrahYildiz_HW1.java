
package emrahyildiz_hw1;

import java.util.Timer;


public class EmrahYildiz_HW1 {

    
public static void main(String[] args) throws InterruptedException {
       
cMatrix m1 = new cMatrix();
 m1.AssignRandom();
 m1.printMatrix();
 System.out.println("");
 m1.printMatrixWithPrime();
  System.out.println("");
 cMatrix m2 = new cMatrix(20,20);
 m2.AssignRandom();
 m2.printMatrix();
  System.out.println("");
 cMatrix m3 = new cMatrix(20,20);
 m3.AssignRandom();
 m3.printMatrix();
  System.out.println("");
 cMatrix m4 = new cMatrix();
 m4 = m2.multiplyMatrices(m3);
 m4.printMatrixWithPrime(); 


 
    }   

}

    

       
    
    

