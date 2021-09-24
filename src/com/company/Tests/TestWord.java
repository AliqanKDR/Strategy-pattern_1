package com.company.Tests;

import com.company.Convert.ConvertToPowerPoint;
import com.company.File;
import com.company.Files.WordFile;

public class TestWord {
    public static void main(String[] args) {
        File wordFile = new WordFile();

        wordFile.upload();
        wordFile.performCompress();
        wordFile.performConvert();

        wordFile.setConvert(new ConvertToPowerPoint());

        wordFile.performConvert();

    }
}
