package chap18;

/**
 * Created by multiangle on 2016/6/5.
 */

import java.io.File;
import java.io.FilenameFilter;
import java.util.* ;
import java.util.regex.Pattern;

public class Directory {
    public static File[]
    local(File dir, final String regex){
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex) ;
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches() ;
            }
        }) ;
    }

}
