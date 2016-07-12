package crud;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Stati;

public class FindObject 
{
	private static EntityManagerFactory emf;
    private static EntityManager em;   
 
   
    public static void main (String[] a)
    {
    	logicaJPA("MercurioJpa");
    	try {
			findStati();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
    
    public static void logicaJPA(String persistenceUnitName) {
        emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        em = emf.createEntityManager();
    }
 
    
    public static void findStati() throws Exception
	{
		/*
		Stati stato = em.find(Stati.class , 1 );
		System.out.println("STATO DESCRIZIONE " + stato.getDescrizione());
		*/
		
		
		Query q = em.createNamedQuery("Stati.findAll");
		List<Stati> ls = q.getResultList();
		
		System.out.println("ls size " + ls.size());
		for(model.Stati stato : ls )
		{
			System.out.println("DESCRIZIONE=" + stato.getDescrizione());
		}
	}
    
    
    
    
}
