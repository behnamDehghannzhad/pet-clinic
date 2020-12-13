package spring.petclinicproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.petclinicproject.model.Owner;
import spring.petclinicproject.services.OwnerService;

import java.util.Set;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index","index.html"})
    public String ownerList(Model model) {

        Set<Owner> allOwners = ownerService.findAll();
        model.addAttribute("allOwners", allOwners);

        return "owners/index";
    }
}
