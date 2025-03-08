package tn.starter.mysqlShared.dto;

import java.io.Serializable;
import java.time.Instant;


public record CandidatDTO(long id , String nom , String prenom , Integer nbQuiz ) implements Serializable {
}