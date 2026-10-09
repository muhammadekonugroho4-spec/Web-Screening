package com.midtrans.sdk.corekit.models;

/* loaded from: classes6.dex */
public class PaymentMethodsModel {
    private String description;
    private boolean havePromo;
    private int imageId;
    private boolean isSelected;
    private String name;
    private String paymentType;
    private Integer priority;
    private String status;

    public PaymentMethodsModel(String r1, String r2, int r3, String r4, int r5, String r6) {
        this.paymentType = r4;
        this.imageId = r3;
        this.name = r1;
        this.description = r2;
        this.priority = Integer.valueOf(r5);
        this.status = r6;
    }

    public String getDescription() {
        return this.description;
    }

    public int getImageId() {
        return this.imageId;
    }

    public String getName() {
        return this.name;
    }

    public String getPaymentType() {
        return this.paymentType;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public String getStatus() {
        return this.status;
    }

    public boolean isHavePromo() {
        return this.havePromo;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setDescription(String r1) {
        this.description = r1;
    }

    public void setHavePromo(boolean r1) {
        this.havePromo = r1;
    }

    public void setIsSelected(boolean r1) {
        this.isSelected = r1;
    }

    public void setPaymentType(String r1) {
        this.paymentType = r1;
    }

    public void setStatus(String r1) {
        this.status = r1;
    }
}
