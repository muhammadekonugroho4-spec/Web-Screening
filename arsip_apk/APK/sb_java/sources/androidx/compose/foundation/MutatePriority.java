package androidx.compose.foundation;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/MutatePriority;", "", "<init>", "(Ljava/lang/String;I)V", "Default", "UserInput", "PreventUserInput", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum MutatePriority extends Enum<MutatePriority> {
    public static final MutatePriority Default = null;
    public static final MutatePriority PreventUserInput = null;
    public static final MutatePriority UserInput = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MutatePriority[] f7185a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f7186b = null;

    static {
        Default = new MutatePriority("Default", 0);
        UserInput = new MutatePriority("UserInput", 1);
        PreventUserInput = new MutatePriority("PreventUserInput", 2);
        MutatePriority[] r02 = a();
        f7185a = r02;
        f7186b = kotlin.enums.b.a(r02);
    }

    MutatePriority(String r1, int r2) {
    }

    public static final /* synthetic */ MutatePriority[] a() {
        return new MutatePriority[]{Default, UserInput, PreventUserInput};
    }

    public static kotlin.enums.a getEntries() {
        return f7186b;
    }

    public static MutatePriority valueOf(String r1) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, r1);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) f7185a.clone();
    }
}
