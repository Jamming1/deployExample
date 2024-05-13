package co.develhope.deployExemple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private Environment environment;

    @GetMapping("/")
    public String getDevName(){
        return environment.getProperty("myCostumeVarTree.devName");
    }
}
