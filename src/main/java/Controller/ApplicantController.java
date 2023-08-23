package Controller;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.controller.PostMappi;
import com.example.model.Applicant;

import Security_Mapping.RequestPara;

public class ApplicantController {

    @PostMappi("/register")
    public String registerApplicant(Applicant applicant,
                                    @RequestPara("photo") MultipartFile photo,
                                    RedirectAttributes redirectAttributes) {
        if (!photo.isEmpty()) {
            byte[] photoBytes = photo.getBytes();
        }
        redirectAttributes.addFlashAttribute("message", "Applicant registered successfully!");
        return "redirect:/applicants";
    }
}
