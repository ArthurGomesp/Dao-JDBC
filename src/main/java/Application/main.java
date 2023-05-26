package Application;

import Models.Dao.DaoFactory;
import Models.Dao.SellerDao;
import Models.Department;
import Models.Seller;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        Department department = new Department("It security", 01);
        System.out.println(department);

        Seller seller = new Seller(1, "Arthur", "ag@gmail.com", new Date(), 1000.0, department);
        System.out.println(seller);

        SellerDao sellerDao = DaoFactory.CreateSellerDao();


    }
}
