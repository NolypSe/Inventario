package com.example.inventario;

public class DataClase {

    private String dataNombre;
    private String dataDesc;
    private String dataPrec;
    private String dataImage;
    private String key;

    public DataClase(String title, String desc, String pres, String imageURL) {
    }

    public DataClase(String dataTitle, String dataDesc, String dataLang, String dataImage, String key) {
        this.dataNombre = dataTitle;
        this.dataDesc = dataDesc;
        this.dataPrec = dataLang;
        this.dataImage = dataImage;
        this.key = key;
    }

    public String getDataNombre() {
        return dataNombre;
    }

    public void setDataNombre(String dataNombre) {
        this.dataNombre = dataNombre;
    }

    public String getDataDesc() {
        return dataDesc;
    }

    public void setDataDesc(String dataDesc) {
        this.dataDesc = dataDesc;
    }

    public String getDataPrec() {
        return dataPrec;
    }

    public void setDataPrec(String dataPrec) {
        this.dataPrec = dataPrec;
    }

    public String getDataImage() {
        return dataImage;
    }

    public void setDataImage(String dataImage) {
        this.dataImage = dataImage;
    }

    public String getKey(){
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
}
