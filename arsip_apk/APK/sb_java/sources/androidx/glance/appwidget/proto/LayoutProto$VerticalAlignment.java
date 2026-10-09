package androidx.glance.appwidget.proto;

import androidx.glance.appwidget.protobuf.AbstractC3997u;

/* loaded from: classes4.dex */
public enum LayoutProto$VerticalAlignment extends Enum<LayoutProto$VerticalAlignment> implements AbstractC3997u.a {
    public static final LayoutProto$VerticalAlignment BOTTOM = null;
    public static final int BOTTOM_VALUE = 3;
    public static final LayoutProto$VerticalAlignment CENTER_VERTICALLY = null;
    public static final int CENTER_VERTICALLY_VALUE = 2;
    public static final LayoutProto$VerticalAlignment TOP = null;
    public static final int TOP_VALUE = 1;
    public static final LayoutProto$VerticalAlignment UNRECOGNIZED = null;
    public static final LayoutProto$VerticalAlignment UNSPECIFIED_VERTICAL_ALIGNMENT = null;
    public static final int UNSPECIFIED_VERTICAL_ALIGNMENT_VALUE = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC3997u.b f24954a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ LayoutProto$VerticalAlignment[] f24955b = null;
    private final int value;

    public static final class b implements AbstractC3997u.c {

        /* renamed from: a, reason: collision with root package name */
        public static final AbstractC3997u.c f24956a = null;

        static {
            f24956a = new b();
        }

        public b() {
        }

        @Override // androidx.glance.appwidget.protobuf.AbstractC3997u.c
        public boolean isInRange(int r1) {
            if (LayoutProto$VerticalAlignment.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        UNSPECIFIED_VERTICAL_ALIGNMENT = new LayoutProto$VerticalAlignment("UNSPECIFIED_VERTICAL_ALIGNMENT", 0, 0);
        TOP = new LayoutProto$VerticalAlignment("TOP", 1, 1);
        CENTER_VERTICALLY = new LayoutProto$VerticalAlignment("CENTER_VERTICALLY", 2, 2);
        BOTTOM = new LayoutProto$VerticalAlignment("BOTTOM", 3, 3);
        UNRECOGNIZED = new LayoutProto$VerticalAlignment("UNRECOGNIZED", 4, -1);
        f24955b = a();
        f24954a = new a();
    }

    LayoutProto$VerticalAlignment(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ LayoutProto$VerticalAlignment[] a() {
        return new LayoutProto$VerticalAlignment[]{UNSPECIFIED_VERTICAL_ALIGNMENT, TOP, CENTER_VERTICALLY, BOTTOM, UNRECOGNIZED};
    }

    public static LayoutProto$VerticalAlignment forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return BOTTOM;
    L14:
        return CENTER_VERTICALLY;
    L16:
        return TOP;
    L18:
        return UNSPECIFIED_VERTICAL_ALIGNMENT;
    }

    public static AbstractC3997u.b internalGetValueMap() {
        return f24954a;
    }

    public static AbstractC3997u.c internalGetVerifier() {
        return b.f24956a;
    }

    public static LayoutProto$VerticalAlignment valueOf(String r1) {
        return (LayoutProto$VerticalAlignment) Enum.valueOf(LayoutProto$VerticalAlignment.class, r1);
    }

    public static LayoutProto$VerticalAlignment[] values() {
        return (LayoutProto$VerticalAlignment[]) f24955b.clone();
    }

    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LayoutProto$VerticalAlignment valueOf(int r02) {
        return forNumber(r02);
    }
}
