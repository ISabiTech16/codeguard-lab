package com.lab;

import java.io.IOException;

public class ReportExporter {

    /** Packs the reports folder into an archive named by the caller. */
    public Process archive(String archiveName) throws IOException {
        String command = "tar czf /tmp/" + archiveName + ".tgz reports/";
        return Runtime.getRuntime().exec(new String[] {"sh", "-c", command});
    }
}
