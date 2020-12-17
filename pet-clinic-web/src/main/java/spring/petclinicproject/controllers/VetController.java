package spring.petclinicproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.petclinicproject.model.Vet;
import spring.petclinicproject.services.map.VetServiceMap;

import java.util.Set;

@Controller
public class VetController {

    private VetServiceMap vetServiceMap;

    public VetController(VetServiceMap vetServiceMap) {
        this.vetServiceMap = vetServiceMap;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String vetList(Model model) {

        Set<Vet> vets = vetServiceMap.findAll();
        model.addAttribute("allVets", vets);

        return "vets/index";
    }
}
