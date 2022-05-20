package graphqllite._cocos;

import de.se_rwth.commons.logging.Log;
import graphqllite.GraphQLLiteTool;
import graphqllite._ast.ASTSchema;
import graphqllite._parser.GraphQLLiteParser;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.util.Optional;

public abstract class AbstractCoCoTest {

    @BeforeAll
    public static void disableFailQuick() {
        Log.enableFailQuick(false);
    }

    public void checkCoCos(String modelFilePath) throws IOException {
        GraphQLLiteTool tool = new GraphQLLiteTool();
        GraphQLLiteParser parser = new GraphQLLiteParser();
        Optional<ASTSchema> ast = parser.parse(modelFilePath);
        tool.runDefaultCoCos(ast.get());
    }
}
