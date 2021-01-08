package ct.data.fetcher.client;

import ct.data.fetcher.dto.CountryDTO;
import ct.data.fetcher.wrapper.CountryWrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "country", url = "${feign.url}")
public interface CountryClient {

    @GetMapping("/countries")
    CountryWrapper getCountries();

    @GetMapping("/countries/{countryName}")
    CountryDTO getCountry(@PathVariable String countryName);
}
