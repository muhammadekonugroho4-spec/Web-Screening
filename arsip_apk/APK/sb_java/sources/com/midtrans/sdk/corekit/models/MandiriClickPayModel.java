package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class MandiriClickPayModel {

    @SerializedName("card_number")
    private String cardNumber;
    private String input1;
    private String input2;
    private String input3;
    private String token;

    public MandiriClickPayModel() {
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getInput1() {
        return this.input1;
    }

    public String getInput2() {
        return this.input2;
    }

    public String getInput3() {
        return this.input3;
    }

    public String getToken() {
        return this.token;
    }

    public void setCardNumber(String r1) {
        this.cardNumber = r1;
    }

    public void setInput1(String r1) {
        this.input1 = r1;
    }

    public void setInput2(String r5) {
        if (r5 == null) goto L6;
        this.input2 = "" + ((int) Double.parseDouble(r5));
        return;
    L6:
        this.input2 = "";
    }

    public void setInput3(String r1) {
        this.input3 = r1;
    }

    public void setToken(String r1) {
        this.token = r1;
    }
}
