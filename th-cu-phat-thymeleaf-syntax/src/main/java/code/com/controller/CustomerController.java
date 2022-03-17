package code.com.controller;

import code.com.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @RequestMapping("")
    public ModelAndView showCustomer() {
        ModelAndView modelAndView = new ModelAndView("/index");
        Customer customer = new Customer("Tan Bui", 1);
        modelAndView.addObject("cus" , customer);
        return  modelAndView;
    }
}
