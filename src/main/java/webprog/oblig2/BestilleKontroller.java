package webprog.oblig2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.ArrayList;

@Controller
@RequestMapping("/bestillinger")
public class BestilleKontroller {

    private List<Bestille> bestillinger = new ArrayList<>();

    @GetMapping
    public String visBookingForm(Model model) {
        model.addAttribute("bestilling", new Bestille());
        return "bestilling";
    }

    @PostMapping("/sende")
    public String sendeBooking(Bestille bestilling, Model model) {
        bestillinger.add(bestilling);
        model.addAttribute("bookings", bestillinger);
        return "bestilling";
    }
}
