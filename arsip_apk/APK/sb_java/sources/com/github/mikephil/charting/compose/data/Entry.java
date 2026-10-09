package com.github.mikephil.charting.compose.data;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/github/mikephil/charting/compose/data/Entry;", "", "x", "", "y", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(FFLjava/lang/Object;)V", "getX", "()F", "getY", "getData", "()Ljava/lang/Object;", "component1", "component2", "component3", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "MPChartCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Entry {
    public static final int $stable = 8;
    private final Object data;

    /* renamed from: x, reason: collision with root package name */
    private final float f37793x;

    /* renamed from: y, reason: collision with root package name */
    private final float f37794y;

    static {
    }

    public Entry(float r1, float r2, Object r3) {
        this.f37793x = r1;
        this.f37794y = r2;
        this.data = r3;
    }

    public static /* synthetic */ Entry copy$default(Entry r02, float r1, float r2, Object r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f37793x;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f37794y;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.data;
    L12:
        return r02.copy(r1, r2, r3);
    }

    public final float component1() {
        return this.f37793x;
    }

    public final float component2() {
        return this.f37794y;
    }

    public final Object component3() {
        return this.data;
    }

    public final Entry copy(float r2, float r3, Object r4) {
        return new Entry(r2, r3, r4);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Entry) == true) goto L8;
        return false;
    L8:
        Entry r52 = (Entry) r5;
        if (Float.compare(this.f37793x, r52.f37793x) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.f37794y, r52.f37794y) == 0) goto L15;
        return false;
    L15:
        if (p.g(this.data, r52.data) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final Object getData() {
        return this.data;
    }

    public final float getX() {
        return this.f37793x;
    }

    public final float getY() {
        return this.f37794y;
    }

    public int hashCode() {
        int r02 = ((Float.hashCode(this.f37793x) * 31) + Float.hashCode(this.f37794y)) * 31;
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
        return "Entry(x=" + this.f37793x + ", y=" + this.f37794y + ", data=" + this.data + ")";
    }

    public /* synthetic */ Entry(float r1, float r2, Object r3, int r4, i r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        this(r1, r2, r3);
    }
}
