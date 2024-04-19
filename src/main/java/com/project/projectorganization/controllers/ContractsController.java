package com.project.projectorganization.controllers;

import com.project.projectorganization.models.Contract;
import com.project.projectorganization.repo.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContractsController {

    @Autowired
    private ContractRepository contractRepository;

    @GetMapping("/contracts")
    public String contracts(Model model){
        Iterable<Contract> contracts = contractRepository.findAll();
        model.addAttribute("contracts", contracts);
        return "contracts-main";
    }

}
