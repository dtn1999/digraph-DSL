package graphqllite._parser;

import graphqllite._ast.ASTSchema;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("The Parser should ")
class GraphQLLiteParserTest {


    @ParameterizedTest
    @CsvSource({
            "src/test/resources/ValidInputEmptySchema.glite",
            "src/test/resources/ValidInputSchema1.glite",
            "src/test/resources/ValidInputSchema2.glite",
            "src/test/resources/ValidInputSchema3.glite",
            "src/test/resources/ValidInputSchema4.glite"
    })
    public  void parse_without_problem_valid_mode(String fileInput) throws IOException {
        GraphQLLiteParser parser = new GraphQLLiteParser();
        Optional<ASTSchema> ast = parser.parse(fileInput);
        assertTrue(ast.isPresent());
    }

}