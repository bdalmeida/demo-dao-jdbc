package model.dao;

<<<<<<< HEAD
import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
=======
public class DaoFactory {

}
>>>>>>> 205264c1e95a2d9e833989e49368dc54850d4b59
