import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Run {

    @RequestMapping("/")
    String home() {
      String retorno = "Hola Mundo";
      return retorno + " Mola!!";
    }
  
  

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Run.class, args);
    }

}