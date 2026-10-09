package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.text.style.ResolvedTextDirection;

/* renamed from: androidx.compose.foundation.text.input.internal.selection.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2845f {

    /* renamed from: f, reason: collision with root package name */
    public static final a f10458f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final C2845f f10459g = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10460a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10461b;

    /* renamed from: c, reason: collision with root package name */
    public final float f10462c;
    public final ResolvedTextDirection d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10463e;

    /* renamed from: androidx.compose.foundation.text.input.internal.selection.f$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C2845f a() {
            return C2845f.a();
        }

        public a() {
        }
    }

    static {
        f10458f = new a(null);
        boolean r3 = false;
        float r6 = 0.0f;
        f10459g = new C2845f(r3, androidx.compose.ui.geometry.e.f17050b.b(), r6, ResolvedTextDirection.Ltr, false, null);
    }

    public /* synthetic */ C2845f(boolean r1, long r2, float r4, ResolvedTextDirection r5, boolean r6, kotlin.jvm.internal.i r7) {
        this(r1, r2, r4, r5, r6);
    }

    public static final /* synthetic */ C2845f a() {
        return f10459g;
    }

    public final ResolvedTextDirection b() {
        return this.d;
    }

    public final boolean c() {
        return this.f10463e;
    }

    public final float d() {
        return this.f10462c;
    }

    public final long e() {
        return this.f10461b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C2845f) == true) goto L8;
        return false;
    L8:
        C2845f r82 = (C2845f) r8;
        if (this.f10460a == r82.f10460a) goto L12;
        return false;
    L12:
        if (androidx.compose.ui.geometry.e.j(this.f10461b, r82.f10461b) == true) goto L15;
        return false;
    L15:
        if (Float.compare(this.f10462c, r82.f10462c) == 0) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (this.f10463e == r82.f10463e) goto L23;
        return false;
    L23:
        return true;
    }

    public final boolean f() {
        return this.f10460a;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f10460a) * 31) + androidx.compose.ui.geometry.e.o(this.f10461b)) * 31) + Float.hashCode(this.f10462c)) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f10463e);
    }

    public String toString() {
        return "TextFieldHandleState(visible=" + this.f10460a + ", position=" + androidx.compose.ui.geometry.e.s(this.f10461b) + ", lineHeight=" + this.f10462c + ", direction=" + this.d + ", handlesCrossed=" + this.f10463e + ')';
    }

    public C2845f(boolean r1, long r2, float r4, ResolvedTextDirection r5, boolean r6) {
        this.f10460a = r1;
        this.f10461b = r2;
        this.f10462c = r4;
        this.d = r5;
        this.f10463e = r6;
    }
}
