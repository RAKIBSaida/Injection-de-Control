package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentationv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Injection de dépendance par instanciation statique
		 * c-à-d nous avons utilisé new
		 */
		/*
		 * la couche dao est fermée à la modification ;elle ne dépend d'aucune classe
		 * elle est ouverte à l'extension
		 */
		/*
		 * la couche métier est fermée à la modification ;elle ne dépend à aucune classe,elle dépend que d'une interface  
		 */
		/*
		 * la classe Presentation n'est pas fermé à la modification
		 * à chaque création d'une nouvelle version de la classe je suis obligées de modifier mon code source
		 */
		DaoImpl dao=new DaoImpl();
		MetierImpl metierImp=new MetierImpl();
		metierImp.setDao(dao);
		System.out.println(metierImp.calcul());
	}

}
