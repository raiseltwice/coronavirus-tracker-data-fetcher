package coronavirus.tracker.data.gateway.wrapper;

import coronavirus.tracker.data.gateway.dto.StateDTO;
import lombok.Data;

import java.util.List;

@Data
public class StateWrapper {

    private List<StateDTO> states;
}
