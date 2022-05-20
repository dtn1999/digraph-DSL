package graphqllite._ast;

import java.util.List;
import java.util.stream.Collectors;

public class ASTSchema extends ASTSchemaTOP{

    public List<ASTScalar> getScalarList(){
        return getGQLTypeList().stream().filter(type -> type instanceof ASTScalar)
                .map(type -> (ASTScalar)type)
                .collect(Collectors.toList());
    }

    public List<ASTType> getTypeList(){
        return getGQLTypeList().stream().filter( type -> !(type instanceof ASTScalar))
                .map(type -> (ASTType)type)
                .collect(Collectors.toList());
    }
}
