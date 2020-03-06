package utilities;

import base.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

public class PropertyFileReader

{
    public Properties config;
    InputStream inputStream;
 public PropertyFileReader(String propertyFile) throws SQLException, ClassNotFoundException, IOException
    {
        if (propertyFile != null)
        {
            config=new Properties();
            inputStream = getClass().getClassLoader().getResourceAsStream(propertyFile);
            config.load(inputStream);

        }


    }


}
