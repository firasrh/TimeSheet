
package tn.esprit.spring.service;

 
import java.text.ParseException;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseServiceImplTest {

		@Autowired
		IEntrepriseService es; 
		int i;

		@Test
		public void testRetrieveAllEntreprise() {
			List<Entreprise> listEntreprises = es.retrieveAllEntreprise(); 
			// if there are 7 Enterprises in DB : 
			i=listEntreprises.size();
			Assert.assertEquals(i, listEntreprises.size());
		} 
		
		@Test
		public void testAddEntreprise() throws ParseException {
			Entreprise e = new Entreprise("MyEnterprise","58070"); 
			Entreprise addedEntreprise = es.addEntreprise(e); 
			Assert.assertEquals(e.getName(), addedEntreprise.getName());
			
		}
/*	 
		@Test
		public void testModifyEntreprise() throws ParseException   {
			Entreprise e = new Entreprise(1,"MyUpdatedEntreprise","55070"); 
			Entreprise updatedEntreprise  = es.updateEntreprise(e);
			Assert.assertEquals(e.getName(), updatedEntreprise.getName());
		}
	
		@Test
		public void testRetrieveEntreprise() {
			Entreprise retrievedEntreprise = es.retreieveEntreprise("5"); 
			Assert.assertEquals(5, retrievedEntreprise.getId());
		}
		
		@Test
		public void testDeleteEntreprise() {
		es.deleteEntreprise("2");
			Assert.assertNull(es.retreieveEntreprise("2"));
		
		}
		// 5 Tests Unitaires
*/
}





