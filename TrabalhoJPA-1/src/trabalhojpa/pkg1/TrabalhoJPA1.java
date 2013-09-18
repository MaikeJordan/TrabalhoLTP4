/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojpa.pkg1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author HERICK
 */
public class TrabalhoJPA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManager manager;
        EntityManagerFactory factory;
        
        factory = Persistence.createEntityManagerFactory("TrabalhoJPA");
        manager = factory.createEntityManager();
        
    }
}
