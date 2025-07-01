package lk.ijse.supermarketfx.dao.custom.impl;

import lk.ijse.supermarketfx.dao.custom.OrderDetailsDAO;
import lk.ijse.supermarketfx.entity.OrderDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderDetailsDAOimpl implements OrderDetailsDAO {

    @Override
    public List<OrderDetails> getAll() {
        return List.of();
    }

    @Override
    public String getNextId() {
        return "";
    }

    @Override
    public boolean save(OrderDetails orderDetails) {
        return false;
    }

    @Override
    public boolean update(OrderDetails orderDetails) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public ArrayList<String> getAllIds() {
        return null;
    }

    @Override
    public Optional<OrderDetails> findById(String id) {
        return null;
    }
}
