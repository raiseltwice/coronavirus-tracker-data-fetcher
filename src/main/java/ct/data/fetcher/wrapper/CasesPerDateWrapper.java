package ct.data.fetcher.wrapper;

import ct.data.fetcher.dto.CasesPerDateDTO;
import lombok.Data;

import java.util.List;

@Data
public class CasesPerDateWrapper {

    private List<CasesPerDateDTO> casesPerDateCollection;
}
