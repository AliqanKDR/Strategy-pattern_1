package com.company.Files;


import com.company.Compress.CompressWord;
import com.company.Convert.ConvertToPdf;
import com.company.File;

public class WordFile extends File {

    public WordFile() {
        super(new ConvertToPdf(), new CompressWord());
    }

    @Override
    public void upload() {
        System.out.println("Word file uploaded successfully!!! \n");
    }
}
