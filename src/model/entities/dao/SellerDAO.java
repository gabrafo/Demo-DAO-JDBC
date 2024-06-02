package model.entities.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDAO {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(int id);
    Seller findById(int id);
    List<Seller> findAll();
}
