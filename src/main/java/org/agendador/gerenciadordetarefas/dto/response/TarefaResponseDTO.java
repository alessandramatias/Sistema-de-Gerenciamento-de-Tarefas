package org.agendador.gerenciadordetarefas.dto.response;

import org.agendador.gerenciadordetarefas.entity.Status;

public record TarefaResponseDTO(
        Long id,

        String titulo,

        String descricao,

        Status status,

        Long usuarioId) {
}
