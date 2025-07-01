package lk.ijse.supermarketfx.dao.custom.impl;

import lk.ijse.supermarketfx.dao.custom.CustomerDAO;
import lk.ijse.supermarketfx.entity.Customer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerDAOimpl implements CustomerDAO {
    @Override
    public List<Customer> getAll() throws SQLException {
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
    public Optional<Customer> findById(String id) {
        return Optional.empty();
    }
}
