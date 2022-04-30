/* (c) https://github.com/MontiCore/monticore */
package automata.visitors;

import static org.junit.Assert.assertEquals;

import automata.AutomataMill;
import automata._visitor.AutomataTraverser;
import automata.lang.AbstractTest;

import de.se_rwth.commons.logging.Log;
import org.junit.BeforeClass;
import org.junit.Test;

import automata._ast.ASTAutomaton;

/**
 * Test for {@link CountStates}.
 *
 */
public class CountStatesTest extends AbstractTest {
  
  @BeforeClass
  public static void init() {
    Log.enableFailQuick(false);
    AutomataMill.init();
  }
  
  @Test
  public void test() {
    ASTAutomaton automaton = parseModel("src/test/resources/automata/visitors/valid/A.aut");
    CountStates cs = new CountStates();
    AutomataTraverser t = AutomataMill.traverser();
    t.add4Automata(cs);
    automaton.accept(t);
    assertEquals(3, cs.getCount());
  }
}
