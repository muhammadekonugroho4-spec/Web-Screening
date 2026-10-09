package com.iab.digitalidentity.sdk.core.network.model;

import a.AbstractC2049c;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$DocumentData", "", "", "url", "reference", "expiry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "getReference", "getExpiry", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycResponse$DocumentData {

    @SerializedName("expiryInSeconds")
    private final String expiry;

    @SerializedName("documentReference")
    private final String reference;

    @SerializedName("documentUrl")
    private final String url;

    public UnifiedKycResponse$DocumentData(String r2, String r3, String r4) {
        p.l(r2, "url");
        p.l(r3, "reference");
        p.l(r4, "expiry");
        this.url = r2;
        this.reference = r3;
        this.expiry = r4;
    }

    public final String a() {
        return this.url;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnifiedKycResponse$DocumentData) == true) goto L8;
        return false;
    L8:
        UnifiedKycResponse$DocumentData r52 = (UnifiedKycResponse$DocumentData) r5;
        if (p.g(this.url, r52.url) == true) goto L12;
        return false;
    L12:
        if (p.g(this.reference, r52.reference) == true) goto L15;
        return false;
    L15:
        if (p.g(this.expiry, r52.expiry) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r02 = this.url.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.reference, r02, 31);
        return this.expiry.hashCode() + r03;
    }

    public final String toString() {
        return "DocumentData(url=" + this.url + ", reference=" + this.reference + ", expiry=" + this.expiry + ")";
    }
}
