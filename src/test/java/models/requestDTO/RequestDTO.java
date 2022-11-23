package models.requestDTO;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
@Builder
public class RequestDTO {
	String externalId;
	//TODO enum??
	String orderCurrency;
	Double transportationPrice;
	Integer insurancePrice;
	Double otherAdditionalCosts;
	String originCountry;
	String destinationCountry;
	String destinationRegion;
	String additionalValueShare;
	String date;
	Boolean useDeMinimis;
	Boolean hsCodeReplaceAllowed;

	List <GoodDTO> goods;
	
}
