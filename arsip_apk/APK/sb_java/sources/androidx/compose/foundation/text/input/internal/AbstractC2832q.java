package androidx.compose.foundation.text.input.internal;

/* renamed from: androidx.compose.foundation.text.input.internal.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2832q {
    public static final int a(int r02) {
        return Character.charCount(r02);
    }

    public static final int b(CharSequence r02, int r1) {
        return Character.codePointAt(r02, r1);
    }

    public static final int c(CharSequence r02, int r1) {
        return Character.codePointBefore(r02, r1);
    }
}
