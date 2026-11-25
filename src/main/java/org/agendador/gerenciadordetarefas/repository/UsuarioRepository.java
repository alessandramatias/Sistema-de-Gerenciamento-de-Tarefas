package org.agendador.gerenciadordetarefas.repository;

import org.agendador.gerenciadordetarefas.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
