package com.company.Files;

import com.company.Compress.CompressPowerPoint;
import com.company.Convert.ConvertToPdf;
import com.company.File;

public class PowerPointFile extends File {

    public PowerPointFile() {
        super(new ConvertToPdf(), new CompressPowerPoint());
    }

    @Override
    public void upload() {
        System.out.println("PowerPoint file uploaded successfully!!! \n");
    }
}
