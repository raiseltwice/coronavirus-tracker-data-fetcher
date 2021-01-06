package ct.data.fetcher.dto;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.Data;

@Data
public class StateDTO {

    @GraphQLQuery(name = "stateName")
    private String stateName;

    @GraphQLQuery(name = "latitude")
    private Double latitude;

    @GraphQLQuery(name = "longitude")
    private Double longitude;
}
