package me.loda.spring.thymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/profile")
    public String profile(Model model){
        // Tạo ra thông tin
        List<Info> profile = new ArrayList<>();
        profile.add(new Info("fullname", "#"));
        profile.add(new Info("nickname", "#"));
        profile.add(new Info("gmail", "#"));
        profile.add(new Info("facebook", "#"));
        profile.add(new Info("website", "#"));

        // Đưa thông tin vào Model
        model.addAttribute("Profile", profile);

        // TRả về template profile.html
        return "profile";
    }
}
