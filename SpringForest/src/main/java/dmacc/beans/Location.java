package dmacc.beans;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Location {
	private Float lat;
	private Float lng;
	private String country;
}
