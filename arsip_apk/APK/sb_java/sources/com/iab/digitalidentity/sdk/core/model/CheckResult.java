package com.iab.digitalidentity.sdk.core.model;

import a.AbstractC2049c;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/CheckResult;", "", "resultCode", "", "resultTag", "", "message", "(ILjava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getResultCode", "()I", "getResultTag", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckResult {
    private final String message;
    private final int resultCode;
    private final String resultTag;

    public CheckResult(int r2, String r3, String r4) {
        p.l(r3, "resultTag");
        p.l(r4, "message");
        this.resultCode = r2;
        this.resultTag = r3;
        this.message = r4;
    }

    public static /* synthetic */ CheckResult copy$default(CheckResult r02, int r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.resultCode;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.resultTag;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.message;
    L12:
        return r02.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.resultCode;
    }

    public final String component2() {
        return this.resultTag;
    }

    public final String component3() {
        return this.message;
    }

    public final CheckResult copy(int r2, String r3, String r4) {
        p.l(r3, "resultTag");
        p.l(r4, "message");
        return new CheckResult(r2, r3, r4);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CheckResult) == true) goto L8;
        return false;
    L8:
        CheckResult r52 = (CheckResult) r5;
        if (this.resultCode == r52.resultCode) goto L12;
        return false;
    L12:
        if (p.g(this.resultTag, r52.resultTag) == true) goto L15;
        return false;
    L15:
        if (p.g(this.message, r52.message) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final String getResultTag() {
        return this.resultTag;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.resultCode) * 31;
        int r03 = AbstractC2049c.a(this.resultTag, r02, 31);
        return this.message.hashCode() + r03;
    }

    public String toString() {
        return "CheckResult(resultCode=" + this.resultCode + ", resultTag=" + this.resultTag + ", message=" + this.message + ")";
    }
}
