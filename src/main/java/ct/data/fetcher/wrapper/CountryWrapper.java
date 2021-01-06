package ct.data.fetcher.wrapper;

import ct.data.fetcher.dto.CountryDTO;
import lombok.Data;

import java.util.List;

@Data
public class CountryWrapper {

    private List<CountryDTO> countries;
}
