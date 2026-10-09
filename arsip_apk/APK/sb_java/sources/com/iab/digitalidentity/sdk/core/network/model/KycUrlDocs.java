package com.iab.digitalidentity.sdk.core.network.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/network/model/KycUrlDocs;", "", "", Constants.KEY_ID, "kycType", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KycUrlDocs {

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final String f40154id;

    @SerializedName("document_type")
    private final String kycType;

    @SerializedName("url")
    private final String url;

    public KycUrlDocs() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final String a() {
        return this.f40154id;
    }

    public final String b() {
        return this.kycType;
    }

    public final String c() {
        return this.url;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof KycUrlDocs) == true) goto L8;
        return false;
    L8:
        KycUrlDocs r52 = (KycUrlDocs) r5;
        if (p.g(this.f40154id, r52.f40154id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.kycType, r52.kycType) == true) goto L15;
        return false;
    L15:
        if (p.g(this.url, r52.url) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        String r02 = this.f40154id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.kycType;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.url;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public final String toString() {
        return "KycUrlDocs(id=" + this.f40154id + ", kycType=" + this.kycType + ", url=" + this.url + ")";
    }

    public KycUrlDocs(String r1, String r2, String r3) {
        this.f40154id = r1;
        this.kycType = r2;
        this.url = r3;
    }

    public /* synthetic */ KycUrlDocs(String r2, String r3, String r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}
