package br.com.gabriel.gestao_vagas.modules.candidate.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthCandidateResponseDTO {
    
    private String access_token;
    private Long expires_in;
    private List<String> roles;

}
