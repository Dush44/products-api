package uk.ac.westminster.productsapi;

public class Digitalproduct extends Product {

    private String downloadUrl;
    private double fileSizeMB;

    public Digitalproduct() {
    }

    public Digitalproduct(Long id, String name, double price, String downloadUrl, double fileSizeMB) {

        super(id, name, price);

        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    //test

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }
}