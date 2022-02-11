package emrahyildiz_hw1;


import java.util.Random ;


      
public class cMatrix {
 private long [][] elements;
 private int row; 
 private int col; 
 private int count;
 private long last;
 private long[][] carry;
  
 
 public cMatrix(){ 
            
             count=0;
             row=10;
             col=10;
             elements=new long[row][col];     
             carry=new long[row][col];  
 }

 public cMatrix(int row, int col){
            this.row=row;
            this.col=col;
            elements=new long[row][col];
            carry=new long[row][col];  
     
 }
 public void AssignRandom(){ 
            Random rand=new Random();
            for(int i=0;i<row;i++) {
                for(int j=0;j<col;j++) {
                    
                    elements[i][j]=rand.nextInt(10000);
                    } }
 }
 public void printMatrix(){
     for(int i=0;i<row;i++) {
     for(int j=0;j<col;j++) {

 System.out.print(elements[i][j]+" ");
     }
     System.out.println();    
 }
 }
 public void printMatrixWithPrime(){
     
     for(int i=0;i<row;i++) {
     for(int j=0;j<col;j++) {
     for(int a=2;a<elements[i][j];a++) {
     if(elements[i][j]%a==0) {    
      count++;
        } }
     if (count==0)  
     {System.out.print(elements[i][j]+"* ");
        
     }
     else {
     System.out.print(elements[i][j]+" ");     
     }   
     count=0;
                         
 }
     System.out.println();
      }
 }
 
    
 public cMatrix multiplyMatrices(cMatrix Multiplicand){  
   long startTime=System.currentTimeMillis();
   
       last=0;
              
     for(int i=0;i<row;i++) {
     for(int j=0;j<Multiplicand.col;j++){
     for(int b=0;b<Multiplicand.row;b++) { 
     last+=((elements[i][b])*(Multiplicand.elements[b][j]));
             
     }  
     carry[i][j]=last;
     last=0;
     }     
}       
   long stopTime=System.currentTimeMillis();
    cMatrix result=new cMatrix(row,Multiplicand.col);
    result.elements=carry;
  
   long reactionTime=stopTime-startTime;
System.out.println("The duration of multiplication of matrices " +row+"x"+col+" * " +Multiplicand.row+"x"+Multiplicand.col+" is " +reactionTime+" milisecond");
System.out.println(" ");
 return result;
 }

}
