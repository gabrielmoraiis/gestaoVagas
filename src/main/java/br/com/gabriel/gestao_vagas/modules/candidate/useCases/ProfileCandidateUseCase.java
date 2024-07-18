package br.com.gabriel.gestao_vagas.modules.candidate.useCases;

import java.util.UUID;

import br.com.gabriel.gestao_vagas.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.gabriel.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.gabriel.gestao_vagas.modules.candidate.dto.ProfileCandidateResponseDTO;

@Service
public class ProfileCandidateUseCase {
    
    @Autowired
    private CandidateRepository candidateRepository;

    public ProfileCandidateResponseDTO execute(UUID idCandidate){
       var candidate = this.candidateRepository.findById(idCandidate)
       .orElseThrow(() -> new UserNotFoundException());

       var candidateDTO = ProfileCandidateResponseDTO.builder()
       .description(candidate.getDescription())
       .email(candidate.getEmail())
       .name(candidate.getName())
       .username(candidate.getUsername())
       .id(candidate.getId())
       .build();

       return candidateDTO;
    }
}
