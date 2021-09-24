package com.company.Files;

import com.company.Compress.CompressPdf;
import com.company.Convert.ConvertToPowerPoint;
import com.company.File;

public class PdfFile extends File {

    public PdfFile() {
        super(new ConvertToPowerPoint(),new CompressPdf());
    }



    @Override
    public void upload() {
        System.out.println("Pdf file uploaded successfully!!! \n");
    }
}

