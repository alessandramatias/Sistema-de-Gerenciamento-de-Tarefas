package org.agendador.gerenciadordetarefas.service;

import lombok.AllArgsConstructor;
import org.agendador.gerenciadordetarefas.dto.request.UsuarioRequestDTO;
import org.agendador.gerenciadordetarefas.dto.response.UsuarioResponseDTO;
import org.agendador.gerenciadordetarefas.entity.Usuario;
import org.agendador.gerenciadordetarefas.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioResponseDTO criarUsuario(UsuarioRequestDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setNome(dto.nome());
        usuario.setEmail(dto.email());
        usuario.setTelefone(dto.telefone());

        Usuario usuarioSalvo = usuarioRepository.save(usuario);

        return new UsuarioResponseDTO(
                usuarioSalvo.getId(),
                usuarioSalvo.getNome(),
                usuarioSalvo.getEmail(),
                usuarioSalvo.getTelefone()

        );

    }

}
