package models.responseDTO;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class RowsDTO {
    String field;
    String reason;
    String message;
}
