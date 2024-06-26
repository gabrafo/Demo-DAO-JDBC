package model.entities.dao;

import db.DB;
import model.entities.dao.impl.DepartmentDaoJDBC;
import model.entities.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDAO() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDAO() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
