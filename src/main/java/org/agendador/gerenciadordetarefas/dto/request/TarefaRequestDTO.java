package org.agendador.gerenciadordetarefas.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TarefaRequestDTO(

        @NotBlank(message = "O campo 'nome' não pode estar vazio")
        @Size(min = 3, max = 200, message = "O titulo deve ter entre 3 à 200 caracteres")
        String titulo,

        @NotBlank(message = "O campo 'descrição' não pode estar vazio")
        String descricao,

        @NotNull(message = "O campo do usuário não pode estar vazio")
        Long usuarioId
) {
}
