package coronavirus.tracker.data.gateway.dto;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.Data;

@Data
public class CountryDTO {

    @GraphQLQuery(name = "countryName")
    private String countryName;

    @GraphQLQuery(name = "latitude")
    private Double latitude;

    @GraphQLQuery(name = "longitude")
    private Double longitude;
}
