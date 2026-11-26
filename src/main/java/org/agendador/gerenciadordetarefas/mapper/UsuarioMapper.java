package org.agendador.gerenciadordetarefas.mapper;

import org.agendador.gerenciadordetarefas.dto.response.UsuarioResponseDTO;
import org.agendador.gerenciadordetarefas.entity.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    UsuarioResponseDTO toDto(Usuario usuario);

    Usuario toEntity(UsuarioResponseDTO dto);
}

