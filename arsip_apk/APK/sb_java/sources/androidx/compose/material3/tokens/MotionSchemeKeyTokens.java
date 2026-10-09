package androidx.compose.material3.tokens;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/material3/tokens/MotionSchemeKeyTokens;", "", "<init>", "(Ljava/lang/String;I)V", "DefaultSpatial", "FastSpatial", "SlowSpatial", "DefaultEffects", "FastEffects", "SlowEffects", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum MotionSchemeKeyTokens extends Enum<MotionSchemeKeyTokens> {
    public static final MotionSchemeKeyTokens DefaultEffects = null;
    public static final MotionSchemeKeyTokens DefaultSpatial = null;
    public static final MotionSchemeKeyTokens FastEffects = null;
    public static final MotionSchemeKeyTokens FastSpatial = null;
    public static final MotionSchemeKeyTokens SlowEffects = null;
    public static final MotionSchemeKeyTokens SlowSpatial = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MotionSchemeKeyTokens[] f14545a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f14546b = null;

    static {
        DefaultSpatial = new MotionSchemeKeyTokens("DefaultSpatial", 0);
        FastSpatial = new MotionSchemeKeyTokens("FastSpatial", 1);
        SlowSpatial = new MotionSchemeKeyTokens("SlowSpatial", 2);
        DefaultEffects = new MotionSchemeKeyTokens("DefaultEffects", 3);
        FastEffects = new MotionSchemeKeyTokens("FastEffects", 4);
        SlowEffects = new MotionSchemeKeyTokens("SlowEffects", 5);
        MotionSchemeKeyTokens[] r02 = a();
        f14545a = r02;
        f14546b = kotlin.enums.b.a(r02);
    }

    MotionSchemeKeyTokens(String r1, int r2) {
    }

    public static final /* synthetic */ MotionSchemeKeyTokens[] a() {
        return new MotionSchemeKeyTokens[]{DefaultSpatial, FastSpatial, SlowSpatial, DefaultEffects, FastEffects, SlowEffects};
    }

    public static kotlin.enums.a getEntries() {
        return f14546b;
    }

    public static MotionSchemeKeyTokens valueOf(String r1) {
        return (MotionSchemeKeyTokens) Enum.valueOf(MotionSchemeKeyTokens.class, r1);
    }

    public static MotionSchemeKeyTokens[] values() {
        return (MotionSchemeKeyTokens[]) f14545a.clone();
    }
}
