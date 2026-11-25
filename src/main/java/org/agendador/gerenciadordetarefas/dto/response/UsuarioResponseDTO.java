package org.agendador.gerenciadordetarefas.dto.response;

public record UsuarioResponseDTO(
        Long id,

        String nome,

        String email,

        String telefone

       ) {
}
