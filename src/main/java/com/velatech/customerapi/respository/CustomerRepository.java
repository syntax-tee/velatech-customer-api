package com.velatech.customerapi.respository;

import com.velatech.customerapi.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query(value = "select c  from customers_table c  where c.bin = :bin", nativeQuery = true)
    Customer findCustomerByBin(@Param("bin") long bin);

    @Modifying
    @Query(value = "UPDATE customers_table SET number_of_hits = (:number_of_hits), WHERE bin = (:bin)",nativeQuery = true)
    int updateCustomerByBin(@Param("number_of_hits") String number_of_hits, @Param("bin") Long bin);
}
