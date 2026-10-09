package androidx.compose.material3.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/internal/InputPhase;", "", "<init>", "(Ljava/lang/String;I)V", "Focused", "UnfocusedEmpty", "UnfocusedNotEmpty", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
enum InputPhase extends Enum<InputPhase> {
    public static final InputPhase Focused = null;
    public static final InputPhase UnfocusedEmpty = null;
    public static final InputPhase UnfocusedNotEmpty = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ InputPhase[] f13660a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f13661b = null;

    static {
        Focused = new InputPhase("Focused", 0);
        UnfocusedEmpty = new InputPhase("UnfocusedEmpty", 1);
        UnfocusedNotEmpty = new InputPhase("UnfocusedNotEmpty", 2);
        InputPhase[] r02 = a();
        f13660a = r02;
        f13661b = kotlin.enums.b.a(r02);
    }

    InputPhase(String r1, int r2) {
    }

    public static final /* synthetic */ InputPhase[] a() {
        return new InputPhase[]{Focused, UnfocusedEmpty, UnfocusedNotEmpty};
    }

    public static kotlin.enums.a getEntries() {
        return f13661b;
    }

    public static InputPhase valueOf(String r1) {
        return (InputPhase) Enum.valueOf(InputPhase.class, r1);
    }

    public static InputPhase[] values() {
        return (InputPhase[]) f13660a.clone();
    }
}
