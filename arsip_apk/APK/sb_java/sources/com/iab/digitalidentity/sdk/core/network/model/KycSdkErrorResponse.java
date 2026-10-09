package com.iab.digitalidentity.sdk.core.network.model;

import a.AbstractC2049c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import d0.C11370a;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/network/model/KycSdkErrorResponse;", "Landroid/os/Parcelable;", "", "code", "message", "messageTitle", "messageSeverity", "elementCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "getMessage", "getMessageTitle", "getMessageSeverity", "getElementCode", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KycSdkErrorResponse implements Parcelable {
    public static final Parcelable.Creator<KycSdkErrorResponse> CREATOR = null;

    @SerializedName("code")
    private final String code;

    @SerializedName("element_code")
    private final String elementCode;

    @SerializedName("message")
    private final String message;

    @SerializedName("message_severity")
    private final String messageSeverity;

    @SerializedName("message_title")
    private final String messageTitle;

    static {
        CREATOR = new C11370a();
    }

    public KycSdkErrorResponse(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, "code");
        p.l(r3, "message");
        p.l(r4, "messageTitle");
        p.l(r5, "messageSeverity");
        this.code = r2;
        this.message = r3;
        this.messageTitle = r4;
        this.messageSeverity = r5;
        this.elementCode = r6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof KycSdkErrorResponse) == true) goto L8;
        return false;
    L8:
        KycSdkErrorResponse r52 = (KycSdkErrorResponse) r5;
        if (p.g(this.code, r52.code) == true) goto L12;
        return false;
    L12:
        if (p.g(this.message, r52.message) == true) goto L15;
        return false;
    L15:
        if (p.g(this.messageTitle, r52.messageTitle) == true) goto L18;
        return false;
    L18:
        if (p.g(this.messageSeverity, r52.messageSeverity) == true) goto L21;
        return false;
    L21:
        if (p.g(this.elementCode, r52.elementCode) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final int hashCode() {
        int r02 = this.code.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.message, r02, 31);
        int r04 = AbstractC2049c.a(this.messageTitle, r03, 31);
        int r05 = AbstractC2049c.a(this.messageSeverity, r04, 31);
        String r1 = this.elementCode;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r05 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String toString() {
        return "KycSdkErrorResponse(code=" + this.code + ", message=" + this.message + ", messageTitle=" + this.messageTitle + ", messageSeverity=" + this.messageSeverity + ", elementCode=" + this.elementCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "out");
        r1.writeString(this.code);
        r1.writeString(this.message);
        r1.writeString(this.messageTitle);
        r1.writeString(this.messageSeverity);
        r1.writeString(this.elementCode);
    }
}
