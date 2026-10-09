package com.huawei.hms.common.size;

import com.huawei.hms.common.internal.Objects;

/* loaded from: classes6.dex */
public class Size {

    /* renamed from: a, reason: collision with root package name */
    private final int f39134a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39135b;

    public Size(int r1, int r2) {
        this.f39134a = r1;
        this.f39135b = r2;
    }

    public static Size parseSize(String r3) {
        int r02 = r3.indexOf("x");     // Catch: Exception -> L7
        if (r02 >= 0) goto L5;
        r02 = r3.indexOf("*");     // Catch: Exception -> L7
    L5:
        return new Size(Integer.parseInt(r3.substring(0, r02)), Integer.parseInt(r3.substring(r02 + 1)));
    L8:
        throw new IllegalArgumentException("Size parses failed");
    }

    public final boolean equals(Object r5) {
        if (r5 != null) goto L6;
        return false;
    L6:
        if (this != r5) goto L9;
        return true;
    L9:
        if ((r5 instanceof Size) == false) goto L15;
        Size r52 = (Size) r5;
        if (this.f39134a != r52.f39134a) goto L15;
        if (this.f39135b != r52.f39135b) goto L15;
        return true;
    L15:
        return false;
    }

    public final int getHeight() {
        return this.f39135b;
    }

    public final int getWidth() {
        return this.f39134a;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(getWidth()), Integer.valueOf(getHeight())});
    }

    public final String toString() {
        return "Width is " + this.f39134a + " Height is " + this.f39135b;
    }
}
