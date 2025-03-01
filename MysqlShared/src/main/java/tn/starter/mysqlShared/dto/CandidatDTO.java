package tn.starter.mysqlShared.dto;

import java.time.Instant;


public record CandidatDTO(long id , String nom , String prenom , Integer nbQuiz , Instant createdAt,Instant updatedAt) {
}