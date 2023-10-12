package br.com.jadygodoi.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

// Interface: modelo, contrato da aplicação, onde tem o modelo dos métodos, sem implementação.
public interface IUserRepository extends JpaRepository<UserModel, UUID>{
    UserModel findByUsername(String username);
}
