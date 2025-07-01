package lk.ijse.supermarketfx.dao.custom.impl;

import lk.ijse.supermarketfx.dao.OrderDAO;
import lk.ijse.supermarketfx.entity.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderDAOimpl implements OrderDAO {
    @Override
    public List<Order> getAll() {
        return List.of();
    }

    @Override
    public String getNextId() {
        return "";
    }

    @Override
    public boolean save(Order order) {
        return false;
    }

    @Override
    public boolean update(Order order) {
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
    public Order findById(String id) {
        return null;
    }
}
