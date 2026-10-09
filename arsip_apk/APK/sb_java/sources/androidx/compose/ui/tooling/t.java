package androidx.compose.ui.tooling;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t implements s {

    /* renamed from: b, reason: collision with root package name */
    public final Set f20602b;

    public t() {
        this.f20602b = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override // androidx.compose.ui.tooling.s
    public Set a() {
        return this.f20602b;
    }
}
