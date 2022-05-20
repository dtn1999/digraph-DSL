package graphqllite._ast;

public class ASTGQLTypeAttribute extends ASTGQLTypeAttributeTOP{

    public String getAttributeType(){
        if( type instanceof  ASTSimpleAttributeType ){
            ASTSimpleAttributeType t = (ASTSimpleAttributeType)type;
            return printSimpleAttributeType(t);
        }else if(type instanceof  ASTScalar){
            return ((ASTScalar)type).getName();
        } else {
            ASTCollectionAttributeType c = (ASTCollectionAttributeType) type;
            return printSimpleAttributeType(c.getSimpleAttributeType());
        }
    }

    public String printSimpleAttributeType(ASTSimpleAttributeType type){
        String t = "";
        if(type.isPresentType()){
            t = type.getType();
        }else {
            if( type.getBuildInScalar().name() == "ID"){
                t = type.getBuildInScalar().name();
            }else{
                t = type.getBuildInScalar().name().substring(0,1).toUpperCase() + type.getBuildInScalar().name().substring(1).toLowerCase();
            }
        }
        return  t;
    }

    public boolean isCollection(){
        return  type instanceof ASTCollectionAttributeType;
    }

    public boolean isBuildInScalar(){
        if( type instanceof  ASTSimpleAttributeType ){
            ASTSimpleAttributeType t = (ASTSimpleAttributeType)type;
            return t.isPresentBuildInScalar();
        }
        return false;
    }
}
