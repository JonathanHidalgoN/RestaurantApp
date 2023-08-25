package com.app.service.Implementation;

import java.util.NoSuchElementException;
import java.util.Optional;

import com.app.model.RestaurantTable;
import com.app.repository.TableRepository;
import com.app.service.TableService;

public class TableServiceImp implements TableService {

    private final TableRepository tableRepository;
    
    public TableServiceImp(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }
    public Iterable<RestaurantTable> getAllTables() {
        return tableRepository.findAll();
    }

    public Optional<RestaurantTable> getTableById(Long id) {
        return tableRepository.findById(id);
    }

    public RestaurantTable saveTable(RestaurantTable order) {
        return tableRepository.save(order);
    }

    public void deleteTableById(Long id) {
        Optional<RestaurantTable> table = tableRepository.findById(id);
        if (table.isPresent()) {
            tableRepository.deleteById(id);
        }
        else {
            throw new NoSuchElementException("Table with id " + id + " does not exist.");
        }
    }
}
