package androidx.compose.ui.input.indirect;

import androidx.compose.ui.input.pointer.x;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f17919a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17920b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17921c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17922e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17923f;

    /* renamed from: g, reason: collision with root package name */
    public final long f17924g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17925h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17926i;

    static {
    }

    public /* synthetic */ f(long r1, long r3, long r5, boolean r7, float r8, long r9, long r11, boolean r13, i r14) {
        this(r1, r3, r5, r7, r8, r9, r11, r13);
    }

    public final void a() {
        this.f17926i = true;
    }

    public final long b() {
        return this.f17919a;
    }

    public final long c() {
        return this.f17921c;
    }

    public final boolean d() {
        return this.d;
    }

    public final long e() {
        return this.f17924g;
    }

    public final boolean f() {
        return this.f17925h;
    }

    public final long g() {
        return this.f17920b;
    }

    public final boolean h() {
        return this.f17926i;
    }

    public String toString() {
        return "IndirectPointerInputChange(id=" + x.d(this.f17919a) + ", uptimeMillis=" + this.f17920b + ", position=" + androidx.compose.ui.geometry.e.s(this.f17921c) + ", pressed=" + this.d + ", pressure=" + this.f17922e + ", previousUptimeMillis=" + this.f17923f + ", previousPosition=" + androidx.compose.ui.geometry.e.s(this.f17924g) + ", previousPressed=" + this.f17925h + ", isConsumed=" + this.f17926i + ')';
    }

    public f(long r1, long r3, long r5, boolean r7, float r8, long r9, long r11, boolean r13) {
        this.f17919a = r1;
        this.f17920b = r3;
        this.f17921c = r5;
        this.d = r7;
        this.f17922e = r8;
        this.f17923f = r9;
        this.f17924g = r11;
        this.f17925h = r13;
    }
}
