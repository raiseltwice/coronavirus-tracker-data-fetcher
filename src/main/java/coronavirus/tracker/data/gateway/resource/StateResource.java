package coronavirus.tracker.data.gateway.resource;

import coronavirus.tracker.data.gateway.client.StateClient;
import coronavirus.tracker.data.gateway.dto.StateDTO;
import coronavirus.tracker.data.gateway.wrapper.StateWrapper;
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
