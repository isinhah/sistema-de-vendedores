package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

//operações para o uso com banco de dados
public interface SellerDao {

    void insert(Seller obj);

    void update(Seller obj);

    void deleteById(Integer id);
    Seller findById(Integer id); //se o id não existir: retorna null
    List<Seller> findAll(); //retorna todos os vendedores
    List<Seller> findByDepartment(Department department);
}
