package zmiana_nazwy.util;

import zmiana_nazwy.dao.TextsDao;

import java.io.File;
import java.io.IOException;

/**
 * User: Mariola
 * Date: 07.02.14
 */
public class FileUtils {
    private static String dirName;

    static {
        dirName = TextsDao.getText("files.dirName");
    }

    public static boolean createDir(){
        boolean isCreated = false;
        File dir = new File(dirName);
        if (!dir.exists()) {
            isCreated = dir.mkdirs();
        }
        return isCreated;
    }

    public static boolean createFile(String fileName) throws IOException {
        File file = new File(dirName + File.separator + fileName);
        return file.createNewFile();
    }

    public static boolean changeAllFileNamesInDir(File dir) {
        if (dir == null) return false;

        boolean isRenamed = false;
        File[] files = dir.listFiles();

        if(files != null) {
            for(File file : files) {
                String name = file.getName();
                String newName = changeFileName(name);
                isRenamed = file.renameTo(new File(dir.getPath() +
                        File.separator + newName));
            }
        }

        return isRenamed;
    }

    public static String changeFileName(String name) {
        if (name == null) return "";

        StringBuilder sb = new StringBuilder();

        name = name.replaceAll("bean", "");
        name = name.replaceAll("test", "");
        name = name.replaceAll("create", "Create");
        name = name.replaceAll("find", "FindBy");
        name = name.replaceAll("info", "GetBeanInfo");
        name = name.replaceAll("data", "Data");
        name = name.replaceAll("selector", "Selector");
        name = name.replaceAll("report", "Report");
        name = name.replaceAll("\\.", "");
        name = name.replaceAll("xml", ".xml");

        return name;
    }
}