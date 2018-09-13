package com.kosta.bank.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "accounts", collectionResourceRel = "accounts")
public interface AccountRepository extends JpaRepository<Account, Long> {
}
