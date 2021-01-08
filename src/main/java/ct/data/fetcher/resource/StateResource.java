package ct.data.fetcher.resource;

import ct.data.fetcher.dto.StateDTO;
import ct.data.fetcher.wrapper.StateWrapper;
import ct.data.fetcher.client.StateClient;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@GraphQLApi
@RequiredArgsConstructor
public class StateResource {

    private final StateClient stateClient;

    @GraphQLQuery(name = "states")
    public List<StateDTO> getStates(String countryName) {
        StateWrapper statesWrapper = stateClient.getStates(countryName);
        return statesWrapper.getStates();
    }

    @GraphQLQuery(name = "state")
    public StateDTO getStates(String countryName, String stateName) {
        return stateClient.getState(countryName, stateName);
    }
}
