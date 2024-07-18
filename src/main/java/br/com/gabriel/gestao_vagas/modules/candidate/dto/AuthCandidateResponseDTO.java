package br.com.gabriel.gestao_vagas.modules.candidate.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthCandidateResponseDTO {
    
    private String access_token;
    private Long exprires_in;

}
