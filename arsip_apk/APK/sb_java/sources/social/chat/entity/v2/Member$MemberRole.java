package social.chat.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum Member$MemberRole extends Enum<Member$MemberRole> implements Internal.EnumLite {
    public static final Member$MemberRole MEMBER_ROLE_ADMIN = null;
    public static final int MEMBER_ROLE_ADMIN_VALUE = 2;
    public static final Member$MemberRole MEMBER_ROLE_NORMAL = null;
    public static final int MEMBER_ROLE_NORMAL_VALUE = 1;
    public static final Member$MemberRole MEMBER_ROLE_UNSPECIFIED = null;
    public static final int MEMBER_ROLE_UNSPECIFIED_VALUE = 0;
    public static final Member$MemberRole UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f184026a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Member$MemberRole[] f184027b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f184028a = null;

        static {
            f184028a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Member$MemberRole.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        MEMBER_ROLE_UNSPECIFIED = new Member$MemberRole("MEMBER_ROLE_UNSPECIFIED", 0, 0);
        MEMBER_ROLE_NORMAL = new Member$MemberRole("MEMBER_ROLE_NORMAL", 1, 1);
        MEMBER_ROLE_ADMIN = new Member$MemberRole("MEMBER_ROLE_ADMIN", 2, 2);
        UNRECOGNIZED = new Member$MemberRole("UNRECOGNIZED", 3, -1);
        f184027b = a();
        f184026a = new a();
    }

    Member$MemberRole(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Member$MemberRole[] a() {
        return new Member$MemberRole[]{MEMBER_ROLE_UNSPECIFIED, MEMBER_ROLE_NORMAL, MEMBER_ROLE_ADMIN, UNRECOGNIZED};
    }

    public static Member$MemberRole forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return MEMBER_ROLE_ADMIN;
    L12:
        return MEMBER_ROLE_NORMAL;
    L14:
        return MEMBER_ROLE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Member$MemberRole> internalGetValueMap() {
        return f184026a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f184028a;
    }

    public static Member$MemberRole valueOf(String r1) {
        return (Member$MemberRole) Enum.valueOf(Member$MemberRole.class, r1);
    }

    public static Member$MemberRole[] values() {
        return (Member$MemberRole[]) f184027b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Member$MemberRole valueOf(int r02) {
        return forNumber(r02);
    }
}
