package com.midtrans.sdk.corekit.models.snap;

import com.midtrans.sdk.corekit.models.TransactionResponse;

/* loaded from: classes6.dex */
public class TransactionResult {
    public static final String STATUS_FAILED = "failed";
    public static final String STATUS_INVALID = "invalid";
    public static final String STATUS_PENDING = "pending";
    public static final String STATUS_SUCCESS = "success";
    private TransactionResponse response;
    private String source;
    private String status;
    private String statusMessage;
    private boolean transactionCanceled;

    public TransactionResult() {
    }

    public TransactionResponse getResponse() {
        return this.response;
    }

    public String getSource() {
        return this.source;
    }

    public String getStatus() {
        return this.status;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public boolean isTransactionCanceled() {
        return this.transactionCanceled;
    }

    public void setResponse(TransactionResponse r1) {
        this.response = r1;
    }

    public void setSource(String r1) {
        this.source = r1;
    }

    public void setStatus(String r1) {
        this.status = r1;
    }

    public TransactionResult(TransactionResponse r1) {
        setResponse(r1);
    }

    public TransactionResult(TransactionResponse r1, String r2, String r3) {
        setResponse(r1);
        setSource(r2);
        setStatus(r3);
    }

    public TransactionResult(String r1, String r2) {
        this.status = r1;
        this.statusMessage = r2;
    }

    public TransactionResult(boolean r1) {
        this.transactionCanceled = r1;
    }
}
