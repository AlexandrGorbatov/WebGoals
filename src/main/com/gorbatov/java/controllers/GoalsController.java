package gorbatov.java.controllers;

import gorbatov.java.model.Theme;
import gorbatov.java.services.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Alexandr on 08.09.2014.
 */
@Controller
@RequestMapping("/")
public class GoalsController {

  @Autowired
  private ThemeService themeService;


   @RequestMapping(value = "/add")
   ModelAndView addNewTheme(Model model){
    return new ModelAndView();
   }



    @RequestMapping(value = "/newUser", method = RequestMethod.GET)
    public String getCreateUsePage(@ModelAttribute Theme person, Model model) {
        person = new Theme();

        model.addAttribute(person);
        return "userRegistration";
    }




}
