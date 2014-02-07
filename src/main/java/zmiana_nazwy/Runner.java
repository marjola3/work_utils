package zmiana_nazwy;

import zmiana_nazwy.util.FileUtils;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

/**
 * User: Mariola
 * Date: 07.02.14
 */
public class Runner {
    public static void main(String[] args) {
        createDir();
        insertFilesIntoDir();
        selectDirAndChangeFileNames();
    }

    private static void insertFilesIntoDir() {
        try {
            FileUtils.createFile("Account.bean.data.selector.test.xml");
            FileUtils.createFile("Account.bean.data.report.test.xml");
            FileUtils.createFile("Account.bean.find.test.xml");
            FileUtils.createFile("Account.bean.create.test.xml");
            FileUtils.createFile("Account.bean.info.test.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createDir() {
        FileUtils.createDir();
    }

    private static void selectDirAndChangeFileNames() {
        JFileChooser fileChooser = new JFileChooser(".");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File dir = fileChooser.getSelectedFile();
            FileUtils.changeAllFileNamesInDir(dir);
        }
    }
}
