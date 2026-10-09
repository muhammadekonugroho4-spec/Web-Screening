package androidx.glance.appwidget.proto;

import androidx.glance.appwidget.protobuf.AbstractC3997u;

/* loaded from: classes4.dex */
public enum LayoutProto$NodeIdentity extends Enum<LayoutProto$NodeIdentity> implements AbstractC3997u.a {
    public static final LayoutProto$NodeIdentity BACKGROUND_NODE = null;
    public static final int BACKGROUND_NODE_VALUE = 1;
    public static final LayoutProto$NodeIdentity DEFAULT_IDENTITY = null;
    public static final int DEFAULT_IDENTITY_VALUE = 0;
    public static final LayoutProto$NodeIdentity UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC3997u.b f24951a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ LayoutProto$NodeIdentity[] f24952b = null;
    private final int value;

    public static final class b implements AbstractC3997u.c {

        /* renamed from: a, reason: collision with root package name */
        public static final AbstractC3997u.c f24953a = null;

        static {
            f24953a = new b();
        }

        public b() {
        }

        @Override // androidx.glance.appwidget.protobuf.AbstractC3997u.c
        public boolean isInRange(int r1) {
            if (LayoutProto$NodeIdentity.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        DEFAULT_IDENTITY = new LayoutProto$NodeIdentity("DEFAULT_IDENTITY", 0, 0);
        BACKGROUND_NODE = new LayoutProto$NodeIdentity("BACKGROUND_NODE", 1, 1);
        UNRECOGNIZED = new LayoutProto$NodeIdentity("UNRECOGNIZED", 2, -1);
        f24952b = a();
        f24951a = new a();
    }

    LayoutProto$NodeIdentity(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ LayoutProto$NodeIdentity[] a() {
        return new LayoutProto$NodeIdentity[]{DEFAULT_IDENTITY, BACKGROUND_NODE, UNRECOGNIZED};
    }

    public static LayoutProto$NodeIdentity forNumber(int r1) {
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L8;
        return null;
    L8:
        return BACKGROUND_NODE;
    L10:
        return DEFAULT_IDENTITY;
    }

    public static AbstractC3997u.b internalGetValueMap() {
        return f24951a;
    }

    public static AbstractC3997u.c internalGetVerifier() {
        return b.f24953a;
    }

    public static LayoutProto$NodeIdentity valueOf(String r1) {
        return (LayoutProto$NodeIdentity) Enum.valueOf(LayoutProto$NodeIdentity.class, r1);
    }

    public static LayoutProto$NodeIdentity[] values() {
        return (LayoutProto$NodeIdentity[]) f24952b.clone();
    }

    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LayoutProto$NodeIdentity valueOf(int r02) {
        return forNumber(r02);
    }
}
