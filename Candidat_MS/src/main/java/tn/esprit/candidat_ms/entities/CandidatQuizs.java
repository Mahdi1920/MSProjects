package tn.esprit.candidat_ms.entities;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.starter.mysqlShared.entities.BaseEntity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CandidatQuizs extends BaseEntity {
	long idCandidat;
	String idQuiz;
}
