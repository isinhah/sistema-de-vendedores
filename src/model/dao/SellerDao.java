package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

//operações para o uso com banco de dados
public interface SellerDao {

    void insert(Department obj);
    void update(Department Obj);
    void deleteById(Integer id);
    Seller findById(Integer id); //se o id não existir: retorna null
    List<Seller> findAll(); //retorna todos os vendedores
}
