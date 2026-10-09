package androidx.compose.foundation.text.contextmenu.data;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f9720a;

    static {
    }

    public a(int r1) {
        this.f9720a = r1;
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof a) == true) goto L6;
        return false;
    L6:
        if (this.f9720a != ((a) r3).f9720a) goto L9;
        return true;
    L9:
        return false;
    }

    public int hashCode() {
        return this.f9720a;
    }
}
