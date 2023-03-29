package dmacc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Forest {
	@Id
	@GeneratedValue
	private int id;
	@NotNull(message = "Enter a name")
    @Size(max = 1000, min = 1, message = "Must be between 1-1000 characters")
	private String name;
    @NotNull(message = "Enter a size")
    @Min(value = 1, message = "Size must be non-zero")
	private int size;
	//@Autowired
	//private Location loc;

}
