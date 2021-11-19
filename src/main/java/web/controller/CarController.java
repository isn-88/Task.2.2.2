package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarsDAO;


@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarsDAO carsDAO;

    @Autowired
    public CarController(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }

    @GetMapping()
    public String cars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count == null || count < 1) {
            model.addAttribute("cars", carsDAO.getCarsAll());
        } else {
            model.addAttribute("cars", carsDAO.getCarsCount(count));
        }
        return "cars";
    }
}
