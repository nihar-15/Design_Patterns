/*o edit this template
 */
package com.mycompany.proxydp;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
public class BankProxyServer implements Bank {
private BankServer server =new BankServer();
   /* Account arr[] =new Account[5];
    arr[0]=new Account(101,10000,"Rani");
*/



    
    
    @Override
    public void transfer(Account sender, Account rec, float amt) {
        if(sender.getBal()>amt){
            server.transfer(sender,rec,amt);
        }else{
            System.out.println("Transfer failed");
        }
    }

    @Override
    public void deposit(Account a, float amt) {
        if(a.getAcNo()>10000){
            server.deposit(a, amt);
        }
        
    }

    @Override
    public void withdraw(Account a, float amt) {
        if(a.getBal()>amt){
            server.withdraw(a,amt);
        }else{
            System.out.println("Withdrawl failed");

        }
        
    }
    
}
