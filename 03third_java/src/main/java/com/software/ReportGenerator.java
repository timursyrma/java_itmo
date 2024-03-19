package com.software;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator {
    public String generateReport(List<String> reportData) {
        StringBuilder reportContent = new StringBuilder();
        for (String data : reportData) {
            reportContent.append(data).append("\n");
        }

        System.out.println("Report generated");
        return reportContent.toString();

//        try (FileWriter writer = new FileWriter("report.txt")){
//            writer.write(reportContent.toString());
//            System.out.println("Report saved");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
