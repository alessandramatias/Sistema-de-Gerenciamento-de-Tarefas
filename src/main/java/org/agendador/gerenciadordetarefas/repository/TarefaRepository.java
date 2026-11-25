package org.agendador.gerenciadordetarefas.repository;

import org.agendador.gerenciadordetarefas.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa,Long> {
}
