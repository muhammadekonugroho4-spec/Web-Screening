package org.minidns.util;

/* loaded from: classes3.dex */
public abstract class g implements CharSequence {
    public g() {
    }

    public String a() {
        return toString();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int r2) {
        return a().charAt(r2);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return a().length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int r1, int r2) {
        return a().subSequence(r2, r2);
    }
}
