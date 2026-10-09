package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/animation/core/AnimationEndReason;", "", "<init>", "(Ljava/lang/String;I)V", "BoundReached", "Finished", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum AnimationEndReason extends Enum<AnimationEndReason> {
    public static final AnimationEndReason BoundReached = null;
    public static final AnimationEndReason Finished = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AnimationEndReason[] f6620a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f6621b = null;

    static {
        BoundReached = new AnimationEndReason("BoundReached", 0);
        Finished = new AnimationEndReason("Finished", 1);
        AnimationEndReason[] r02 = a();
        f6620a = r02;
        f6621b = kotlin.enums.b.a(r02);
    }

    AnimationEndReason(String r1, int r2) {
    }

    public static final /* synthetic */ AnimationEndReason[] a() {
        return new AnimationEndReason[]{BoundReached, Finished};
    }

    public static kotlin.enums.a getEntries() {
        return f6621b;
    }

    public static AnimationEndReason valueOf(String r1) {
        return (AnimationEndReason) Enum.valueOf(AnimationEndReason.class, r1);
    }

    public static AnimationEndReason[] values() {
        return (AnimationEndReason[]) f6620a.clone();
    }
}
