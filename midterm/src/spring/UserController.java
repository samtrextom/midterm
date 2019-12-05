package spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @RequestMapping("/")
    public String home(){
        return "midterm";
    }

    @RequestMapping("/showForm")
    public String showForm( Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "user-form";
    }

    @RequestMapping("/createProfile")
    public String processForm(@ModelAttribute("user") User user) {
        user.setAvatar("resources/img/"+user.getAvatar()+".png");

        return "confirm";
    }
}
