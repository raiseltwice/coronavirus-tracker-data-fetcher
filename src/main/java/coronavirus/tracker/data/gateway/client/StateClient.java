package coronavirus.tracker.data.gateway.client;

import coronavirus.tracker.data.gateway.dto.StateDTO;
import coronavirus.tracker.data.gateway.wrapper.StateWrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "state", url = "${feign.url}")
public interface StateClient {

    @GetMapping("/countries/{countryName}/states")
    StateWrapper getStates(@PathVariable String countryName);

    @GetMapping("/countries/{countryName}/states/{stateName}")
    StateDTO getState(@PathVariable String countryName, @PathVariable String stateName);
}
