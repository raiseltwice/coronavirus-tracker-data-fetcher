package coronavirus.tracker.data.gateway.resource;

import coronavirus.tracker.data.gateway.client.StateCasesPerDateClient;
import coronavirus.tracker.data.gateway.dto.CasesPerDateDTO;
import coronavirus.tracker.data.gateway.wrapper.CasesPerDateWrapper;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@GraphQLApi
@RequiredArgsConstructor
public class StateCasesPerDateResource {

    private final StateCasesPerDateClient stateCasesPerDateClient;

    @GraphQLQuery(name = "stateCasesPerDateCollection")
    public List<CasesPerDateDTO> getStateCasesPerDateCollection(String countryName, String stateName) {
        CasesPerDateWrapper casesPerDateWrapper =
                stateCasesPerDateClient.getStateCasesPerDateCollection(countryName, stateName);
        return casesPerDateWrapper.getCasesPerDateCollection();
    }

    @GraphQLQuery(name = "stateCasesPerDate")
    public CasesPerDateDTO getStateCasesPerDate(String countryName, String stateName, String date) {
        return stateCasesPerDateClient.getStateCasesPerDate(countryName, stateName, date);
    }
}
