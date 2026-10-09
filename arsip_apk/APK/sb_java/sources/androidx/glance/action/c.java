package androidx.glance.action;

import androidx.glance.o;
import kotlin.jvm.internal.i;

/* loaded from: classes4.dex */
public final class c implements o.b {

    /* renamed from: b, reason: collision with root package name */
    public final a f24648b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24649c;

    static {
    }

    public c(a r1, int r2) {
        this.f24648b = r1;
        this.f24649c = r2;
    }

    public final a b() {
        return this.f24648b;
    }

    public final int e() {
        return this.f24649c;
    }

    public String toString() {
        return "ActionModifier(action=" + this.f24648b + ", rippleOverride=" + this.f24649c + ')';
    }

    public /* synthetic */ c(a r1, int r2, int r3, i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 0;
    L5:
        this(r1, r2);
    }
}
