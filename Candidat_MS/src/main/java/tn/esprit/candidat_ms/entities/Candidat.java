package tn.esprit.candidat_ms.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.starter.mysqlShared.entities.BaseEntity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Candidat extends BaseEntity {
	String nom;
	String prenom;
	Integer nbQuiz;
}
