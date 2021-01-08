package ct.data.fetcher.resource;

import ct.data.fetcher.dto.CountryDTO;
import ct.data.fetcher.wrapper.CountryWrapper;
import ct.data.fetcher.client.CountryClient;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@GraphQLApi
@RequiredArgsConstructor
public class CountryResource {

    private final CountryClient countryClient;

    @GraphQLQuery(name = "countries")
    public List<CountryDTO> getCountries() {
        CountryWrapper countries = countryClient.getCountries();
        return countries.getCountries();
    }

    @GraphQLQuery(name = "country")
    public CountryDTO getCountries(String countryName) {
        return countryClient.getCountry(countryName);
    }
}
