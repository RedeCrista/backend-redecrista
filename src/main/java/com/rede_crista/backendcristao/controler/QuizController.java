package com.rede_crista.backendcristao.controler;

import com.rede_crista.backendcristao.model.QuizResult;
import com.rede_crista.backendcristao.repository.QuizResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/quiz")
@CrossOrigin(origins = "*") // Permite acesso do app Android
public class QuizController {

    @Autowired
    private QuizResultRepository quizResultRepository;

    @PostMapping("/salvar")
    public QuizResult salvarResultado(@RequestBody QuizResult resultado) {
        return quizResultRepository.save(resultado);
    }
}
