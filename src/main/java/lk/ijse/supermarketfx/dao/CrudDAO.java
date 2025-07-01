package lk.ijse.supermarketfx.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface CrudDAO <T> extends SuperDAO{
    List<T> getAll() throws SQLException;
    String getNextId();

    boolean save(T t);
    boolean update(T t);
    boolean delete(String id);

    ArrayList<String> getAllIds();
    Optional <T> findById(String id);
}
