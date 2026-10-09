package androidx.compose.ui.contentcapture;

import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f16866a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16867b;

    /* renamed from: c, reason: collision with root package name */
    public final ContentCaptureEventType f16868c;
    public final androidx.compose.ui.platform.coreshims.e d;

    public k(int r1, long r2, ContentCaptureEventType r4, androidx.compose.ui.platform.coreshims.e r5) {
        this.f16866a = r1;
        this.f16867b = r2;
        this.f16868c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.f16866a;
    }

    public final androidx.compose.ui.platform.coreshims.e b() {
        return this.d;
    }

    public final ContentCaptureEventType c() {
        return this.f16868c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof k) == true) goto L8;
        return false;
    L8:
        k r82 = (k) r8;
        if (this.f16866a == r82.f16866a) goto L12;
        return false;
    L12:
        if (this.f16867b == r82.f16867b) goto L15;
        return false;
    L15:
        if (this.f16868c == r82.f16868c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((((Integer.hashCode(this.f16866a) * 31) + Long.hashCode(this.f16867b)) * 31) + this.f16868c.hashCode()) * 31;
        androidx.compose.ui.platform.coreshims.e r1 = this.d;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ContentCaptureEvent(id=" + this.f16866a + ", timestamp=" + this.f16867b + ", type=" + this.f16868c + ", structureCompat=" + this.d + ')';
    }
}
