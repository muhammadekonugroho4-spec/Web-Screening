package com.github.mikephil.charting.compose.data;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lcom/github/mikephil/charting/compose/data/CandleEntry;", "", "x", "", "open", Constants.PRIORITY_HIGH, "low", Constants.KEY_HIDE_CLOSE, Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(FFFFFLjava/lang/Object;)V", "getX", "()F", "getOpen", "getHigh", "getLow", "getClose", "getData", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "MPChartCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CandleEntry {
    public static final int $stable = 8;
    private final float close;
    private final Object data;
    private final float high;
    private final float low;
    private final float open;

    /* renamed from: x, reason: collision with root package name */
    private final float f37792x;

    static {
    }

    public CandleEntry(float r1, float r2, float r3, float r4, float r5, Object r6) {
        this.f37792x = r1;
        this.open = r2;
        this.high = r3;
        this.low = r4;
        this.close = r5;
        this.data = r6;
    }

    public static /* synthetic */ CandleEntry copy$default(CandleEntry r02, float r1, float r2, float r3, float r4, float r5, Object r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r02.f37792x;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r02.open;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r02.high;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r02.low;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r02.close;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r02.data;
    L20:
        float r72 = r5;
        Object r82 = r6;
        float r52 = r3;
        float r62 = r4;
        return r02.copy(r1, r2, r52, r62, r72, r82);
    }

    public final float component1() {
        return this.f37792x;
    }

    public final float component2() {
        return this.open;
    }

    public final float component3() {
        return this.high;
    }

    public final float component4() {
        return this.low;
    }

    public final float component5() {
        return this.close;
    }

    public final Object component6() {
        return this.data;
    }

    public final CandleEntry copy(float r8, float r9, float r10, float r11, float r12, Object r13) {
        return new CandleEntry(r8, r9, r10, r11, r12, r13);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CandleEntry) == true) goto L8;
        return false;
    L8:
        CandleEntry r52 = (CandleEntry) r5;
        if (Float.compare(this.f37792x, r52.f37792x) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.open, r52.open) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.high, r52.high) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.low, r52.low) == 0) goto L21;
        return false;
    L21:
        if (Float.compare(this.close, r52.close) == 0) goto L24;
        return false;
    L24:
        if (p.g(this.data, r52.data) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final float getClose() {
        return this.close;
    }

    public final Object getData() {
        return this.data;
    }

    public final float getHigh() {
        return this.high;
    }

    public final float getLow() {
        return this.low;
    }

    public final float getOpen() {
        return this.open;
    }

    public final float getX() {
        return this.f37792x;
    }

    public int hashCode() {
        int r02 = ((((((((Float.hashCode(this.f37792x) * 31) + Float.hashCode(this.open)) * 31) + Float.hashCode(this.high)) * 31) + Float.hashCode(this.low)) * 31) + Float.hashCode(this.close)) * 31;
        Object r1 = this.data;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "CandleEntry(x=" + this.f37792x + ", open=" + this.open + ", high=" + this.high + ", low=" + this.low + ", close=" + this.close + ", data=" + this.data + ")";
    }

    public /* synthetic */ CandleEntry(float r8, float r9, float r10, float r11, float r12, Object r13, int r14, i r15) {
        if ((r14 & 32) == 0) goto L5;
        r13 = null;
    L5:
        this(r8, r9, r10, r11, r12, r13);
    }
}
