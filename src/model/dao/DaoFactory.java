package model.dao;

import model.dao.impl.SellerDaoJDBC;

//operações estáticas para instanciar o DAO
public class DaoFactory {

    //permite a instanciação do sellerdao
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
