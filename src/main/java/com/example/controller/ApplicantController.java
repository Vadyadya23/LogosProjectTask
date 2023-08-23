package com.example.controller;

import com.example.model.Applicant;

import Security_Mapping.GetMapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

public class ApplicantController {
    private List<Applicant> applicants = new ArrayList<>();

    @GetMapp("/register")
    public String registrationForm(Model model) {
        model.addAttribute("applicant", new Applicant());
        return "registrationForm"; // Create a registration form view
    }

    @PostMappi("/register")
    public String registerApplicant(Applicant applicant) {
        applicants.add(applicant);
        return "redirect:/applicants"; // Redirect to the list of applicants
    }

    @GetMappi("/applicants")
    public String allApplicants(Model model) {
        model.addAttribute("applicants", applicants);
        return "allApplicants"; // Create a view to display all applicants
    }
}

