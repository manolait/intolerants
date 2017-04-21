package com.istc.intolerants;

public class Post {
    // Atributos
    private String ID_PRODUCTO;
    private String CODIGO_BARRAS;
    private String NOMBRE_PROD;
    private String TIPO_PROD;
    private String FOTO;

    public Post() {
    }

    public Post(String ID_PRODUCTO, String CODIGO_BARRAS, String NOMBRE_PROD, String TIPO_PROD, String imagen) {
        this.ID_PRODUCTO = ID_PRODUCTO;
        this.CODIGO_BARRAS = CODIGO_BARRAS;
        this.NOMBRE_PROD = NOMBRE_PROD;
        this.TIPO_PROD = TIPO_PROD;
        this.FOTO = FOTO;
    }

    public String getID_PRODUCTO() {
        return ID_PRODUCTO;
    }

    public void setID_PRODUCTO(String ID_PRODUCTO) {
        this.ID_PRODUCTO = ID_PRODUCTO;
    }

    public String getCODIGO_BARRAS() {
        return CODIGO_BARRAS;
    }

    public void setCODIGO_BARRAS(String CODIGO_BARRAS) {
        this.CODIGO_BARRAS = CODIGO_BARRAS;
    }

    public String getNOMBRE_PROD() {
        return NOMBRE_PROD;
    }

    public void setNOMBRE_PROD(String NOMBRE_PROD) {
        this.NOMBRE_PROD = NOMBRE_PROD;
    }

    public String getTIPO_PROD() {
        return TIPO_PROD;
    }

    public void setTIPO_PROD(String TIPO_PROD) {
        this.TIPO_PROD = TIPO_PROD;
    }

    public String getFOTO() {
        return FOTO;
    }

    public void setFOTO(String FOTO) {
        this.FOTO = FOTO;
    }
}
