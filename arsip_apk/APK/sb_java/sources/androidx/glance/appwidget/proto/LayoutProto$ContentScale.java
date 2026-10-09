package androidx.glance.appwidget.proto;

import androidx.glance.appwidget.protobuf.AbstractC3997u;

/* loaded from: classes4.dex */
public enum LayoutProto$ContentScale extends Enum<LayoutProto$ContentScale> implements AbstractC3997u.a {
    public static final LayoutProto$ContentScale CROP = null;
    public static final int CROP_VALUE = 2;
    public static final LayoutProto$ContentScale FILL_BOUNDS = null;
    public static final int FILL_BOUNDS_VALUE = 3;
    public static final LayoutProto$ContentScale FIT = null;
    public static final int FIT_VALUE = 1;
    public static final LayoutProto$ContentScale UNRECOGNIZED = null;
    public static final LayoutProto$ContentScale UNSPECIFIED_CONTENT_SCALE = null;
    public static final int UNSPECIFIED_CONTENT_SCALE_VALUE = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC3997u.b f24939a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ LayoutProto$ContentScale[] f24940b = null;
    private final int value;

    public static final class b implements AbstractC3997u.c {

        /* renamed from: a, reason: collision with root package name */
        public static final AbstractC3997u.c f24941a = null;

        static {
            f24941a = new b();
        }

        public b() {
        }

        @Override // androidx.glance.appwidget.protobuf.AbstractC3997u.c
        public boolean isInRange(int r1) {
            if (LayoutProto$ContentScale.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        UNSPECIFIED_CONTENT_SCALE = new LayoutProto$ContentScale("UNSPECIFIED_CONTENT_SCALE", 0, 0);
        FIT = new LayoutProto$ContentScale("FIT", 1, 1);
        CROP = new LayoutProto$ContentScale("CROP", 2, 2);
        FILL_BOUNDS = new LayoutProto$ContentScale("FILL_BOUNDS", 3, 3);
        UNRECOGNIZED = new LayoutProto$ContentScale("UNRECOGNIZED", 4, -1);
        f24940b = a();
        f24939a = new a();
    }

    LayoutProto$ContentScale(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ LayoutProto$ContentScale[] a() {
        return new LayoutProto$ContentScale[]{UNSPECIFIED_CONTENT_SCALE, FIT, CROP, FILL_BOUNDS, UNRECOGNIZED};
    }

    public static LayoutProto$ContentScale forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return FILL_BOUNDS;
    L14:
        return CROP;
    L16:
        return FIT;
    L18:
        return UNSPECIFIED_CONTENT_SCALE;
    }

    public static AbstractC3997u.b internalGetValueMap() {
        return f24939a;
    }

    public static AbstractC3997u.c internalGetVerifier() {
        return b.f24941a;
    }

    public static LayoutProto$ContentScale valueOf(String r1) {
        return (LayoutProto$ContentScale) Enum.valueOf(LayoutProto$ContentScale.class, r1);
    }

    public static LayoutProto$ContentScale[] values() {
        return (LayoutProto$ContentScale[]) f24940b.clone();
    }

    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LayoutProto$ContentScale valueOf(int r02) {
        return forNumber(r02);
    }
}
