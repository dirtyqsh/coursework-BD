package com.project.projectorganization.controllers;


import com.project.projectorganization.models.Client;
import com.project.projectorganization.models.Contract;
import com.project.projectorganization.repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientsController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/clients")
    public String clients(Model model){
        Iterable<Client> clients = clientRepository.findAll();
        model.addAttribute("clients", clients);
        return "clients-main";
    }

}
