package coronavirus.tracker.data.gateway.wrapper;

import coronavirus.tracker.data.gateway.dto.CasesPerDateDTO;
import lombok.Data;

import java.util.List;

@Data
public class CasesPerDateWrapper {

    private List<CasesPerDateDTO> casesPerDateCollection;
}
