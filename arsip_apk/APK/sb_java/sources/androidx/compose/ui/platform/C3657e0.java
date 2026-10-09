package androidx.compose.ui.platform;

import androidx.compose.runtime.saveable.r;
import java.util.Map;

/* renamed from: androidx.compose.ui.platform.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3657e0 implements androidx.compose.runtime.saveable.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.saveable.r f19331a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.a f19332b;

    static {
    }

    public C3657e0(androidx.compose.runtime.saveable.r r1, kotlin.jvm.functions.a r2) {
        this.f19331a = r1;
        this.f19332b = r2;
    }

    @Override // androidx.compose.runtime.saveable.r
    public boolean a(Object r2) {
        return this.f19331a.a(r2);
    }

    @Override // androidx.compose.runtime.saveable.r
    public r.a b(String r2, kotlin.jvm.functions.a r3) {
        return this.f19331a.b(r2, r3);
    }

    @Override // androidx.compose.runtime.saveable.r
    public Map c() {
        return this.f19331a.c();
    }

    public final void d() {
        this.f19332b.invoke();
    }

    @Override // androidx.compose.runtime.saveable.r
    public Object f(String r2) {
        return this.f19331a.f(r2);
    }
}
