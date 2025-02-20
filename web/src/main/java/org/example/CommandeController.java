package org.example;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class CommandeController {
    private ICommande commande;
    @GetMapping("/commandes")
    public String commandeController() {
        return commande.getCommand();
    }
}
