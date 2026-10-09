package androidx.compose.ui.focus;

/* renamed from: androidx.compose.ui.focus.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3486b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f17020a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17021b;

    static {
    }

    public /* synthetic */ C3486b(int r1, kotlin.jvm.internal.i r2) {
        this(r1);
    }

    @Override // androidx.compose.ui.focus.g
    public void a() {
        this.f17021b = true;
    }

    @Override // androidx.compose.ui.focus.g
    public int b() {
        return this.f17020a;
    }

    public final boolean c() {
        return this.f17021b;
    }

    public C3486b(int r1) {
        this.f17020a = r1;
    }
}
