package com.iab.digitalidentity.sdk.core.network.model;

import a.AbstractC2049c;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$UiMessageData", "", "", Constants.KEY_TITLE, "message", "ctaMessage", "ctaDeepLink", "tag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", "b", "a", Constants.INAPP_DATA_TAG, "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycResponse$UiMessageData {

    @SerializedName("ctaDeepLink")
    private final String ctaDeepLink;

    @SerializedName("ctaMessage")
    private final String ctaMessage;

    @SerializedName("message")
    private final String message;

    @SerializedName("tag")
    private final String tag;

    @SerializedName(Constants.KEY_TITLE)
    private final String title;

    public UnifiedKycResponse$UiMessageData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public final String a() {
        return this.ctaDeepLink;
    }

    public final String b() {
        return this.ctaMessage;
    }

    public final String c() {
        return this.message;
    }

    public final String d() {
        return this.tag;
    }

    public final String e() {
        return this.title;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnifiedKycResponse$UiMessageData) == true) goto L8;
        return false;
    L8:
        UnifiedKycResponse$UiMessageData r52 = (UnifiedKycResponse$UiMessageData) r5;
        if (p.g(this.title, r52.title) == true) goto L12;
        return false;
    L12:
        if (p.g(this.message, r52.message) == true) goto L15;
        return false;
    L15:
        if (p.g(this.ctaMessage, r52.ctaMessage) == true) goto L18;
        return false;
    L18:
        if (p.g(this.ctaDeepLink, r52.ctaDeepLink) == true) goto L21;
        return false;
    L21:
        if (p.g(this.tag, r52.tag) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final int hashCode() {
        int r02 = this.title.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.message, r02, 31);
        int r04 = AbstractC2049c.a(this.ctaMessage, r03, 31);
        int r05 = AbstractC2049c.a(this.ctaDeepLink, r04, 31);
        return this.tag.hashCode() + r05;
    }

    public final String toString() {
        return "UiMessageData(title=" + this.title + ", message=" + this.message + ", ctaMessage=" + this.ctaMessage + ", ctaDeepLink=" + this.ctaDeepLink + ", tag=" + this.tag + ")";
    }

    public UnifiedKycResponse$UiMessageData(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, Constants.KEY_TITLE);
        p.l(r3, "message");
        p.l(r4, "ctaMessage");
        p.l(r5, "ctaDeepLink");
        p.l(r6, "tag");
        this.title = r2;
        this.message = r3;
        this.ctaMessage = r4;
        this.ctaDeepLink = r5;
        this.tag = r6;
    }

    public /* synthetic */ UnifiedKycResponse$UiMessageData(String r2, String r3, String r4, String r5, String r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L18;
        String r72 = "";
    L17:
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}
