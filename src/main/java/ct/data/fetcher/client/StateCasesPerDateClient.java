package ct.data.fetcher.client;

import ct.data.fetcher.dto.CasesPerDateDTO;
import ct.data.fetcher.wrapper.CasesPerDateWrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "state-cases-per-date", url = "http://localhost:8081")
public interface StateCasesPerDateClient {

    @GetMapping("/countries/{countryName}/states/{stateName}/cases-per-date")
    CasesPerDateWrapper getStateCasesPerDateCollection(@PathVariable String countryName, @PathVariable String stateName);

    @GetMapping("/countries/{countryName}/states/{stateName}/cases-per-date/{date}")
    CasesPerDateDTO getStateCasesPerDate(@PathVariable String countryName,
                                         @PathVariable String stateName,
                                         @PathVariable String date);
}
