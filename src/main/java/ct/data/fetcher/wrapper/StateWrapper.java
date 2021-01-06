package ct.data.fetcher.wrapper;

import ct.data.fetcher.dto.StateDTO;
import lombok.Data;

import java.util.List;

@Data
public class StateWrapper {

    private List<StateDTO> states;
}
