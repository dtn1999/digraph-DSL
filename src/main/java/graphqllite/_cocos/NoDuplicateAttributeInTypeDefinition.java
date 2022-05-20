package graphqllite._cocos;

import de.se_rwth.commons.logging.Log;
import graphqllite._ast.ASTGQLTypeAttribute;
import graphqllite._ast.ASTType;

import java.util.ArrayList;
import java.util.List;

public class NoDuplicateAttributeInTypeDefinition implements GraphQLLiteASTTypeCoCo {

    @Override
    public void check(ASTType node) {
        List<String> existingNames = new ArrayList<>();
        for(ASTGQLTypeAttribute type:  node.getAttributesList()){
            if(existingNames.contains(type.getAttributeName())){
                Log.error(String.format("The Field with the name '%s' was already defined in the definition of schema's type '%s'", type.getAttributeName(), node.getName()), type.get_SourcePositionStart(), type.get_SourcePositionEnd());
            }else{
                existingNames.add(type.getAttributeName());
            }
        }
    }
}
