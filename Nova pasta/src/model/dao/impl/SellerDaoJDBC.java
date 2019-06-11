package model.dao.impl;

<<<<<<< HEAD
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.SellerDao;
import model.entities.Department;
=======
import java.util.List;

import model.dao.SellerDao;
>>>>>>> 205264c1e95a2d9e833989e49368dc54850d4b59
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao {

<<<<<<< HEAD
	private Connection conn;
	
	public SellerDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
=======
>>>>>>> 205264c1e95a2d9e833989e49368dc54850d4b59
	@Override
	public void insert(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
<<<<<<< HEAD
	public void deleteById(Integer id) {
=======
	public void deleteByID(Seller obj) {
>>>>>>> 205264c1e95a2d9e833989e49368dc54850d4b59
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seller findById(Integer id) {
<<<<<<< HEAD
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT seller.*,department.Name as DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id "
					+ "WHERE seller.Id = ?");
			
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				Department dep = new Department();
				dep.setId(rs.getInt("DepartmentId"));
				dep.setName(rs.getString("DepName"));
				Seller obj = new Seller();
				obj.setId(rs.getInt("Id"));
				obj.setName(rs.getString("Name"));
				obj.setEmail(rs.getString("Email"));
				obj.setbaseSalary(rs.getDouble("BaseSalary"));
				obj.setBirthDate(rs.getDate("BirthDate"));
				obj.setDepartment(dep);
				return obj;
			}
			return null;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
=======
		// TODO Auto-generated method stub
		return null;
>>>>>>> 205264c1e95a2d9e833989e49368dc54850d4b59
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
<<<<<<< HEAD
}
=======

}
>>>>>>> 205264c1e95a2d9e833989e49368dc54850d4b59
