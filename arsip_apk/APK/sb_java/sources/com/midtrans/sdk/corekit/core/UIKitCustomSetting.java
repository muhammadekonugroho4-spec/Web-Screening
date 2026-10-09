package com.midtrans.sdk.corekit.core;

/* loaded from: classes6.dex */
public class UIKitCustomSetting {
    private boolean enableAutoReadSms;
    private boolean enabledAnimation;
    private boolean saveCardChecked;
    private boolean showEmailInCcForm;
    private boolean showPaymentStatus;
    private boolean skipCustomerDetailsPages;

    public UIKitCustomSetting() {
        this.showPaymentStatus = true;
        this.saveCardChecked = false;
        this.enabledAnimation = true;
        this.enableAutoReadSms = false;
        this.skipCustomerDetailsPages = false;
        this.showEmailInCcForm = false;
    }

    public boolean isEnableAutoReadSms() {
        return this.enableAutoReadSms;
    }

    public boolean isEnabledAnimation() {
        return this.enabledAnimation;
    }

    public boolean isSaveCardChecked() {
        return this.saveCardChecked;
    }

    public boolean isShowEmailInCcForm() {
        return this.showEmailInCcForm;
    }

    public boolean isShowPaymentStatus() {
        return this.showPaymentStatus;
    }

    public boolean isSkipCustomerDetailsPages() {
        return this.skipCustomerDetailsPages;
    }

    public void setEnableAutoReadSms(boolean r1) {
        this.enableAutoReadSms = r1;
    }

    public void setEnabledAnimation(boolean r1) {
        this.enabledAnimation = r1;
    }

    public void setSaveCardChecked(boolean r1) {
        this.saveCardChecked = r1;
    }

    public void setShowEmailInCcForm(boolean r1) {
        this.showEmailInCcForm = r1;
    }

    public void setShowPaymentStatus(boolean r1) {
        this.showPaymentStatus = r1;
    }

    public void setSkipCustomerDetailsPages(boolean r1) {
        this.skipCustomerDetailsPages = r1;
    }
}
