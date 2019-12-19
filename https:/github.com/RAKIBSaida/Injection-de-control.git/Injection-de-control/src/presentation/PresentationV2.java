package presentation;

import java.io.File;
import java.util.Scanner;

import dao.IDao;

/*
 * instantiation dynamique;absence de new pour l'instantiation
 * on introduire un fichier de configuration dans lequel on aura définit les classes que nous aurons les utilisées
 */
public class PresentationV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lire le fichier de configuration
		 */
		try {
			Scanner scanner=new Scanner(new File("config.txt"));
			String daoClassName=scanner.nextLine();
			System.out.println(daoClassName);//lire le nom de la classe
			/*
			 * instancier la classe dynamiquement(charger la classe dynamiquement dans la mémoire)
			 */	
				Class cDao=Class.forName(daoClassName);
				/*
				 * créer une instantiation
				 */
				IDao dao=(IDao) cDao.newInstance();
				System.out.println(dao.getTemperature());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
