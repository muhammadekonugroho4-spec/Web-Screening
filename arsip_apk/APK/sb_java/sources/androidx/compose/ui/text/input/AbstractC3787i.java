package androidx.compose.ui.text.input;

/* renamed from: androidx.compose.ui.text.input.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3787i {
    public static final /* synthetic */ boolean a(char r02, char r1) {
        return b(r02, r1);
    }

    public static final boolean b(char r02, char r1) {
        if (Character.isHighSurrogate(r02) == true) goto L5;
        return false;
    L5:
        if (Character.isLowSurrogate(r1) == false) goto L10;
        return true;
    L10:
        return false;
    }
}
