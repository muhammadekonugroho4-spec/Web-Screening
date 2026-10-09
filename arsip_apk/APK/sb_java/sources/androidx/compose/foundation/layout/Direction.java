package androidx.compose.foundation.layout;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/layout/Direction;", "", "<init>", "(Ljava/lang/String;I)V", "Vertical", "Horizontal", "Both", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum Direction extends Enum<Direction> {
    public static final Direction Both = null;
    public static final Direction Horizontal = null;
    public static final Direction Vertical = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Direction[] f7840a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f7841b = null;

    static {
        Vertical = new Direction("Vertical", 0);
        Horizontal = new Direction("Horizontal", 1);
        Both = new Direction("Both", 2);
        Direction[] r02 = a();
        f7840a = r02;
        f7841b = kotlin.enums.b.a(r02);
    }

    Direction(String r1, int r2) {
    }

    public static final /* synthetic */ Direction[] a() {
        return new Direction[]{Vertical, Horizontal, Both};
    }

    public static kotlin.enums.a getEntries() {
        return f7841b;
    }

    public static Direction valueOf(String r1) {
        return (Direction) Enum.valueOf(Direction.class, r1);
    }

    public static Direction[] values() {
        return (Direction[]) f7840a.clone();
    }
}
