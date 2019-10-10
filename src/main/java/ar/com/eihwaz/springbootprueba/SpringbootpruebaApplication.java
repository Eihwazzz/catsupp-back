package ar.com.eihwaz.springbootprueba;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootpruebaApplication {

	
	@Autowired
    DataSource dataSource;
 
    @Autowired
    PlatoRepository platoRepository;
    
	public static void main(String[] args) {
		SpringApplication.run(SpringbootpruebaApplication.class, args);
	}

	public void run(String... args) throws Exception {
        System.out.println("Our DataSource is = " + dataSource);
        Iterable<Plato> platoList = platoRepository.findAll();
        for(Plato platoModel:platoList){
            System.out.println("Here is a plato: " + platoModel.toString());
        }
    }
	
}
