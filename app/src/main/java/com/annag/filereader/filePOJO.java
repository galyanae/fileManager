package annag;

import java.util.Scanner;

/**
 * Created by Annag on 6/7/2017.
 */
public class filePOJO {

    private String filePath;

    private String fileName;
    private String fileText;

    private String fileCreationDate;
    private String fileLasdModyfied;

    private int fileSize;

    public filePOJO(String filePath, String fileName, String fileText,
                    String fileCreationDate, String fileLasdModyfied,
                    int fileSize) {
        this.filePath = filePath;
        this.fileName = fileName;
        this.fileText = fileText;
        this.fileCreationDate = fileCreationDate;
        this.fileLasdModyfied = fileLasdModyfied;
        this.fileSize = fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileText() {
        return fileText;
    }

    public void setFileText(String fileText) {
        this.fileText = fileText;
    }

    public String getFileCreationDate() {
        return fileCreationDate;
    }

    public void setFileCreationDate(String fileCreationDate) {
        this.fileCreationDate = fileCreationDate;
    }

    public String getFileLasdModyfied() {
        return fileLasdModyfied;
    }

    public void setFileLasdModyfied(String fileLasdModyfied) {
        this.fileLasdModyfied = fileLasdModyfied;
    }

    public int getFileSize() {

        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }



}
