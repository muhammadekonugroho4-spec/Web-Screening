package com.iab.digitalidentity.sdk.core.model;

import a.AbstractC2049c;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/StackTraceData;", "", "startClass", "", "startMethod", "endClass", "endMethod", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEndClass", "()Ljava/lang/String;", "getEndMethod", "getStartClass", "getStartMethod", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StackTraceData {
    private final String endClass;
    private final String endMethod;
    private final String startClass;
    private final String startMethod;

    public StackTraceData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ StackTraceData copy$default(StackTraceData r02, String r1, String r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.startClass;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.startMethod;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.endClass;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.endMethod;
    L15:
        return r02.copy(r1, r2, r3, r4);
    }

    public final String component1() {
        return this.startClass;
    }

    public final String component2() {
        return this.startMethod;
    }

    public final String component3() {
        return this.endClass;
    }

    public final String component4() {
        return this.endMethod;
    }

    public final StackTraceData copy(String r2, String r3, String r4, String r5) {
        p.l(r2, "startClass");
        p.l(r3, "startMethod");
        p.l(r4, "endClass");
        p.l(r5, "endMethod");
        return new StackTraceData(r2, r3, r4, r5);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StackTraceData) == true) goto L8;
        return false;
    L8:
        StackTraceData r52 = (StackTraceData) r5;
        if (p.g(this.startClass, r52.startClass) == true) goto L12;
        return false;
    L12:
        if (p.g(this.startMethod, r52.startMethod) == true) goto L15;
        return false;
    L15:
        if (p.g(this.endClass, r52.endClass) == true) goto L18;
        return false;
    L18:
        if (p.g(this.endMethod, r52.endMethod) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final String getEndClass() {
        return this.endClass;
    }

    public final String getEndMethod() {
        return this.endMethod;
    }

    public final String getStartClass() {
        return this.startClass;
    }

    public final String getStartMethod() {
        return this.startMethod;
    }

    public int hashCode() {
        int r02 = this.startClass.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.startMethod, r02, 31);
        int r04 = AbstractC2049c.a(this.endClass, r03, 31);
        return this.endMethod.hashCode() + r04;
    }

    public String toString() {
        return "StackTraceData(startClass=" + this.startClass + ", startMethod=" + this.startMethod + ", endClass=" + this.endClass + ", endMethod=" + this.endMethod + ")";
    }

    public StackTraceData(String r2, String r3, String r4, String r5) {
        p.l(r2, "startClass");
        p.l(r3, "startMethod");
        p.l(r4, "endClass");
        p.l(r5, "endMethod");
        this.startClass = r2;
        this.startMethod = r3;
        this.endClass = r4;
        this.endMethod = r5;
    }

    public /* synthetic */ StackTraceData(String r2, String r3, String r4, String r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
