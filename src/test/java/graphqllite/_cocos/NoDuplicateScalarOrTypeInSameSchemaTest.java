package graphqllite._cocos;

import de.se_rwth.commons.logging.Log;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


class NoDuplicateScalarOrTypeInSameSchemaTest extends AbstractCoCoTest {


    @ParameterizedTest
    @CsvSource({
            "src/test/resources/InvalidModels/InvalidInputSchemaMultipleScalarWithSameName.glite",
    })
    public void check_coco_detects_duplicate_scalars(String modelFilePath) throws IOException {
        checkCoCos(modelFilePath);
        assertEquals(1, Log.getErrorCount());
        assertEquals(String.format("A type with the name '%s' was already defined", "A") , Log.getFindings().get(0).getMsg());
    }

    @ParameterizedTest
    @CsvSource({
            "src/test/resources/InvalidModels/InvalidInputSchemaScalarAndTypeWithSameName.glite",
    })
    public void check_coco_detects_duplicate_scalar_type(String modelFilePath) throws IOException {
        checkCoCos(modelFilePath);
        assertEquals(2, Log.getErrorCount());

        assertEquals(String.format("A type with the name '%s' was already defined", "A") ,
                Log.getFindings().get(0).getMsg());

        assertEquals(String.format("A type with the name '%s' was already defined", "B") ,
                Log.getFindings().get(1).getMsg());

    }


}