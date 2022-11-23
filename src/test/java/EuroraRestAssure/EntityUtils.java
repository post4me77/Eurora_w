package EuroraRestAssure;

import models.requestDTO.GoodDTO;
import models.requestDTO.PriceDTO;
import models.requestDTO.RequestDTO;
import java.util.List;


public class EntityUtils {
    /**
     * Completed data
     * */
    public static PriceDTO createPrice() {
        return PriceDTO.builder()
                .currency("EUR")
                .value(11.25).build();
    }
    /**
     * Completed data
     * */
    public static GoodDTO createGoods() {
        return GoodDTO.builder()
                .externalId("123e4567-e89b-12d3-a456-426655440000")
                .gtin("00012345600012")
                .title("Fidget spinners")
                .description("Fidget spinners")
                .hsCode("0101000000")
                .price(createPrice())
                .weight(0.15f)
                .quantity(250)
                .additionalValueShareRatio(1)
                .build();
    }

    /**
     * Completed data
     * */
    public static RequestDTO createRequestDTO() {
        return RequestDTO.builder()
                .externalId("123e4567-e89b-12d3-a456-426655440000")
                .orderCurrency("EUR")
                .transportationPrice(5000.55)
                .insurancePrice(100)
                .otherAdditionalCosts(15.55)
                .originCountry("CN")
                .destinationCountry("EE")
                //TODO Contain null
                //.destinationRegion(null)
                .additionalValueShare("MANUAL")
                .goods(List.of(createGoods()))
                .date("2022-11-21")
                .useDeMinimis(true)
                .hsCodeReplaceAllowed(true)
                .build();
    }
}