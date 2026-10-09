package com.midtrans.sdk.corekit.models.snap;

/* loaded from: classes6.dex */
public class ItemDetails {

    /* renamed from: id, reason: collision with root package name */
    private String f42209id;
    private String name;
    private double price;
    private int quantity;

    public ItemDetails() {
    }

    public String getId() {
        return this.f42209id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setId(String r1) {
        this.f42209id = r1;
    }

    public void setName(String r1) {
        this.name = r1;
    }

    public void setPrice(double r1) {
        this.price = r1;
    }

    public void setQuantity(int r1) {
        this.quantity = r1;
    }

    public ItemDetails(String r1, String r2, double r3, int r5) {
        setId(r1);
        setName(r2);
        setPrice(r3);
        setQuantity(r5);
    }
}
