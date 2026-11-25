package org.agendador.gerenciadordetarefas.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UsuarioRequestDTO(
        @NotBlank(message = "O campo 'nome' não pode ser vazio")
        String nome,

        @NotBlank(message = "O campo 'email' não pode ser vazio")
        @Email
        String email,

        @NotBlank(message = "O campo 'telefone' não pode ser vazio")
        @Size(min = 8, max = 11 , message = " O telefone deve ter entre 8 e 11 digitos sem caracteres especiais , apenas números")
        String telefone

      ) {
}
