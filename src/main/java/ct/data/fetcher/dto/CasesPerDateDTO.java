package ct.data.fetcher.dto;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.Data;

import java.time.LocalDate;

// both CountryCasesPerDate and StateCasesPerDate as those hold the same useful(not links) data
@Data
public class CasesPerDateDTO {

    @GraphQLQuery(name = "date")
    private LocalDate date;

    @GraphQLQuery(name = "numberOfCases")
    private Integer numberOfCases;
}
