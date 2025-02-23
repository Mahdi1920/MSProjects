package tn.starter.mongoShared.dto;

import lombok.Builder;

@Builder
public record CandidatDTO(long id , String nom , String prenom , Integer nbQuiz) {
}