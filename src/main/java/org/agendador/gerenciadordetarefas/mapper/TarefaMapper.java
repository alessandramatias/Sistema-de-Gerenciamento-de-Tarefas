package org.agendador.gerenciadordetarefas.mapper;

import org.agendador.gerenciadordetarefas.dto.response.TarefaResponseDTO;
import org.agendador.gerenciadordetarefas.entity.Tarefa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefaMapper {
    TarefaResponseDTO toDto(Tarefa tarefa);

    Tarefa toEntity(TarefaResponseDTO dto);
}
