package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;

/* loaded from: classes4.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    public final a f23704a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23705b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23706c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final WireFormat.FieldType f23707a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f23708b;

        /* renamed from: c, reason: collision with root package name */
        public final WireFormat.FieldType f23709c;
        public final Object d;

        public a(WireFormat.FieldType r1, Object r2, WireFormat.FieldType r3, Object r4) {
            this.f23707a = r1;
            this.f23708b = r2;
            this.f23709c = r3;
            this.d = r4;
        }
    }

    public B(WireFormat.FieldType r2, Object r3, WireFormat.FieldType r4, Object r5) {
        this.f23704a = new a(r2, r3, r4, r5);
        this.f23705b = r3;
        this.f23706c = r5;
    }

    public static int b(a r2, Object r3, Object r4) {
        return C3927q.b(r2.f23707a, 1, r3) + C3927q.b(r2.f23709c, 2, r4);
    }

    public static B d(WireFormat.FieldType r1, Object r2, WireFormat.FieldType r3, Object r4) {
        return new B(r1, r2, r3, r4);
    }

    public static void e(CodedOutputStream r2, a r3, Object r4, Object r5) {
        C3927q.u(r2, r3.f23707a, 1, r4);
        C3927q.u(r2, r3.f23709c, 2, r5);
    }

    public int a(int r2, Object r3, Object r4) {
        return CodedOutputStream.P(r2) + CodedOutputStream.y(b(this.f23704a, r3, r4));
    }

    public a c() {
        return this.f23704a;
    }
}
