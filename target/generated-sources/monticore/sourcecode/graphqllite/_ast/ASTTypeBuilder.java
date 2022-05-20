/* generated from model GraphQLLite */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package graphqllite._ast;

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


 public  class ASTTypeBuilder extends de.monticore.ast.ASTNodeBuilder<ASTTypeBuilder>  {

    /* generated by template core.Attribute*/
 protected  ASTTypeBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  java.util.List<graphqllite._ast.ASTGQLTypeAttribute> attributes = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  String name ;


    /* generated by template core.Constructor*/
 public  ASTTypeBuilder()
 {
  this.realBuilder = (ASTTypeBuilder) this;
}


    /* generated by template core.Method*/
 public  ASTType build ()

 {
      /* generated by template _ast.builder.BuildMethod*/

        if (!isValid()) {
            if (name == null) {
                Log.error("0xA4522 name of type String must not be null");
            }
          throw new IllegalStateException();
        }
        ASTType value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTType();
    value.setAttributesList(this.attributes);
    value.setName(this.name);
    if (this.sourcePositionEnd.isPresent()) {
      value.set_SourcePositionEnd(this.sourcePositionEnd.get());
    } else {
      value.set_SourcePositionEndAbsent();
    }
    if (this.sourcePositionStart.isPresent()) {
      value.set_SourcePositionStart(this.sourcePositionStart.get());
    } else {
      value.set_SourcePositionStartAbsent();
    }
    value.set_PreCommentList(this.precomments);
    value.set_PostCommentList(this.postcomments);

        return value;

}

    /* generated by template core.Method*/
 public  boolean isValid ()

 {
      /* generated by template _ast.builder.IsValidMethod*/

        if (name == null) {
            return false;
        }
        return true;

}

    /* generated by template core.Method*/
 public  boolean containsAttributes (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAttributesList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllAttributes (Collection<?> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAttributesList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyAttributes ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAttributesList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<graphqllite._ast.ASTGQLTypeAttribute> iteratorAttributes ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAttributesList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeAttributes ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAttributesList().size();

}

    /* generated by template core.Method*/
 public  graphqllite._ast.ASTGQLTypeAttribute[] toArrayAttributes (graphqllite._ast.ASTGQLTypeAttribute[] array)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAttributesList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayAttributes ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAttributesList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<graphqllite._ast.ASTGQLTypeAttribute> spliteratorAttributes ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAttributesList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<graphqllite._ast.ASTGQLTypeAttribute> streamAttributes ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAttributesList().stream();

}

    /* generated by template core.Method*/
 public  Stream<graphqllite._ast.ASTGQLTypeAttribute> parallelStreamAttributes ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAttributesList().parallelStream();

}

    /* generated by template core.Method*/
 public  graphqllite._ast.ASTGQLTypeAttribute getAttributes (int index)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAttributesList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfAttributes (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAttributesList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfAttributes (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAttributesList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsAttributes (Object o)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAttributesList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeAttributes ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAttributesList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<graphqllite._ast.ASTGQLTypeAttribute> listIteratorAttributes ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAttributesList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<graphqllite._ast.ASTGQLTypeAttribute> listIteratorAttributes (int index)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAttributesList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<graphqllite._ast.ASTGQLTypeAttribute> subListAttributes (int start,int end)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAttributesList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<graphqllite._ast.ASTGQLTypeAttribute> getAttributesList ()

 {
      /* generated by template methods.Get*/

return this.attributes;

}

    /* generated by template core.Method*/
 public  String getName ()

 {
      /* generated by template methods.Get*/

return this.name;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder clearAttributes ()

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getAttributesList().clear();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder addAttributes (graphqllite._ast.ASTGQLTypeAttribute element)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getAttributesList().add(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder addAllAttributes (Collection<? extends graphqllite._ast.ASTGQLTypeAttribute> collection)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getAttributesList().addAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder removeAttributes (Object element)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getAttributesList().remove(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder removeAllAttributes (Collection<?> collection)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getAttributesList().removeAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder retainAllAttributes (Collection<?> collection)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getAttributesList().retainAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder removeIfAttributes (Predicate<? super graphqllite._ast.ASTGQLTypeAttribute> filter)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getAttributesList().removeIf(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder forEachAttributes (Consumer<? super graphqllite._ast.ASTGQLTypeAttribute> action)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getAttributesList().forEach(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder addAttributes (int index,graphqllite._ast.ASTGQLTypeAttribute element)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getAttributesList().add(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder addAllAttributes (int index,Collection<? extends graphqllite._ast.ASTGQLTypeAttribute> collection)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getAttributesList().addAll(index, collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder removeAttributes (int index)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getAttributesList().remove(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder setAttributes (int index,graphqllite._ast.ASTGQLTypeAttribute element)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getAttributesList().set(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder replaceAllAttributes (UnaryOperator<graphqllite._ast.ASTGQLTypeAttribute> operator)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getAttributesList().replaceAll(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder sortAttributes (Comparator<? super graphqllite._ast.ASTGQLTypeAttribute> comparator)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getAttributesList().sort(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder setAttributesList (List<graphqllite._ast.ASTGQLTypeAttribute> attributes)

 {
      /* generated by template _ast.builder.Set4ASTBuilder*/

    this.attributes = attributes;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder setName (String name)

 {
      /* generated by template _ast.builder.Set4ASTBuilder*/

    this.name = name;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder set_SourcePositionEnd (SourcePosition end)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEnd(end);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder set_SourcePositionEndAbsent ()

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEndAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder set_SourcePositionStart (SourcePosition start)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStart(start);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder set_SourcePositionStartAbsent ()

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStartAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder clear_PreComments ()

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PreComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder add_PreComment (Comment precomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder add_PreComment (int index,Comment precomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder addAll_PreComments (Collection<Comment> precomments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder addAll_PreComments (int index,Collection<Comment> precomments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(index, precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder remove_PreComment (Object element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder remove_PreComment (int index)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder removeAll_PreComments (Collection<?> element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder retainAll_PreComments (Collection<?> element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder removeIf_PreComment (Predicate<? super Comment> filter)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PreComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder forEach_PreComments (Consumer<? super Comment> action)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PreComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder replaceAll_PreComments (UnaryOperator<Comment> operator)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PreComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder sort_PreComments (Comparator<? super Comment> comparator)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PreComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder set_PreCommentList (List<Comment> preComments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreCommentList(preComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder set_PreComment (int index,Comment precomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder clear_PostComments ()

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PostComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder add_PostComment (Comment postcomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder add_PostComment (int index,Comment postcomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder addAll_PostComments (Collection<Comment> postcomments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder addAll_PostComments (int index,Collection<Comment> postcomments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(index, postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder remove_PostComment (Object element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder remove_PostComment (int index)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder removeAll_PostComments (Collection<?> element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder retainAll_PostComments (Collection<?> element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder removeIf_PostComment (Predicate<? super Comment> filter)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PostComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder forEach_PostComments (Consumer<? super Comment> action)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PostComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder replaceAll_PostComments (UnaryOperator<Comment> operator)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PostComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder sort_PostComments (Comparator<? super Comment> comparator)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PostComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder set_PostCommentList (List<Comment> postComments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostCommentList(postComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTTypeBuilder set_PostComment (int index,Comment postcomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTType uncheckedBuild ()

 {
      /* generated by template _ast.builder.BuildMethod*/

        ASTType value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTType();
    value.setAttributesList(this.attributes);
    value.setName(this.name);
    if (this.sourcePositionEnd.isPresent()) {
      value.set_SourcePositionEnd(this.sourcePositionEnd.get());
    } else {
      value.set_SourcePositionEndAbsent();
    }
    if (this.sourcePositionStart.isPresent()) {
      value.set_SourcePositionStart(this.sourcePositionStart.get());
    } else {
      value.set_SourcePositionStartAbsent();
    }
    value.set_PreCommentList(this.precomments);
    value.set_PostCommentList(this.postcomments);

        return value;

}

}
