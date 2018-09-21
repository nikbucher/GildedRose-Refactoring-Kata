package com.gildedrose;

import org.approvaltests.reporters.DiffInfo;
import org.approvaltests.reporters.GenericDiffReporter;

public class IdeaDiffReporter extends GenericDiffReporter {
    public IdeaDiffReporter() {
        super(new DiffInfo(System.getProperty("user.home") + "/bin/idea", "diff %s %s", GenericDiffReporter.TEXT_FILE_EXTENSIONS));
    }
}
