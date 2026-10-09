package com.midtrans.sdk.corekit.models;

/* loaded from: classes6.dex */
public class ItemDetails {

    /* renamed from: id, reason: collision with root package name */
    private String f42207id;
    private String name;
    private Double price;
    private int quantity;

    public ItemDetails() {
    }

    public String getId() {
        return this.f42207id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setId(String r1) {
        this.f42207id = r1;
    }

    public void setName(String r1) {
        this.name = r1;
    }

    public void setPrice(Double r1) {
        this.price = r1;
    }

    public void setQuantity(int r1) {
        this.quantity = r1;
    }

    public ItemDetails(String r1, double r2, int r4, String r5) {
        this.f42207id = r1;
        this.price = Double.valueOf(r2);
        this.quantity = r4;
        this.name = r5;
    }
}
