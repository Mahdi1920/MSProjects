package tn.esprit.quiz_ms.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.starter.mongoShared.controllers.GenericController;
import tn.starter.mongoShared.dto.QuizDTO;

@RestController
@AllArgsConstructor
@RequestMapping("/api/quiz")
public class QuizController extends GenericController<QuizDTO> {

}
