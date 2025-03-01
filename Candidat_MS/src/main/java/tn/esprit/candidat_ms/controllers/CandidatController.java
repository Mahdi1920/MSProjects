package tn.esprit.candidat_ms.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.candidat_ms.entities.Candidat;
import tn.esprit.candidat_ms.services.ICandidatService;
import tn.starter.mysqlShared.controllers.GenericController;
import tn.starter.mysqlShared.dto.CandidatDTO;
import tn.starter.mysqlShared.dto.QuizDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/candidat")
public class CandidatController extends GenericController<CandidatDTO,Long> {
	private final ICandidatService service;
	@GetMapping("/getQuizById/{id}")
	public QuizDTO getQuizById(@PathVariable String id) {
		return service.getQuizById(id);
	}
	@PutMapping("/put1")
	public Candidat updatecandidat(@RequestBody Candidat c) {
		return service.updatecandidat(c);
	}
}
