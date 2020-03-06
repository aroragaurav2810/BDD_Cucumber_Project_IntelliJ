package enumContainer;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public enum EnumFile
{
    Country("Countries.sql");

    String queryFileName;

    private EnumFile(String name)
    {
        this.queryFileName = name;
    }


    public String getQueryAsString() throws IOException {
        File queryFile = new File (System.getProperty("user.dir") + "/src/main/resources/" + queryFileName);
        return FileUtils.readFileToString(queryFile);
    }

}