package EstanisADD;

import java.io.File;
import java.io.FilenameFilter;

public class FilterExtension implements FilenameFilter{
    String extension;
    FilterExtension(String extension){
        this.extension=extension;
    }
    
    public boolean accept(File dir, String name){
        return name.endsWith(extension);
    }
}
