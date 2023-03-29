package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Forest;
import dmacc.repo.IForestRepo;
import jakarta.validation.Valid;

@Controller
public class ForestController {
	@Autowired
	IForestRepo repo;
	
    @GetMapping("/")
    public String getForm(Forest student) {
        return "index";
    }
	
    @PostMapping("/save-forest")
    public String saveForestDetails(@Valid Forest forest, Errors errors, Model model) {
    	if (null != errors && errors.getErrorCount() > 0) {
            return "index";
        } else {
        	repo.save(forest);
            model.addAttribute("successMsg", "Details saved successfully!!");
            return "success";
        }
    }

}
