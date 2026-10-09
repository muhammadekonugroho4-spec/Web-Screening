package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class BanksPointResponse {

    @SerializedName("point_balance")
    private Long pointBalance;

    @SerializedName("point_balance_amount")
    private String pointBalanceAmount;

    @SerializedName("status_code")
    private String statusCode;

    @SerializedName("status_message")
    private String statusMessage;

    @SerializedName("transaction_time")
    private String transactionTime;

    @SerializedName("validation_messages")
    private ArrayList<String> validationMessages;

    public BanksPointResponse(String r1, String r2, ArrayList<String> r3, Long r4, String r5) {
        this.statusCode = r1;
        this.statusMessage = r2;
        this.validationMessages = r3;
        this.pointBalance = r4;
        this.transactionTime = r5;
    }

    public Long getPointBalance() {
        return this.pointBalance;
    }

    public String getPointBalanceAmount() {
        return this.pointBalanceAmount;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public String getTransactionTime() {
        return this.transactionTime;
    }

    public ArrayList<String> getValidationMessages() {
        return this.validationMessages;
    }

    public void setPointBalanceAmount(String r1) {
        this.pointBalanceAmount = r1;
    }
}
