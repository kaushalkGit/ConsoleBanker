package repository;

import domain.Customer;
import domain.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepository {
    private final Map<String, Customer> customersByID=new HashMap<>();

    public List<Customer> findAll() {
        return new ArrayList<>(customersByID.values());
    }

    public void save(Customer c) {
        customersByID.put(c.getId(),c);
    }
}
