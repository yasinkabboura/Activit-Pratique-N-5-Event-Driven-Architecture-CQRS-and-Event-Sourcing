package com.eyasin.comptecqrs.queries.repository;


import com.eyasin.comptecqrs.queries.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<BankAccount,String> {
}
