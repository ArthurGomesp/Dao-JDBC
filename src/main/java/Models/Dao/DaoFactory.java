package Models.Dao;

import Models.Impl.SellerDaoJdbc;
import DataBase.DB;
import Models.Dao.DepartmentDao;
import Models.Dao.SellerDao;
public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDao(DB.getConnection());
    }
}
