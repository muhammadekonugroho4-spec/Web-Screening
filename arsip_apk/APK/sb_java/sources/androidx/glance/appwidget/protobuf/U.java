package androidx.glance.appwidget.protobuf;

/* loaded from: classes4.dex */
public final class U implements F {

    /* renamed from: a, reason: collision with root package name */
    public final H f25029a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25030b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f25031c;
    public final int d;

    public U(H r4, String r5, Object[] r6) {
        this.f25029a = r4;
        this.f25030b = r5;
        this.f25031c = r6;
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
        return this.f25031c;
    }

    public String b() {
        return this.f25030b;
    }

    @Override // androidx.glance.appwidget.protobuf.F
    public H getDefaultInstance() {
        return this.f25029a;
    }

    @Override // androidx.glance.appwidget.protobuf.F
    public ProtoSyntax getSyntax() {
        int r02 = this.d;
        if ((r02 & 1) == 0) goto L7;
        return ProtoSyntax.PROTO2;
    L7:
        if ((r02 & 4) != 4) goto L11;
        return ProtoSyntax.EDITIONS;
    L11:
        return ProtoSyntax.PROTO3;
    }

    @Override // androidx.glance.appwidget.protobuf.F
    public boolean isMessageSetWireFormat() {
        if ((this.d & 2) != 2) goto L6;
        return true;
    L6:
        return false;
    }
}
