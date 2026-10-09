package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.core.Constants;
import java.util.List;

/* loaded from: classes6.dex */
public class TokenDetailsResponse {

    @SerializedName("bank")
    private String bank;

    @SerializedName(Constants.WEBVIEW_REDIRECT_URL)
    private String redirectUrl;

    @SerializedName("status_code")
    private String statusCode;

    @SerializedName("status_message")
    private String statusMessage;

    @SerializedName("token_id")
    private String tokenId;

    @SerializedName("validation_messages")
    private List<String> validationMessages;

    public TokenDetailsResponse() {
        this.bank = null;
    }

    public String getBank() {
        return this.bank;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public String getTokenId() {
        return this.tokenId;
    }

    public List<String> getValidationMessages() {
        return this.validationMessages;
    }

    public void setBank(String r1) {
        this.bank = r1;
    }

    public void setRedirectUrl(String r1) {
        this.redirectUrl = r1;
    }

    public void setStatusCode(String r1) {
        this.statusCode = r1;
    }

    public void setStatusMessage(String r1) {
        this.statusMessage = r1;
    }

    public void setTokenId(String r1) {
        this.tokenId = r1;
    }
}
