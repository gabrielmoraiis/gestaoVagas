package br.com.gabriel.gestao_vagas.modules.candidate.dto;

import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCandidateResponseDTO {
    
    @Schema(example = "Desenvolvedor java")
    private String description;
    @Schema(example = "clara")
    private String username;
    @Schema(example = "clara@gmail.com")
    private String email;

    private UUID id;
    @Schema(example = "Clara Sayuri")
    private String name;
}
