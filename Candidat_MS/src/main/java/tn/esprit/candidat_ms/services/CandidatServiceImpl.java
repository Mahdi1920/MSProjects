package tn.esprit.candidat_ms.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.candidat_ms.entities.Candidat;
import tn.esprit.candidat_ms.feignClients.QuizClient;
import tn.esprit.candidat_ms.repositories.CandidatRepository;
import tn.starter.mysqlShared.dto.CandidatDTO;
import tn.starter.mysqlShared.dto.QuizDTO;
import tn.starter.mysqlShared.services.IGenericServiceImpl;

@Service
@RequiredArgsConstructor
public class CandidatServiceImpl extends IGenericServiceImpl<CandidatDTO,Candidat,Long> implements ICandidatService{
	private final QuizClient quizClient;
	private  final CandidatRepository repository;
	@Override
	public QuizDTO getQuizById(String id) {
		return quizClient.getQuizById(id);
	}

	@Override
	public Candidat updatecandidat(Candidat c) {
		return repository.save(c);
	}
}
