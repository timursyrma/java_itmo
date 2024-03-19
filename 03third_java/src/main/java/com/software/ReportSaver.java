package com.software;

import java.io.FileWriter;
import java.io.IOException;

public class ReportSaver {
    public void saveReportTxt(String reportContent, String filename) {
        try (FileWriter writer = new FileWriter(filename)){
            writer.write(reportContent.toString());
            System.out.println("Report saved");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
