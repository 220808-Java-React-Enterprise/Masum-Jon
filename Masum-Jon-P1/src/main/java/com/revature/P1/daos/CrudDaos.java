package com.revature.P1.daos;

import java.util.List;

public interface CrudDaos<T> {
    void save(T obj);
    void update(T obj);
    void delete(T obj);
    T getById(String id);
    List<T> getAll();
}
