package models.responseDTO;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
@Builder
public class ResponseDTO {

    String type;
    List<RowsDTO> rows;
}
