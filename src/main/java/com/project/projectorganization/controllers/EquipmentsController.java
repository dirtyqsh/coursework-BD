package com.project.projectorganization.controllers;


import com.project.projectorganization.models.Equipment;
import com.project.projectorganization.repo.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EquipmentsController {

    @Autowired
    private EquipmentRepository equipmentRepository;

    @GetMapping("/equipments")
    public String equipments(Model model){
        Iterable<Equipment> equipments = equipmentRepository.findAll();
        model.addAttribute("equipments", equipments);
        return "equipments-main";
    }

}
