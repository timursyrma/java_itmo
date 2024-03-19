package com.software;

import java.util.List;

public class ReportManagment {
    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator();
        ReportSaver saver = new ReportSaver();

        List<String> data = List.of("str1", "str2", "str3");
        String report = generator.generateReport(data);
        saver.saveReportTxt(report, "report.txt");
    }
}
