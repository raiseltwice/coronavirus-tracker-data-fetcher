package coronavirus.tracker.data.gateway.client;

import coronavirus.tracker.data.gateway.dto.CasesPerDateDTO;
import coronavirus.tracker.data.gateway.wrapper.CasesPerDateWrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "country-cases-per-date", url = "${feign.url}")
public interface CountryCasesPerDateClient {

    @GetMapping("/countries/{countryName}/cases-per-date")
    CasesPerDateWrapper getCountryCasesPerDateCollection(@PathVariable String countryName);

    @GetMapping("/countries/{countryName}/cases-per-date/{date}")
    CasesPerDateDTO getCountryCasesPerDateByDate(@PathVariable String countryName, @PathVariable String date);
}
