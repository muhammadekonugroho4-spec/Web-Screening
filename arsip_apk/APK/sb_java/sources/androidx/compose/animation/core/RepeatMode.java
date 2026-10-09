package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/animation/core/RepeatMode;", "", "<init>", "(Ljava/lang/String;I)V", "Restart", "Reverse", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum RepeatMode extends Enum<RepeatMode> {
    public static final RepeatMode Restart = null;
    public static final RepeatMode Reverse = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RepeatMode[] f6684a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f6685b = null;

    static {
        Restart = new RepeatMode("Restart", 0);
        Reverse = new RepeatMode("Reverse", 1);
        RepeatMode[] r02 = a();
        f6684a = r02;
        f6685b = kotlin.enums.b.a(r02);
    }

    RepeatMode(String r1, int r2) {
    }

    public static final /* synthetic */ RepeatMode[] a() {
        return new RepeatMode[]{Restart, Reverse};
    }

    public static kotlin.enums.a getEntries() {
        return f6685b;
    }

    public static RepeatMode valueOf(String r1) {
        return (RepeatMode) Enum.valueOf(RepeatMode.class, r1);
    }

    public static RepeatMode[] values() {
        return (RepeatMode[]) f6684a.clone();
    }
}
