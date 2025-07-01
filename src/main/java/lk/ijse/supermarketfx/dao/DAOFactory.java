package lk.ijse.supermarketfx.dao;

import lk.ijse.supermarketfx.dao.custom.CustomerDAO;
import lk.ijse.supermarketfx.dao.custom.impl.*;

public class DAOFactory {
    private static DAOFactory daoFactory;
    private DAOFactory() {}

    public static DAOFactory getInstance() {
        return daoFactory == null ? daoFactory = new DAOFactory() : daoFactory;
    }

    public <T extends SuperDAO> T getDAO (DAOTypes daoTypes){
        switch (daoTypes){
            case CUSTOMER : return (T) new CustomerDAOimpl();
            case ITEM : return (T) new ItemDAOimpl();
            case ORDER : return (T) new OrderDAOimpl();
            case ORDER_DETAIS : return (T) new OrderDetailsDAOimpl();
            case QUERY : return (T) new QueryDAOimpl();
            default : return null;
        }
    }
}
