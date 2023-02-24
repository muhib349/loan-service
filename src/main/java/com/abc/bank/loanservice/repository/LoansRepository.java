package com.abc.bank.loanservice.repository;

import java.util.List;

import com.abc.bank.loanservice.model.Loans;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoansRepository extends CrudRepository<Loans, Long> {
    List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);

}
