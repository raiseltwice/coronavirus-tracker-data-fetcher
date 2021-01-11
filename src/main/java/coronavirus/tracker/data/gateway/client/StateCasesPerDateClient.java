package coronavirus.tracker.data.gateway.client;

import coronavirus.tracker.data.gateway.dto.CasesPerDateDTO;
import coronavirus.tracker.data.gateway.wrapper.CasesPerDateWrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "state-cases-per-date", url = "${feign.url}")
public interface StateCasesPerDateClient {

    @GetMapping("/countries/{countryName}/states/{stateName}/cases-per-date")
    CasesPerDateWrapper getStateCasesPerDateCollection(@PathVariable String countryName, @PathVariable String stateName);

    @GetMapping("/countries/{countryName}/states/{stateName}/cases-per-date/{date}")
    CasesPerDateDTO getStateCasesPerDate(@PathVariable String countryName,
                                         @PathVariable String stateName,
                                         @PathVariable String date);
}
