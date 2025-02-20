package org.example.imp;

import org.example.ICommande;
import org.springframework.stereotype.Service;

@Service
public class CommandeImp implements ICommande {
    @Override
    public String getCommand() {
        return "commande de vehicules";
    }
}
