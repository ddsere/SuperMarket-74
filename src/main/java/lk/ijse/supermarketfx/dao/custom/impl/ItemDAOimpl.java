package lk.ijse.supermarketfx.dao.custom.impl;

import lk.ijse.supermarketfx.dao.CustomerDAO;
import lk.ijse.supermarketfx.dao.ItemDAO;
import lk.ijse.supermarketfx.dao.custom.CrudDAO;
import lk.ijse.supermarketfx.entity.Customer;
import lk.ijse.supermarketfx.entity.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDAOimpl implements ItemDAO {

    @Override
    public List<Customer> getAll() {
        return List.of();
    }

    @Override
    public String getNextId() {
        return "";
    }

    @Override
    public boolean save(Customer customer) {
        return false;
    }

    @Override
    public boolean update(Customer customer) {
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
    public Customer findById(String id) {
        return null;
    }
}
