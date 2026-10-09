package androidx.compose.foundation.text.contextmenu.data;

import kotlin.jvm.functions.l;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: b, reason: collision with root package name */
    public final String f9725b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9726c;
    public final l d;

    static {
    }

    public d(Object r1, String r2, int r3, l r4) {
        super(r1);
        this.f9725b = r2;
        this.f9726c = r3;
        this.d = r4;
    }

    public final String b() {
        return this.f9725b;
    }

    public final int c() {
        return this.f9726c;
    }

    public final l d() {
        return this.d;
    }

    public String toString() {
        return "TextContextMenuItem(key=" + a() + ", label=\"" + this.f9725b + "\", leadingIcon=" + this.f9726c + ')';
    }
}
