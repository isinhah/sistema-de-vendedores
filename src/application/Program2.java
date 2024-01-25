package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 3: DEPARTMENT FindAll ===");
        List<Department> list = new ArrayList<>();
        for (Department dep : list) {
            System.out.println(dep);
        }

        System.out.println("=== TEST 2: DEPARTMENT FindById ===");
        Department department0 = departmentDao.findById(1);
        System.out.println(department0);

        System.out.println("=== TEST 3: DEPARTMENT Insert ===");
        Department department1 = new Department(null, "Teste");
        departmentDao.insert(department1);
        System.out.println("Novo departamento inserido: " + department1.getName());

        System.out.println("=== TEST 4: DEPARTMENT Update ===");
        Department department2 = departmentDao.findById(8);
        department2.setName("Food");
        departmentDao.update(department2);
        System.out.println("Departamento atualizado. Id: " + department2.getId());

        System.out.println("=== TEST 4: DEPARTMENT Delete ===");
        System.out.println("Insira o Id do departamento que será excluido: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Id excluido: " + id);

        sc.close();
    }
}
