package com.example.desaparecidos.controllers;

import com.example.desaparecidos.models.PessoaDesaparecida;
import com.example.desaparecidos.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "cadastrar";
    }

    @PostMapping("/cadastrar")
    public String cadastrar(PessoaDesaparecida pessoa) {
        pessoaRepository.save(pessoa);
        return "redirect:/listar";
    }

//     @GetMapping("/cadastrar")
//     public String exibirFormulario(Model model) {
//         model.addAttribute("pessoa", new PessoaDesaparecida());
//         return "cadastrar";
//     }

//    @PostMapping("/cadastrar")
//     public String salvar(@ModelAttribute PessoaDesaparecida pessoa) {
//     pessoaRepository.save(pessoa);
//     return "redirect:/listar";
// }


    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("pessoas", pessoaRepository.findAll());
        return "listar";
    }

    @GetMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id) {
        pessoaRepository.deleteById(id);
        return "redirect:/listar";
    }
}






// package com.example.desaparecidos.controllers;


// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;
// import com.example.desaparecidos.models.PessoaDesaparecida;
// import com.example.desaparecidos.repository.PessoaRepository;

// @RestController
// @RequestMapping("/pessoas")
// public class PessoaController {

//     @Autowired
//     private PessoaRepository pessoaRepository;

//     // LISTAR todas as pessoas desaparecidas
//     @GetMapping
//     public List<PessoaDesaparecida> listar() {
//         return (List<PessoaDesaparecida>) pessoaRepository.findAll();
//     }

//     // CADASTRAR uma nova pessoa desaparecida
//      @RequestMapping(value="/cadastrar", method=RequestMethod.GET)
//     public String cadastrar(){
//         return "cadastrar";
//     }
//     @RequestMapping(value="/cadastrar", method=RequestMethod.POST)
//     public String cadastrar(PessoaDesaparecida usuario) {
//         pessoaRepository.save(usuario);
//         return "redirect:/";

//     }

//     // DELETAR uma pessoa desaparecida pelo id
//     @DeleteMapping("/{id}")
//     public void deletar(@PathVariable Long id) {
//         pessoaRepository.deleteById(id);
//     }
// }
