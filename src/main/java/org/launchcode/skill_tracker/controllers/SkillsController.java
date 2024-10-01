package org.launchcode.skill_tracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @PostMapping("form")
    @ResponseBody
    public String submit(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3){
        return
                "<html>" +
                        "<body>" +
                            "<h1>" + name + "</h1>" +
                            "<ol>" +
                            "<li>"+ language1+"</li>"+
                            "<li>"+ language2+"</li>"+
                            "<li>"+ language3+"</li>"+
                            "</ol>" +


                        "<table style='width:100%' border='1px solid black'>" +
                          "<tr>"+
                            "<td>"+ 1 +"</td>"+
                            "<td>" +language1+"</td>"+
                          "</tr>"+
                            "<tr>"+
                                "<td>"+ 2 +"</td>"+
                                "<td>" +language2+"</td>"+
                            "</tr>"+
                            "<tr>"+
                                "<td>"+ 3 +"</td>"+
                                "<td>" +language3+"</td>"+
                            "</tr>"+
                        "</table>"+

                "</body>" +

                "</html>";
    }


    @GetMapping("form")
    @ResponseBody
    public String form() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>" +
                        "Skills Tracker" +
                        "</h1>" +
                        "<h2>" +
                        "We have a few skills we would like to learn. Here is the list!" +
                        "</h2>"+
                        "<ol>" +
                        "<li>Java</li>"+
                        "<li>JavaScript</li>"+
                        "<li>Python</li>"+
                        "</ol>" +

                        "<form method = 'post' action = '/form'>" +
                        "<p>Name:</p>"+
                        "<input type = 'text' name = 'name' />" +
                        "<br>"+

                        "<label for='language-select'>"+"My favorite language: "+"</label>"+
                        "<br>"+
                            "<select name='language1' id='language-select'>"+
                              "<option value='Java'>"+"Java"+"</option>"+
                              "<option value='JavaScript'>"+"Javascript"+"</option>"+
                              "<option value='Python'>"+ "Python"+ "</option>"+
                            "</select>"+

                        "<br>"+
                        "<label for='language-select'>"+"My second favorite language: "+"</label>"+
                        "<br>"+
                            "<select name='language2' id='language-select'>"+
                                "<option value='Java'>"+"Java"+"</option>"+
                                "<option value='JavaScript'>"+"Javascript"+"</option>"+
                                "<option value='Python'>"+ "Python"+ "</option>"+
                            "</select>"+


                        "<br>"+
                        "<label for='language-select'>"+"My third favorite language: "+"</label>"+
                        "<br>"+
                            "<select name='language3' id='language-select'>"+
                                "<option value='Java'>"+"Java"+"</option>"+
                                "<option value='JavaScript'>"+"Javascript"+"</option>"+
                                "<option value='Python'>"+ "Python"+ "</option>"+
                            "</select>"+
                        "<br>"+

                        "<input type = 'submit' value = 'Submit'/>" +
                        "</form>" +

                        "</body>" +
                        "</html>";
        return html;
    }

}
