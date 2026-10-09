package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes3.dex */
public enum ProtoBuf$MemberKind extends Enum<ProtoBuf$MemberKind> implements h.a {
    public static final ProtoBuf$MemberKind DECLARATION = null;
    public static final ProtoBuf$MemberKind DELEGATION = null;
    public static final ProtoBuf$MemberKind FAKE_OVERRIDE = null;
    public static final ProtoBuf$MemberKind SYNTHESIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static h.b f178995a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ProtoBuf$MemberKind[] f178996b = null;
    private final int value;

    static {
        ProtoBuf$MemberKind r02 = new ProtoBuf$MemberKind("DECLARATION", 0, 0, 0);
        DECLARATION = r02;
        ProtoBuf$MemberKind r1 = new ProtoBuf$MemberKind("FAKE_OVERRIDE", 1, 1, 1);
        FAKE_OVERRIDE = r1;
        ProtoBuf$MemberKind r2 = new ProtoBuf$MemberKind("DELEGATION", 2, 2, 2);
        DELEGATION = r2;
        ProtoBuf$MemberKind r3 = new ProtoBuf$MemberKind("SYNTHESIZED", 3, 3, 3);
        SYNTHESIZED = r3;
        f178996b = new ProtoBuf$MemberKind[]{r02, r1, r2, r3};
        f178995a = new a();
    }

    ProtoBuf$MemberKind(String r1, int r2, int r3, int r4) {
        this.value = r4;
    }

    public static ProtoBuf$MemberKind valueOf(String r1) {
        return (ProtoBuf$MemberKind) Enum.valueOf(ProtoBuf$MemberKind.class, r1);
    }

    public static ProtoBuf$MemberKind[] values() {
        return (ProtoBuf$MemberKind[]) f178996b.clone();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
    public final int getNumber() {
        return this.value;
    }

    public static ProtoBuf$MemberKind valueOf(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return SYNTHESIZED;
    L14:
        return DELEGATION;
    L16:
        return FAKE_OVERRIDE;
    L18:
        return DECLARATION;
    }
}
