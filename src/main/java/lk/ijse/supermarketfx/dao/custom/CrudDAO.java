package lk.ijse.supermarketfx.dao.custom;

import java.util.ArrayList;
import java.util.List;

public interface CrudDAO <T> {
    List<T> getAll();
    String getNextId();

    boolean save(T t);
    boolean update(T t);
    boolean delete(String id);

    ArrayList<String> getAllIds();
    T findById(String id);
}
