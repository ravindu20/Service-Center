/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jayanthaservicecenter;
import loading.*;
/**
 *
 * @author Ravindu
 */
public class JayanthaServiceCenter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Logo x=new Logo();
         x.setVisible(true);
                    try {
                        Thread.sleep(5000);
                        //Thread.sleep(600);

                    } catch (Exception e) {
                        
                    }
                    x.setVisible(false);
                    
         Welcome y=new Welcome();
        y.setVisible(true);
        try {
                        
                        Thread.sleep(2800);

                    } catch (Exception e) {
                    }y.dispose();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
            
      
                }
                
    
}
