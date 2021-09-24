package com.company.Tests;

import com.company.Convert.ConvertToPowerPoint;
import com.company.Convert.ConvertToWord;
import com.company.File;
import com.company.Files.PdfFile;
import com.company.Files.WordFile;

public class TestPdf {
    public static void main(String[] args) {
        File pdfFile = new PdfFile();

        pdfFile.upload();
        pdfFile.performCompress();
        pdfFile.performConvert();

        pdfFile.setConvert(new ConvertToWord());
        pdfFile.performConvert();

    }
}
