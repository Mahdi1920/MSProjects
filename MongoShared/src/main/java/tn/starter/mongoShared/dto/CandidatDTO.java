package tn.starter.mongoShared.dto;

import lombok.Builder;

import java.io.Serializable;

@Builder
public record CandidatDTO(long id , String nom , String prenom , Integer nbQuiz) implements Serializable {
}