package hercules.voleipocinhos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Atleta")
public class AtletaController {

    private AtletaService atletaService;

    @GetMapping("/")
    public List<AtletaDTO> listarAtletas() {

    }


}
