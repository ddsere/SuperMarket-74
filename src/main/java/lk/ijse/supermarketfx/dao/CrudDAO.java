package lk.ijse.supermarketfx.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface CrudDAO <T> {
    List<T> getAll();
    String getNextId();

    boolean save(T t);
    boolean update(T t);
    boolean delete(String id);

    ArrayList<String> getAllIds();
    Optional <T> findById(String id);
}
