package ct.data.fetcher.service;

import ct.data.fetcher.dto.CasesPerDateDTO;
import ct.data.fetcher.client.CountryCasesPerDateClient;
import ct.data.fetcher.wrapper.CasesPerDateWrapper;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@GraphQLApi
@RequiredArgsConstructor
public class CountryCasesPerDateService {

    private final CountryCasesPerDateClient countryCasesPerDateClient;

    @GraphQLQuery(name = "countryCasesPerDateCollection")
    public List<CasesPerDateDTO> getCountryCasesPerDateCollection(String countryName) {
        CasesPerDateWrapper casesPerDateWrapper =
                countryCasesPerDateClient.getCountryCasesPerDateCollection(countryName);
        return casesPerDateWrapper.getCasesPerDateCollection();
    }

    @GraphQLQuery(name = "countryCasesPerDate")
    public CasesPerDateDTO getCountryCasesPerDate(String countryName, String date) {
        return countryCasesPerDateClient.getCountryCasesPerDateByDate(countryName, date);
    }
}
