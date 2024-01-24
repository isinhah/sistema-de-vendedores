package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao(); //instanciacao do sellerdao sem expor a implementação

        System.out.println("=== TEST 1: SELLER FindById ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("=== TEST 2: SELLER FindByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("=== TEST 3: SELLER FindAll ===");
        list = sellerDao.findAll();

        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("=== TEST 4: SELLER Insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserido! Id do novo vendedor: " + newSeller.getId());

        System.out.println("=== TEST 4: SELLER Update ===");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Atualização concluida! ");

        System.out.println("=== TEST 4: SELLER Delete ===");
        System.out.println("Insira o id do vendedor que vai ser excluido: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Id excluido. ");

        sc.close();

    }
}
