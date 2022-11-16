/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phone;

/**
 *
 * @author admin
 */
public class Phone1 {
    private int number;
    private String model;
    private double weght;
    
    private String nameWhoCall;
    private int numberWhoCall;
    public void setNumberWhoCall(int numberWhoCall){
        this.numberWhoCall=numberWhoCall;
    }
    public int getNumberWhoCall(){
        return numberWhoCall;
    }
    
   public Phone1( int number,String nameWhoCall,String model,double weght){
       this.nameWhoCall=nameWhoCall;
       this.number=number;
       this.model=model;
       this.weght=weght;
   }
  

  
    public String WhoCall(String nameWhoCall){
        
       
        System.out.println(nameWhoCall);
         return nameWhoCall;
       
    }

    
   
   
    
}

