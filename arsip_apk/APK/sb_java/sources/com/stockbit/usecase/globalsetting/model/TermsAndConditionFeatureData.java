package com.stockbit.usecase.globalsetting.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\bHÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/stockbit/usecase/globalsetting/model/TermsAndConditionFeatureData;", "", "featureId", "", "isAccepted", "", "version", "url", "", "<init>", "(IZILjava/lang/String;)V", "getFeatureId", "()I", "()Z", "setAccepted", "(Z)V", "getVersion", "setVersion", "(I)V", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "usecase-global-setting"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TermsAndConditionFeatureData {

    @SerializedName("feature_id")
    private final int featureId;

    @SerializedName("is_accepted")
    private boolean isAccepted;

    @SerializedName("url")
    private String url;

    @SerializedName("version")
    private int version;

    public TermsAndConditionFeatureData(int r2, boolean r3, int r4, String r5) {
        p.l(r5, "url");
        this.featureId = r2;
        this.isAccepted = r3;
        this.version = r4;
        this.url = r5;
    }

    public final int a() {
        return this.featureId;
    }

    public final String b() {
        return this.url;
    }

    public final int c() {
        return this.version;
    }

    public final boolean d() {
        return this.isAccepted;
    }

    public final void e(boolean r1) {
        this.isAccepted = r1;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TermsAndConditionFeatureData) == true) goto L8;
        return false;
    L8:
        TermsAndConditionFeatureData r52 = (TermsAndConditionFeatureData) r5;
        if (this.featureId == r52.featureId) goto L12;
        return false;
    L12:
        if (this.isAccepted == r52.isAccepted) goto L15;
        return false;
    L15:
        if (this.version == r52.version) goto L18;
        return false;
    L18:
        if (p.g(this.url, r52.url) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.featureId) * 31) + Boolean.hashCode(this.isAccepted)) * 31) + Integer.hashCode(this.version)) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "TermsAndConditionFeatureData(featureId=" + this.featureId + ", isAccepted=" + this.isAccepted + ", version=" + this.version + ", url=" + this.url + ")";
    }
}
