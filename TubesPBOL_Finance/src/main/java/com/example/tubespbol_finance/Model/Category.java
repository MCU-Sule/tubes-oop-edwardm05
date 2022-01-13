package com.example.tubespbol_finance.Model;

public class Category {
    private int id;
    private String namaCategory;

    public Category(int id, String namaCategory) {
        this.id = id;
        this.namaCategory = namaCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaCategory() {
        return namaCategory;
    }

    public void setNamaCategory(String namaCategory) {
        this.namaCategory = namaCategory;
    }

    @Override
    public String toString() {
        return namaCategory;
    }
}
