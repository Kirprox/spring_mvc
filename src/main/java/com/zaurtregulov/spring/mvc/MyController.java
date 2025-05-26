package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        Employee emp = new Employee();//создание объекта и присвоение через сеттеры нужно
        emp.setName("Ivan");          //чтобы показать, что во вью ask-emp-details-view
        emp.setSurname("petrov");     //используются геттеры а так
        emp.setSalary(500);           //можно сразу писать new Employee в добавлении атрибута
        model.addAttribute("employee", emp);
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee emp) {
        String name = emp.getName();      //тело метода в данном методе показывает,
        emp.setName("mr " + name);        //что можно изменить значения, перед возвращением
        String surname = emp.getSurname();//show-emp-details-view
        emp.setSurname(surname + "!");
        int salary = emp.getSalary();
        emp.setSalary(salary * 10);
        return "show-emp-details-view";
    }
}
