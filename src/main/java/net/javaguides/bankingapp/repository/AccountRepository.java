package net.javaguides.bankingapp.repository;

import net.javaguides.bankingapp.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByAccountHolderName(String accountHolderName);
}