package coronavirus.tracker.data.gateway.resource;

import coronavirus.tracker.data.gateway.dto.CasesPerDateDTO;
import coronavirus.tracker.data.gateway.client.CountryCasesPerDateClient;
import coronavirus.tracker.data.gateway.wrapper.CasesPerDateWrapper;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@GraphQLApi
@RequiredArgsConstructor
public class CountryCasesPerDateResource {

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
