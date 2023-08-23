package Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;

import com.example.controller.GetMappi;
import com.example.controller.PostMappi;
import com.example.model.Applicant;

import Security_Mapping.RequestParam;

public class AdminController {

    @GetMappi("/admin/calculateResults")
    public String calculateResults(Model model) {
        List<Applicant> admittedApplicants = new ArrayList<>();
        int passingScore = 60; 
        Applicant[] allApplicants = null;
        for (Applicant applicant : allApplicants) {
            if (applicant.getScores() >= passingScore) {
                admittedApplicants.add(applicant);
            }
        }
        model.addAttribute("admittedApplicants", admittedApplicants);
        return "admittedApplicants"; 
    }
    
    @PostMappi("/admin/registerScores")
    public String registerScores(@RequestParam("applicantId") Long applicantId,
                                 @RequestParam("scores") int scores) {
        return "redirect:/adminPage"; 
    }
}

