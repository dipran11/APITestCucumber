package helper.JSONSchemaData;

import java.io.File;

public class Utility {
    public static File getJSONSchemaFile(String JSONFile) {
        return new File("src/test/java/helper/JSONSchemaDta/" + JSONFile);
    }
}
