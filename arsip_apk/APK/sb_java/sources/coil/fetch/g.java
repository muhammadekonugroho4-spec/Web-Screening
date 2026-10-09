package coil.fetch;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f30015a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30016b;

    /* renamed from: c, reason: collision with root package name */
    public final DataSource f30017c;

    public g(Drawable r2, boolean r3, DataSource r4) {
        super(null);
        this.f30015a = r2;
        this.f30016b = r3;
        this.f30017c = r4;
    }

    public final DataSource a() {
        return this.f30017c;
    }

    public final Drawable b() {
        return this.f30015a;
    }

    public final boolean c() {
        return this.f30016b;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof g) == false) goto L14;
        g r42 = (g) r4;
        if (p.g(this.f30015a, r42.f30015a) == true) goto L10;
        return false;
    L10:
        if (this.f30016b == r42.f30016b) goto L12;
        return false;
    L12:
        if (this.f30017c != r42.f30017c) goto L18;
        return true;
    L18:
        return false;
    L14:
        return false;
    }

    public int hashCode() {
        return (((this.f30015a.hashCode() * 31) + Boolean.hashCode(this.f30016b)) * 31) + this.f30017c.hashCode();
    }
}
