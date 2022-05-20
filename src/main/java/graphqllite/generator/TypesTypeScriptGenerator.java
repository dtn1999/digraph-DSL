package graphqllite.generator;

import de.monticore.ast.ASTNode;
import de.monticore.generating.GeneratorEngine;
import de.monticore.generating.GeneratorSetup;
import graphqllite._ast.ASTSchema;

import java.io.File;
import java.nio.file.Path;

public class TypesTypeScriptGenerator {

    public void generate(Path outputFile, ASTNode ast){
        // initialization
        GeneratorSetup genSetup = new GeneratorSetup();
        // Configuration
        genSetup.setOutputDirectory( new File("target/generated-sources/types"));
        genSetup.setDefaultFileExtension("ts");
        genSetup.setCommentStart("/*");
        genSetup.setCommentEnd("*/");
        genSetup.setTracing(true);

        GeneratorEngine genEngine = new GeneratorEngine(genSetup);

        genEngine.generate("templates/TypesDefinition.ftl", outputFile, ast);
    }
}
