package metier;

import dao.IDao;

public class MetierImpl implements IMetier{

	/*
	 * pour utiliser le principe de couplage faible on utilise un objet de type IDao
	 */
	/*
	 * la meilleure façon de coder c'est d'utiliser le couplage faible ;on n'utilise pas "new"(instantiation d'une classe)
	 */
	private IDao dao;
	
	public IDao getDao() {
		return dao;
	}
	public void setDao(IDao dao) {
		this.dao = dao;
	}
	
	@Override
	public double calcul() {
		// TODO Auto-generated method stub
		double temp=dao.getTemperature();
		double res=temp*12;
		return res;
	}

}
