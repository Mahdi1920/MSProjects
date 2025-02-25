package tn.starter.mysqlShared.dto;

import lombok.Builder;
import lombok.With;

import java.time.Instant;

@Builder
//@With
public record CandidatDTO(long id , String nom , String prenom , Integer nbQuiz , Instant createdAt,Instant updatedAt) {
}