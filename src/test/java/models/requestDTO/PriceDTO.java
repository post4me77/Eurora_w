package models.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class PriceDTO {
	//TODO enum ??
	String currency;
	Double value;
}
