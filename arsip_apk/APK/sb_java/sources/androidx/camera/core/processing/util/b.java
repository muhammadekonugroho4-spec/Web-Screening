package androidx.camera.core.processing.util;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f5962a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5963b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5964c;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f5965e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5966f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5967g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5968h;

    public b(UUID r1, int r2, int r3, Rect r4, Size r5, int r6, boolean r7, boolean r8) {
        if (r1 == null) goto L15;
        this.f5962a = r1;
        this.f5963b = r2;
        this.f5964c = r3;
        if (r4 == null) goto L13;
        this.d = r4;
        if (r5 == null) goto L11;
        this.f5965e = r5;
        this.f5966f = r6;
        this.f5967g = r7;
        this.f5968h = r8;
        return;
    L11:
        throw new NullPointerException("Null getSize");
    L13:
        throw new NullPointerException("Null getCropRect");
    L15:
        throw new NullPointerException("Null getUuid");
    }

    @Override // androidx.camera.core.processing.util.e
    public Rect a() {
        return this.d;
    }

    @Override // androidx.camera.core.processing.util.e
    public int b() {
        return this.f5964c;
    }

    @Override // androidx.camera.core.processing.util.e
    public int c() {
        return this.f5966f;
    }

    @Override // androidx.camera.core.processing.util.e
    public Size d() {
        return this.f5965e;
    }

    @Override // androidx.camera.core.processing.util.e
    public int e() {
        return this.f5963b;
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == false) goto L24;
        e r52 = (e) r5;
        if (this.f5962a.equals(r52.f()) == false) goto L24;
        if (this.f5963b != r52.e()) goto L24;
        if (this.f5964c != r52.b()) goto L24;
        if (this.d.equals(r52.a()) == false) goto L24;
        if (this.f5965e.equals(r52.d()) == false) goto L24;
        if (this.f5966f != r52.c()) goto L24;
        if (this.f5967g != r52.g()) goto L24;
        if (this.f5968h != r52.j()) goto L24;
        return true;
    L24:
        return false;
    }

    @Override // androidx.camera.core.processing.util.e
    public UUID f() {
        return this.f5962a;
    }

    @Override // androidx.camera.core.processing.util.e
    public boolean g() {
        return this.f5967g;
    }

    public int hashCode() {
        int r02 = (((((((((((this.f5962a.hashCode() ^ 1000003) * 1000003) ^ this.f5963b) * 1000003) ^ this.f5964c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f5965e.hashCode()) * 1000003) ^ this.f5966f) * 1000003;
        int r3 = 1237;
        if (this.f5967g == false) goto L5;
        int r2 = 1231;
    L6:
        int r03 = (r02 ^ r2) * 1000003;
        if (this.f5968h == false) goto L10;
        r3 = 1231;
    L10:
        return r03 ^ r3;
    L5:
        r2 = 1237;
        goto L6
    }

    @Override // androidx.camera.core.processing.util.e
    public boolean j() {
        return this.f5968h;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.f5962a + ", getTargets=" + this.f5963b + ", getFormat=" + this.f5964c + ", getCropRect=" + this.d + ", getSize=" + this.f5965e + ", getRotationDegrees=" + this.f5966f + ", isMirroring=" + this.f5967g + ", shouldRespectInputCropRect=" + this.f5968h + "}";
    }
}
