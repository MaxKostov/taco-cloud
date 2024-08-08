package tacos.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tacos.TacoOrder;
import tacos.data.OrderRepository;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    OrderRepository orderRepository;

    @GetMapping
    public String index(Model model) {
        Iterable<TacoOrder> orders = orderRepository.findAll();
        model.addAttribute("orders", orders);
        return "admin";
    }

    @PostMapping("/deleteAll")
    public String update() {
        orderRepository.deleteAll();
        return "admin";
    }
}
