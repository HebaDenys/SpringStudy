package com.hebadenysprojects.studyProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hebadenysprojects.studyProject.service.EmployeeService;
import com.hebadenysprojects.studyProject.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeViewController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String viewEmployeePage(Model model) {
        model.addAttribute("employees", employeeService.findAll());
        model.addAttribute("employee", new Employee());  // Aggiungi un oggetto Employee vuoto al modello
        return "employees";  // Questo deve corrispondere al nome del tuo template HTML senza estensione .html
    }

    @PostMapping("/add")
    public String createEmployee(@ModelAttribute Employee employee) {
        employeeService.save(employee);
        return "redirect:/employees";
    }
}
