package dmacc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Forest;
import dmacc.beans.Location;

@Configuration
public class ForestBeanConfig {
	@Bean
	public Forest forest() {
		Forest forest = new Forest();
		return forest;
	}
	
	@Bean
	public Location location() {
		Location location = new Location();
		return location;
	}

}
