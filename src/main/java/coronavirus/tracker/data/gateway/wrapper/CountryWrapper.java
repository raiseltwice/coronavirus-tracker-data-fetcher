package coronavirus.tracker.data.gateway.wrapper;

import coronavirus.tracker.data.gateway.dto.CountryDTO;
import lombok.Data;

import java.util.List;

@Data
public class CountryWrapper {

    private List<CountryDTO> countries;
}
