package com.eyasin.comptecqrs.commands.services;


import com.eyasin.comptecqrs.commands.commands.CreateAccountCommand;
import com.eyasin.comptecqrs.commands.commands.CreditAccountCommand;
import com.eyasin.comptecqrs.commands.commands.DebitAccountCommand;
import com.eyasin.comptecqrs.commands.dto.CreateAccountRequestDTO;
import com.eyasin.comptecqrs.commands.dto.CreditAccountRequestDTO;
import com.eyasin.comptecqrs.commands.dto.DebitAccountRequestDTO;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Service
public class AccountCommandServiceImpl implements AccountCommandService {
    @Autowired
    private CommandGateway commandGateway;
    @Override
    public CompletableFuture<String> createAccount(CreateAccountRequestDTO accountRequestDTO) {
        return commandGateway.send(new CreateAccountCommand(UUID.randomUUID().toString(), accountRequestDTO.getBalance(), accountRequestDTO.getCurrency()));
    }

    @Override
    public CompletableFuture<String> debitAccount(DebitAccountRequestDTO debitAccountRequestDTO) {
        return commandGateway.send(new DebitAccountCommand(
                debitAccountRequestDTO.getAccountId(),
                debitAccountRequestDTO.getAmount(),
                debitAccountRequestDTO.getCurrency()
        ));
    }

    @Override
    public CompletableFuture<String> creditAccount(CreditAccountRequestDTO creditAccountRequestDTO) {
         return commandGateway.send(new CreditAccountCommand(
                 creditAccountRequestDTO.getAccountId(),
                 creditAccountRequestDTO.getAmount(),
                 creditAccountRequestDTO.getCurrency()
        ));
    }
}
