package com.eyasin.comptecqrs.mappers;


import com.eyasin.comptecqrs.queries.dto.AccountOperationResponseDTO;
import com.eyasin.comptecqrs.queries.dto.BankAccountResponseDTO;
import com.eyasin.comptecqrs.queries.entities.AccountOperation;
import com.eyasin.comptecqrs.queries.entities.BankAccount;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankAccountMapper {
    BankAccountResponseDTO bankAccountToBankAccountDTO(BankAccount bankAccount);
    AccountOperationResponseDTO accountOperationToAccountOperationDTO(AccountOperation accountOperation);
}
