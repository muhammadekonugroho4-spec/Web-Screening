package androidx.compose.ui.state;

/* loaded from: classes.dex */
public abstract class a {
    public static final ToggleableState a(boolean r02) {
        if (r02 == false) goto L6;
        return ToggleableState.On;
    L6:
        return ToggleableState.Off;
    }
}
