package com.midtrans.sdk.corekit.models;

@Deprecated
/* loaded from: classes6.dex */
public class BankTransferModel {
    private String bankName;
    private String description;
    private int image;
    private boolean isSelected;
    private Integer priority;
    private String status;

    public BankTransferModel(String r2, int r3, boolean r4, int r5, String r6) {
        this.priority = 0;
        setBankName(r2);
        setImage(r3);
        setIsSelected(r4);
        setPriority(Integer.valueOf(r5));
        setDescription(r6);
    }

    public String getBankName() {
        return this.bankName;
    }

    public String getDescription() {
        return this.description;
    }

    public int getImage() {
        return this.image;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public String getStatus() {
        return this.status;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setBankName(String r1) {
        this.bankName = r1;
    }

    public void setDescription(String r1) {
        this.description = r1;
    }

    public void setImage(int r1) {
        this.image = r1;
    }

    public void setIsSelected(boolean r1) {
        this.isSelected = r1;
    }

    public void setPriority(Integer r1) {
        this.priority = r1;
    }

    public void setStatus(String r1) {
        this.status = r1;
    }

    public BankTransferModel(String r2, int r3, boolean r4, int r5, String r6, String r7) {
        this.priority = 0;
        setBankName(r2);
        setImage(r3);
        setIsSelected(r4);
        setPriority(Integer.valueOf(r5));
        setDescription(r6);
        setStatus(r7);
    }
}
