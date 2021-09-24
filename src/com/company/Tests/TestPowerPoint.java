package com.company.Tests;

import com.company.Convert.ConvertToWord;
import com.company.File;
import com.company.Files.PowerPointFile;

public class TestPowerPoint {
    public static void main(String[] args) {
        File powerPointFile = new PowerPointFile();

        powerPointFile.upload();
        powerPointFile.performCompress();
        powerPointFile.performConvert();

        powerPointFile.setConvert(new ConvertToWord());
        powerPointFile.performConvert();

    }
}
