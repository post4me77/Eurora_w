package models.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class GoodDTO {
String externalId;
String gtin;
String title;
String description;
String hsCode;
PriceDTO price;
Float weight;
Integer quantity;
Integer additionalValueShareRatio;
}
