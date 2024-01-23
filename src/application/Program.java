package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao(); //instanciacao do sellerdao sem expor a implementação

        System.out.println("TEST 1: SELLER FindById = 3");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
