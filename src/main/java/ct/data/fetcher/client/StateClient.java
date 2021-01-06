package ct.data.fetcher.client;

import ct.data.fetcher.dto.StateDTO;
import ct.data.fetcher.wrapper.StateWrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "state", url = "http://localhost:8081")
public interface StateClient {

    @GetMapping("/countries/{countryName}/states")
    StateWrapper getStates(@PathVariable String countryName);

    @GetMapping("/countries/{countryName}/states/{stateName}")
    StateDTO getState(@PathVariable String countryName, @PathVariable String stateName);
}
