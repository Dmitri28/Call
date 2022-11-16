/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phone;

/**
 *
 * @author admin
 */
public class Phone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Phone1 phone1=new Phone1(07,"Jim","Sony",3.27);
       phone1.WhoCall("John");
       phone1.setNumberWhoCall(22334433);
       System.out.println(phone1.getNumberWhoCall());
        
        
        
    }
    
}
