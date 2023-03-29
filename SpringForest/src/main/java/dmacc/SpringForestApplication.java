package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Forest;
import dmacc.beans.Location;
import dmacc.config.ForestBeanConfig;
import dmacc.repo.IForestRepo;

@SpringBootApplication
public class SpringForestApplication /*implements CommandLineRunner*/ {
	@Autowired
	IForestRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringForestApplication.class, args);
		
	}
	/*
	@Override
	public void run(String... args) throws Exception {
		doWork();
	}

	

	
	public void doWork() {
		System.out.println("persisting records");
		persistRecords();
		System.out.println("done");
		
		System.out.println("getting records");
		
		for(Forest f : getForests()) {
			System.out.println(f.toString());
			System.out.println(f.getLoc().toString());
		}
		System.out.println("done");
	}
	
	private void persistRecords() {
		ApplicationContext context = new AnnotationConfigApplicationContext(ForestBeanConfig.class);
		Forest forest = context.getBean("forest", Forest.class);
		Location location = context.getBean("location", Location.class);
		
		location.setCountry("Germany");
		location.setLat(10.5f);
		location.setLng(30.3f);
		forest.setName("Black Forest");
		forest.setSize(2500);
		forest.setLoc(location);
		
		repo.save(forest);
	}
	
	private List<Forest> getForests(){
		return repo.findAll();
	}*/
}
