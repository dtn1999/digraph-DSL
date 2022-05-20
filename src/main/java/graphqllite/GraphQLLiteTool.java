package graphqllite;

import graphqllite._ast.ASTSchema;
import graphqllite._cocos.GraphQLLiteCoCoChecker;
import graphqllite._cocos.NoDuplicateAttributeInTypeDefinition;
import graphqllite._cocos.NoDuplicateScalarOrTypeInSameSchema;

public class GraphQLLiteTool extends GraphQLLiteToolTOP{

    @Override
    public void runDefaultCoCos(ASTSchema ast) {
        GraphQLLiteCoCoChecker customCoCos = new GraphQLLiteCoCoChecker();
        customCoCos.addCoCo(new NoDuplicateScalarOrTypeInSameSchema());
        customCoCos.addCoCo(new NoDuplicateAttributeInTypeDefinition());
        customCoCos.checkAll(ast);
    }
}
