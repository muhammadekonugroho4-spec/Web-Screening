package androidx.datastore.preferences.protobuf;

/* loaded from: classes4.dex */
public final class U implements F {

    /* renamed from: a, reason: collision with root package name */
    public final H f23769a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23770b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f23771c;
    public final int d;

    public U(H r4, String r5, Object[] r6) {
        this.f23769a = r4;
        this.f23770b = r5;
        this.f23771c = r6;
        char r42 = r5.charAt(0);
        if (r42 >= 55296) goto L6;
        this.d = r42;
        return;
    L6:
        int r43 = r42 & 8191;
        int r02 = 13;
        int r1 = 1;
    L7:
        int r2 = r1 + 1;
        char r12 = r5.charAt(r1);
        if (r12 < 55296) goto L10;
        r43 = r43 | ((r12 & 8191) << r02);
        r02 = r02 + 13;
        r1 = r2;
        goto L7
    L10:
        this.d = r43 | (r12 << r02);
    }

    public Object[] a() {
        return this.f23771c;
    }

    public String b() {
        return this.f23770b;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public H getDefaultInstance() {
        return this.f23769a;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public ProtoSyntax getSyntax() {
        if ((this.d & 1) != 1) goto L7;
        return ProtoSyntax.PROTO2;
    L7:
        return ProtoSyntax.PROTO3;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public boolean isMessageSetWireFormat() {
        if ((this.d & 2) != 2) goto L6;
        return true;
    L6:
        return false;
    }
}
