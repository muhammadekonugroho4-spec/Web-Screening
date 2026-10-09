package com.stockbit.domain.model.valueobject.securities;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006!"}, d2 = {"Lcom/stockbit/domain/model/valueobject/securities/Attributes;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.METHOD, "", "redirectUrl", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMethod", "()Ljava/lang/String;", "setMethod", "(Ljava/lang/String;)V", "getRedirectUrl", "setRedirectUrl", "getUrl", "setUrl", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Attributes implements Parcelable {
    public static final Parcelable.Creator<Attributes> CREATOR = null;

    @SerializedName(FirebaseAnalytics.Param.METHOD)
    private String method;

    @SerializedName(com.midtrans.sdk.corekit.core.Constants.WEBVIEW_REDIRECT_URL)
    private String redirectUrl;

    @SerializedName("url")
    private String url;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final Attributes a(Parcel r4) {
            p.l(r4, "parcel");
            return new Attributes(r4.readString(), r4.readString(), r4.readString());
        }

        public final Attributes[] b(int r1) {
            return new Attributes[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return a(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return b(r1);
        }
    }

    static {
        CREATOR = new a();
    }

    public Attributes(String r2, String r3, String r4) {
        p.l(r2, FirebaseAnalytics.Param.METHOD);
        this.method = r2;
        this.redirectUrl = r3;
        this.url = r4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Attributes) == true) goto L8;
        return false;
    L8:
        Attributes r52 = (Attributes) r5;
        if (p.g(this.method, r52.method) == true) goto L12;
        return false;
    L12:
        if (p.g(this.redirectUrl, r52.redirectUrl) == true) goto L15;
        return false;
    L15:
        if (p.g(this.url, r52.url) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.method.hashCode() * 31;
        String r1 = this.redirectUrl;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.url;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "Attributes(method=" + this.method + ", redirectUrl=" + this.redirectUrl + ", url=" + this.url + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.method);
        r1.writeString(this.redirectUrl);
        r1.writeString(this.url);
    }
}
