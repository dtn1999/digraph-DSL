package graphqllite._cocos;

import de.se_rwth.commons.logging.Log;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class NoDuplicateAttributeInTypeDefinitionTest extends AbstractCoCoTest {

    @ParameterizedTest
    @CsvSource({
            "src/test/resources/InvalidModels/InvalidInputSchemaMultipleAttributeWIthSameName.glite",
    })
    public void check_coco_detects_duplicate_scalars(String modelFilePath) throws IOException {
        checkCoCos(modelFilePath);
        assertEquals(1, Log.getErrorCount());
        assertEquals(String.format("The Field with the name '%s' was already defined in the definition of schema's type '%s'", "field", "B") , Log.getFindings().get(0).getMsg());
    }
}