package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.utilities.Utils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class CreditCard {
    public static final String MIGS = "migs";

    @Deprecated
    public static final String RBA = "rba";
    private String authentication;
    private String bank;

    @SerializedName("blacklist_bins")
    private List<String> blacklistBins;
    private String channel;

    @SerializedName("installment")
    private Installment installment;

    @SerializedName("save_card")
    private boolean saveCard;

    @SerializedName("saved_tokens")
    private List<SavedToken> savedTokens;
    private boolean secure;

    @SerializedName("token_id")
    private String tokenId;
    private String type;

    @SerializedName("whitelist_bins")
    private ArrayList<String> whitelistBins;

    public CreditCard() {
    }

    public String getAuthentication() {
        return this.authentication;
    }

    public String getBank() {
        return this.bank;
    }

    public List<String> getBlacklistBins() {
        return this.blacklistBins;
    }

    public String getChannel() {
        return this.channel;
    }

    public Installment getInstallment() {
        return this.installment;
    }

    public List<SavedToken> getSavedTokens() {
        return this.savedTokens;
    }

    public String getTokenId() {
        return this.tokenId;
    }

    public String getType() {
        return this.type;
    }

    public ArrayList<String> getWhitelistBins() {
        return this.whitelistBins;
    }

    public boolean isSaveCard() {
        return this.saveCard;
    }

    public boolean isSecure() {
        return this.secure;
    }

    public void setAuthentication(String r2) {
        if (r2 != null) goto L4;
    L6:
        boolean r02 = false;
    L7:
        this.secure = r02;
        this.authentication = Utils.mappingToCreditCardAuthentication(r2, r02);
        return;
    L4:
        if (r2.equals(Authentication.AUTH_3DS) == false) goto L6;
        r02 = true;
        goto L7
    }

    public void setBank(String r1) {
        this.bank = r1;
    }

    public void setBlacklistBins(List<String> r1) {
        this.blacklistBins = r1;
    }

    public void setChannel(String r1) {
        this.channel = r1;
    }

    public void setInstallment(Installment r1) {
        this.installment = r1;
    }

    public void setSaveCard(boolean r1) {
        this.saveCard = r1;
    }

    public void setSavedTokens(List<SavedToken> r1) {
        this.savedTokens = r1;
    }

    public void setTokenId(String r1) {
        this.tokenId = r1;
    }

    public void setType(String r1) {
        this.type = r1;
    }

    public void setWhiteListBins(ArrayList<String> r1) {
        this.whitelistBins = r1;
    }
}
