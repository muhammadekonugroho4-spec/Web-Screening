package androidx.glance.appwidget.proto;

import androidx.glance.appwidget.protobuf.AbstractC3997u;

/* loaded from: classes4.dex */
public enum LayoutProto$HorizontalAlignment extends Enum<LayoutProto$HorizontalAlignment> implements AbstractC3997u.a {
    public static final LayoutProto$HorizontalAlignment CENTER_HORIZONTALLY = null;
    public static final int CENTER_HORIZONTALLY_VALUE = 2;
    public static final LayoutProto$HorizontalAlignment END = null;
    public static final int END_VALUE = 3;
    public static final LayoutProto$HorizontalAlignment START = null;
    public static final int START_VALUE = 1;
    public static final LayoutProto$HorizontalAlignment UNRECOGNIZED = null;
    public static final LayoutProto$HorizontalAlignment UNSPECIFIED_HORIZONTAL_ALIGNMENT = null;
    public static final int UNSPECIFIED_HORIZONTAL_ALIGNMENT_VALUE = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC3997u.b f24945a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ LayoutProto$HorizontalAlignment[] f24946b = null;
    private final int value;

    public static final class b implements AbstractC3997u.c {

        /* renamed from: a, reason: collision with root package name */
        public static final AbstractC3997u.c f24947a = null;

        static {
            f24947a = new b();
        }

        public b() {
        }

        @Override // androidx.glance.appwidget.protobuf.AbstractC3997u.c
        public boolean isInRange(int r1) {
            if (LayoutProto$HorizontalAlignment.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        UNSPECIFIED_HORIZONTAL_ALIGNMENT = new LayoutProto$HorizontalAlignment("UNSPECIFIED_HORIZONTAL_ALIGNMENT", 0, 0);
        START = new LayoutProto$HorizontalAlignment("START", 1, 1);
        CENTER_HORIZONTALLY = new LayoutProto$HorizontalAlignment("CENTER_HORIZONTALLY", 2, 2);
        END = new LayoutProto$HorizontalAlignment("END", 3, 3);
        UNRECOGNIZED = new LayoutProto$HorizontalAlignment("UNRECOGNIZED", 4, -1);
        f24946b = a();
        f24945a = new a();
    }

    LayoutProto$HorizontalAlignment(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ LayoutProto$HorizontalAlignment[] a() {
        return new LayoutProto$HorizontalAlignment[]{UNSPECIFIED_HORIZONTAL_ALIGNMENT, START, CENTER_HORIZONTALLY, END, UNRECOGNIZED};
    }

    public static LayoutProto$HorizontalAlignment forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return END;
    L14:
        return CENTER_HORIZONTALLY;
    L16:
        return START;
    L18:
        return UNSPECIFIED_HORIZONTAL_ALIGNMENT;
    }

    public static AbstractC3997u.b internalGetValueMap() {
        return f24945a;
    }

    public static AbstractC3997u.c internalGetVerifier() {
        return b.f24947a;
    }

    public static LayoutProto$HorizontalAlignment valueOf(String r1) {
        return (LayoutProto$HorizontalAlignment) Enum.valueOf(LayoutProto$HorizontalAlignment.class, r1);
    }

    public static LayoutProto$HorizontalAlignment[] values() {
        return (LayoutProto$HorizontalAlignment[]) f24946b.clone();
    }

    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LayoutProto$HorizontalAlignment valueOf(int r02) {
        return forNumber(r02);
    }
}
