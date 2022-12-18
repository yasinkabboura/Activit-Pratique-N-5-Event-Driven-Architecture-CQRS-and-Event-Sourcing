package com.eyasin.comptecqrs.commands.services;



import com.eyasin.comptecqrs.commands.dto.CreateAccountRequestDTO;
import com.eyasin.comptecqrs.commands.dto.CreditAccountRequestDTO;
import com.eyasin.comptecqrs.commands.dto.DebitAccountRequestDTO;


import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {
    CompletableFuture<String> createAccount(CreateAccountRequestDTO accountRequestDTO);
    CompletableFuture<String> debitAccount(DebitAccountRequestDTO debitAccountRequestDTO);
    CompletableFuture<String> creditAccount(CreditAccountRequestDTO creditAccountRequestDTO);
}
