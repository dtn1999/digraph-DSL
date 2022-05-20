package graphqllite._cocos;

import de.se_rwth.commons.logging.Log;
import graphqllite._ast.ASTGQLType;
import graphqllite._ast.ASTSchema;

import java.util.ArrayList;
import java.util.List;

/**
 * The schema definition should not contain multiple scalars or types  with the same names
 */
public class NoDuplicateScalarOrTypeInSameSchema implements GraphQLLiteASTSchemaCoCo{

    @Override
    public void check(ASTSchema node) {
        List<String> existingNames = new ArrayList<>();
        for(ASTGQLType type:  node.getGQLTypeList()){
            if(existingNames.contains(type.getName())){
                Log.error(String.format("A type with the name '%s' was already defined", type.getName()), type.get_SourcePositionStart(), type.get_SourcePositionEnd());
            }else{
                existingNames.add(type.getName());
            }
        }
    }
}
