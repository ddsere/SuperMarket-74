package lk.ijse.supermarketfx.dao.custom;

import lk.ijse.supermarketfx.dao.SuperDAO;

public interface QueryDAO extends SuperDAO {
    void findFullOrderDataByCustomerId(String customerId);
}
