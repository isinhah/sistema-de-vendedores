package model.dao;

import model.entities.Department;

import java.util.List;

//operações para o uso com banco de dados
public interface DepartmentDao {

    void insert(Department obj);
    void update(Department Obj);
    void deleteById(Integer id);
    Department findById(Integer id); //se o id não existir: retorna null
    List<Department> findAll(); //retorna todos os departamentos
}
