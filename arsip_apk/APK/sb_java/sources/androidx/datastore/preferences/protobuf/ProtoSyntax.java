package androidx.datastore.preferences.protobuf;

/* loaded from: classes4.dex */
public enum ProtoSyntax extends Enum<ProtoSyntax> {
    public static final ProtoSyntax PROTO2 = null;
    public static final ProtoSyntax PROTO3 = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ProtoSyntax[] f23763a = null;

    static {
        ProtoSyntax r02 = new ProtoSyntax("PROTO2", 0);
        PROTO2 = r02;
        ProtoSyntax r1 = new ProtoSyntax("PROTO3", 1);
        PROTO3 = r1;
        f23763a = new ProtoSyntax[]{r02, r1};
    }

    ProtoSyntax(String r1, int r2) {
    }

    public static ProtoSyntax valueOf(String r1) {
        return (ProtoSyntax) Enum.valueOf(ProtoSyntax.class, r1);
    }

    public static ProtoSyntax[] values() {
        return (ProtoSyntax[]) f23763a.clone();
    }
}
