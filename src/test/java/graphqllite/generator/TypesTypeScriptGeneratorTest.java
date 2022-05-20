package graphqllite.generator;

import graphqllite._ast.ASTSchema;
import graphqllite._parser.GraphQLLiteParser;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class TypesTypeScriptGeneratorTest {

    @Test
    void generate() throws IOException {
        GraphQLLiteParser parser = new GraphQLLiteParser();
        Optional<ASTSchema> ast = parser.parse("src/test/resources/generator/schema.glite");
        TypesTypeScriptGenerator gen = new TypesTypeScriptGenerator();
        gen.generate(Paths.get("types.ts"), ast.get());
    }

}