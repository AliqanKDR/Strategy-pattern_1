package com.company;

import com.company.Interface.Compress;
import com.company.Interface.Convert;

public abstract class File {

    //Composition
    private Convert convert;
    private Compress compress;

    public File(Convert convert, Compress compress) {
        this.convert = convert;
        this.compress = compress;
    }

    //Program to an interface
    public void performConvert(){
        this.convert.convert();
    }
    
    public void performCompress(){
        this.compress.compress();
    }

    public void setConvert(Convert convert) {
        this.convert = convert;
    }

    public void setCompress(Compress compress) {
        this.compress = compress;
    }

    public Convert getConvert() {
        return convert;
    }

    public Compress getCompress() {
        return compress;
    }

    public abstract void upload();
}
