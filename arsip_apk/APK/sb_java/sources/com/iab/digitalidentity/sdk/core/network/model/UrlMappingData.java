package com.iab.digitalidentity.sdk.core.network.model;

import a.AbstractC2049c;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import d0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/network/model/UrlMappingData;", "Landroid/os/Parcelable;", "", Constants.KEY_TEXT, "url", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "b", "a", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UrlMappingData implements Parcelable {
    public static final Parcelable.Creator<UrlMappingData> CREATOR = null;

    @SerializedName(Constants.KEY_TEXT)
    private final String text;

    @SerializedName("type")
    private final String type;

    @SerializedName("url")
    private final String url;

    static {
        CREATOR = new k();
    }

    public UrlMappingData(String r2, String r3, String r4) {
        p.l(r2, Constants.KEY_TEXT);
        p.l(r3, "url");
        p.l(r4, "type");
        this.text = r2;
        this.url = r3;
        this.type = r4;
    }

    public final String a() {
        return this.type;
    }

    public final String b() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UrlMappingData) == true) goto L8;
        return false;
    L8:
        UrlMappingData r52 = (UrlMappingData) r5;
        if (p.g(this.text, r52.text) == true) goto L12;
        return false;
    L12:
        if (p.g(this.url, r52.url) == true) goto L15;
        return false;
    L15:
        if (p.g(this.type, r52.type) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r02 = this.text.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.url, r02, 31);
        return this.type.hashCode() + r03;
    }

    public final String toString() {
        return "UrlMappingData(text=" + this.text + ", url=" + this.url + ", type=" + this.type + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "out");
        r1.writeString(this.text);
        r1.writeString(this.url);
        r1.writeString(this.type);
    }
}
