/* generated from model GraphQLLite */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package graphqllite._symboltable;

/* generated by template core.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.monticore.ast.ASTNode;
import de.monticore.ast.Comment;
import de.se_rwth.commons.SourcePosition;
import de.monticore.symboltable.*;
import de.monticore.ast.ASTCNode;


 public  class TypeSymbolDeSer  implements de.monticore.symboltable.serialization.ISymbolDeSer<graphqllite._symboltable.TypeSymbol, graphqllite._symboltable.GraphQLLiteSymbols2Json> {



    /* generated by template core.Method*/
 public  String getSerializedKind ()

 {
      return "graphqllite._symboltable.TypeSymbol";
}

    /* generated by template core.Method*/
 public  String serialize (graphqllite._symboltable.TypeSymbol toSerialize,graphqllite._symboltable.GraphQLLiteSymbols2Json s2j)

 {
      /* generated by template _symboltable.serialization.symbolDeSer.Serialize4SymbolDeSer*/

  de.monticore.symboltable.serialization.JsonPrinter p = s2j.getJsonPrinter();
  p.beginObject();
  p.member(de.monticore.symboltable.serialization.JsonDeSers.KIND, getSerializedKind());
  p.member(de.monticore.symboltable.serialization.JsonDeSers.NAME, toSerialize.getName());

  // serialize symbolrule attributes

  // serialize spanned scope
  if (toSerialize.getSpannedScope().isExportingSymbols()
    && toSerialize.getSpannedScope().getSymbolsSize() > 0) {
    toSerialize.getSpannedScope().accept(s2j.getTraverser());
  }

  serializeAddons(toSerialize, s2j);
  p.endObject();

  return p.toString();

}

    /* generated by template core.Method*/
 protected  void serializeAddons (graphqllite._symboltable.TypeSymbol toSerialize,graphqllite._symboltable.GraphQLLiteSymbols2Json s2j)

 {
      /* generated by template core.EmptyBody*/
// empty body

}

    /* generated by template core.Method*/
 public  graphqllite._symboltable.TypeSymbol deserialize (de.monticore.symboltable.serialization.json.JsonObject symbolJson)

 {
      /* generated by template _symboltable.serialization.symbolDeSer.Deserialize4SymbolDeSer*/

  graphqllite._symboltable.TypeSymbolBuilder builder = graphqllite.GraphQLLiteMill.typeSymbolBuilder();
  builder.setName(symbolJson.getStringMember(de.monticore.symboltable.serialization.JsonDeSers.NAME));

  if(symbolJson.hasObjectMember(de.monticore.symboltable.serialization.JsonDeSers.SPANNED_SCOPE)){
    graphqllite._symboltable.IGraphQLLiteScope spannedScope = (graphqllite._symboltable.IGraphQLLiteScope)
        graphqllite.GraphQLLiteMill.globalScope().getDeSer()
        .deserializeScope(symbolJson.getObjectMember(
            de.monticore.symboltable.serialization.JsonDeSers.SPANNED_SCOPE));
    builder.setSpannedScope(spannedScope);
  }
  else{
  graphqllite._symboltable.IGraphQLLiteScope spannedScope = graphqllite.GraphQLLiteMill.scope();
  builder.setSpannedScope(spannedScope);
  }

  graphqllite._symboltable.TypeSymbol symbol = builder.build();

  deserializeAddons(symbol, symbolJson);
  return symbol;
}

    /* generated by template core.Method*/
 protected  void deserializeAddons (graphqllite._symboltable.TypeSymbol symbol,de.monticore.symboltable.serialization.json.JsonObject symbolJson)

 {
      /* generated by template core.EmptyBody*/
// empty body

}

}
