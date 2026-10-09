package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.m;

/* loaded from: classes3.dex */
public final class g {
    public static final g d = null;

    /* renamed from: a, reason: collision with root package name */
    public final r f179430a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f179431b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f179432c;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f179433a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f179434b = null;

        static {
            int[] r02 = new int[WireFormat.FieldType.values().length];
            f179434b = r02;
            r02[WireFormat.FieldType.DOUBLE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L40
        L81:
            f179434b[WireFormat.FieldType.FLOAT.ordinal()] = 2;     // Catch: NoSuchFieldError -> L41
        L97:
            f179434b[WireFormat.FieldType.INT64.ordinal()] = 3;     // Catch: NoSuchFieldError -> L42
        L105:
            f179434b[WireFormat.FieldType.UINT64.ordinal()] = 4;     // Catch: NoSuchFieldError -> L43
        L109:
            f179434b[WireFormat.FieldType.INT32.ordinal()] = 5;     // Catch: NoSuchFieldError -> L44
        L69:
            f179434b[WireFormat.FieldType.FIXED64.ordinal()] = 6;     // Catch: NoSuchFieldError -> L45
        L71:
            f179434b[WireFormat.FieldType.FIXED32.ordinal()] = 7;     // Catch: NoSuchFieldError -> L46
        L89:
            f179434b[WireFormat.FieldType.BOOL.ordinal()] = 8;     // Catch: NoSuchFieldError -> L47
        L91:
            f179434b[WireFormat.FieldType.STRING.ordinal()] = 9;     // Catch: NoSuchFieldError -> L48
        L111:
            f179434b[WireFormat.FieldType.BYTES.ordinal()] = 10;     // Catch: NoSuchFieldError -> L49
        L115:
            f179434b[WireFormat.FieldType.UINT32.ordinal()] = 11;     // Catch: NoSuchFieldError -> L50
        L73:
            f179434b[WireFormat.FieldType.SFIXED32.ordinal()] = 12;     // Catch: NoSuchFieldError -> L51
        L79:
            f179434b[WireFormat.FieldType.SFIXED64.ordinal()] = 13;     // Catch: NoSuchFieldError -> L52
        L95:
            f179434b[WireFormat.FieldType.SINT32.ordinal()] = 14;     // Catch: NoSuchFieldError -> L53
        L101:
            f179434b[WireFormat.FieldType.SINT64.ordinal()] = 15;     // Catch: NoSuchFieldError -> L54
        L119:
            f179434b[WireFormat.FieldType.GROUP.ordinal()] = 16;     // Catch: NoSuchFieldError -> L55
        L67:
            f179434b[WireFormat.FieldType.MESSAGE.ordinal()] = 17;     // Catch: NoSuchFieldError -> L56
        L83:
            f179434b[WireFormat.FieldType.ENUM.ordinal()] = 18;     // Catch: NoSuchFieldError -> L57
        L29:
            int[] r9 = new int[WireFormat.JavaType.values().length];
            f179433a = r9;
            r9[WireFormat.JavaType.INT.ordinal()] = 1;     // Catch: NoSuchFieldError -> L58
        L103:
            f179433a[WireFormat.JavaType.LONG.ordinal()] = 2;     // Catch: NoSuchFieldError -> L59
        L107:
            f179433a[WireFormat.JavaType.FLOAT.ordinal()] = 3;     // Catch: NoSuchFieldError -> L60
        L117:
            f179433a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;     // Catch: NoSuchFieldError -> L61
        L75:
            f179433a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;     // Catch: NoSuchFieldError -> L62
        L85:
            f179433a[WireFormat.JavaType.STRING.ordinal()] = 6;     // Catch: NoSuchFieldError -> L63
        L87:
            f179433a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;     // Catch: NoSuchFieldError -> L64
        L93:
            f179433a[WireFormat.JavaType.ENUM.ordinal()] = 8;     // Catch: NoSuchFieldError -> L65
        L113:
            f179433a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;     // Catch: NoSuchFieldError -> L66
            return;
        }
    }

    public interface b extends Comparable {
        m.a f1(m.a r1, m r2);

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    static {
        d = new g(true);
    }

    public g() {
        this.f179432c = false;
        this.f179430a = r.p(16);
    }

    public static int d(WireFormat.FieldType r1, int r2, Object r3) {
        int r22 = CodedOutputStream.C(r2);
        if (r1 != WireFormat.FieldType.GROUP) goto L6;
        r22 = r22 * 2;
    L6:
        return r22 + e(r1, r3);
    }

    public static int e(WireFormat.FieldType r1, Object r2) {
        switch(a.f179434b[r1.ordinal()]) {
            case 1: goto L49;
            case 2: goto L47;
            case 3: goto L45;
            case 4: goto L43;
            case 5: goto L41;
            case 6: goto L39;
            case 7: goto L37;
            case 8: goto L35;
            case 9: goto L33;
            case 10: goto L27;
            case 11: goto L25;
            case 12: goto L23;
            case 13: goto L21;
            case 14: goto L19;
            case 15: goto L17;
            case 16: goto L15;
            case 17: goto L13;
            case 18: goto L7;
            default: goto L5;
        };
    L5:
        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    L7:
        if ((r2 instanceof h.a) == false) goto L11;
        return CodedOutputStream.i(((h.a) r2).getNumber());
    L11:
        return CodedOutputStream.i(((Integer) r2).intValue());
    L13:
        return CodedOutputStream.s((m) r2);
    L15:
        return CodedOutputStream.n((m) r2);
    L17:
        return CodedOutputStream.A(((Long) r2).longValue());
    L19:
        return CodedOutputStream.y(((Integer) r2).intValue());
    L21:
        return CodedOutputStream.x(((Long) r2).longValue());
    L23:
        return CodedOutputStream.w(((Integer) r2).intValue());
    L25:
        return CodedOutputStream.D(((Integer) r2).intValue());
    L27:
        if ((r2 instanceof d) == false) goto L31;
        return CodedOutputStream.e((d) r2);
    L31:
        return CodedOutputStream.c((byte[]) r2);
    L33:
        return CodedOutputStream.B((String) r2);
    L35:
        return CodedOutputStream.b(((Boolean) r2).booleanValue());
    L37:
        return CodedOutputStream.j(((Integer) r2).intValue());
    L39:
        return CodedOutputStream.k(((Long) r2).longValue());
    L41:
        return CodedOutputStream.p(((Integer) r2).intValue());
    L43:
        return CodedOutputStream.E(((Long) r2).longValue());
    L45:
        return CodedOutputStream.q(((Long) r2).longValue());
    L47:
        return CodedOutputStream.m(((Float) r2).floatValue());
    L49:
        return CodedOutputStream.g(((Double) r2).doubleValue());
    }

    public static int f(b r3, Object r4) {
        WireFormat.FieldType r02 = r3.getLiteType();
        int r1 = r3.getNumber();
        if (r3.isRepeated() == false) goto L18;
        int r2 = 0;
        if (r3.isPacked() == false) goto L12;
        Iterator r32 = ((List) r4).iterator();
    L8:
        if (r32.hasNext() == false) goto L11;
        r2 = r2 + e(r02, r32.next());
        goto L8
    L11:
        return (CodedOutputStream.C(r1) + r2) + CodedOutputStream.u(r2);
    L12:
        Iterator r33 = ((List) r4).iterator();
    L14:
        if (r33.hasNext() == false) goto L16;
        r2 = r2 + d(r02, r1, r33.next());
        goto L14
    L16:
        return r2;
    L18:
        return d(r02, r1, r4);
    }

    public static g g() {
        return d;
    }

    public static int l(WireFormat.FieldType r02, boolean r1) {
        if (r1 == false) goto L6;
        return 2;
    L6:
        return r02.getWireType();
    }

    public static g t() {
        return new g();
    }

    public static Object u(e r1, WireFormat.FieldType r2, boolean r3) {
        switch(a.f179434b[r2.ordinal()]) {
            case 1: goto L44;
            case 2: goto L42;
            case 3: goto L40;
            case 4: goto L38;
            case 5: goto L36;
            case 6: goto L34;
            case 7: goto L32;
            case 8: goto L30;
            case 9: goto L24;
            case 10: goto L23;
            case 11: goto L21;
            case 12: goto L19;
            case 13: goto L17;
            case 14: goto L15;
            case 15: goto L13;
            case 16: goto L11;
            case 17: goto L9;
            case 18: goto L7;
            default: goto L5;
        };
    L24:
        if (r3 == false) goto L28;
        return r1.I();
    L28:
        return r1.H();
    L5:
        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    L7:
        throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
    L9:
        throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
    L11:
        throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
    L13:
        return Long.valueOf(r1.G());
    L15:
        return Integer.valueOf(r1.F());
    L17:
        return Long.valueOf(r1.E());
    L19:
        return Integer.valueOf(r1.D());
    L21:
        return Integer.valueOf(r1.K());
    L23:
        return r1.k();
    L30:
        return Boolean.valueOf(r1.j());
    L32:
        return Integer.valueOf(r1.n());
    L34:
        return Long.valueOf(r1.o());
    L36:
        return Integer.valueOf(r1.r());
    L38:
        return Long.valueOf(r1.L());
    L40:
        return Long.valueOf(r1.s());
    L42:
        return Float.valueOf(r1.p());
    L44:
        return Double.valueOf(r1.l());
    }

    public static void w(WireFormat.FieldType r2, Object r3) {
        r3.getClass();
        boolean r02 = true;
        boolean r1 = false;
        switch(a.f179433a[r2.getJavaType().ordinal()]) {
            case 1: goto L23;
            case 2: goto L22;
            case 3: goto L21;
            case 4: goto L20;
            case 5: goto L19;
            case 6: goto L18;
            case 7: goto L14;
            case 8: goto L7;
            case 9: goto L5;
            default: goto L24;
        };
    L5:
        r1 = r3 instanceof m;
        goto L24
    L18:
        r1 = r3 instanceof String;
        goto L24
    L19:
        r1 = r3 instanceof Boolean;
        goto L24
    L20:
        r1 = r3 instanceof Double;
        goto L24
    L21:
        r1 = r3 instanceof Float;
        goto L24
    L22:
        r1 = r3 instanceof Long;
        goto L24
    L23:
        r1 = r3 instanceof Integer;
    L24:
        if (r1 == false) goto L27;
        return;
    L27:
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    L7:
        if ((r3 instanceof Integer) == false) goto L9;
    L12:
        r1 = r02;
        goto L24
    L9:
        if ((r3 instanceof h.a) == true) goto L12;
    L11:
        r02 = false;
        goto L12
    L14:
        if ((r3 instanceof d) == true) goto L12;
        if ((r3 instanceof byte[]) == false) goto L11;
        goto L11
    }

    public static void x(CodedOutputStream r1, WireFormat.FieldType r2, int r3, Object r4) {
        if (r2 != WireFormat.FieldType.GROUP) goto L6;
        r1.X(r3, (m) r4);
        return;
    L6:
        r1.v0(r3, l(r2, false));
        y(r1, r2, r4);
    }

    public static void y(CodedOutputStream r1, WireFormat.FieldType r2, Object r3) {
        switch(a.f179434b[r2.ordinal()]) {
            case 1: goto L47;
            case 2: goto L45;
            case 3: goto L43;
            case 4: goto L41;
            case 5: goto L39;
            case 6: goto L37;
            case 7: goto L35;
            case 8: goto L33;
            case 9: goto L31;
            case 10: goto L26;
            case 11: goto L23;
            case 12: goto L21;
            case 13: goto L19;
            case 14: goto L17;
            case 15: goto L15;
            case 16: goto L13;
            case 17: goto L11;
            case 18: goto L6;
            default: goto L4;
        };
    L4:
        return;
    L11:
        r1.d0((m) r3);
        return;
    L13:
        r1.Y((m) r3);
        return;
    L15:
        r1.t0(((Long) r3).longValue());
        return;
    L17:
        r1.r0(((Integer) r3).intValue());
        return;
    L19:
        r1.q0(((Long) r3).longValue());
        return;
    L21:
        r1.p0(((Integer) r3).intValue());
        return;
    L23:
        r1.x0(((Integer) r3).intValue());
        return;
    L31:
        r1.u0((String) r3);
        return;
    L33:
        r1.L(((Boolean) r3).booleanValue());
        return;
    L35:
        r1.T(((Integer) r3).intValue());
        return;
    L37:
        r1.U(((Long) r3).longValue());
        return;
    L39:
        r1.a0(((Integer) r3).intValue());
        return;
    L41:
        r1.y0(((Long) r3).longValue());
        return;
    L43:
        r1.b0(((Long) r3).longValue());
        return;
    L45:
        r1.W(((Float) r3).floatValue());
        return;
    L47:
        r1.Q(((Double) r3).doubleValue());
        return;
    L6:
        if ((r3 instanceof h.a) == false) goto L9;
        r1.S(((h.a) r3).getNumber());
        return;
    L9:
        r1.S(((Integer) r3).intValue());
        return;
    L26:
        if ((r3 instanceof d) == false) goto L29;
        r1.O((d) r3);
        return;
    L29:
        r1.M((byte[]) r3);
    }

    public static void z(b r3, Object r4, CodedOutputStream r5) {
        WireFormat.FieldType r02 = r3.getLiteType();
        int r1 = r3.getNumber();
        if (r3.isRepeated() == false) goto L19;
        List r42 = (List) r4;
        if (r3.isPacked() == false) goto L14;
        r5.v0(r1, 2);
        Iterator r32 = r42.iterator();
        int r12 = 0;
    L8:
        if (r32.hasNext() == false) goto L10;
        r12 = r12 + e(r02, r32.next());
        goto L8
    L10:
        r5.n0(r12);
        Iterator r33 = r42.iterator();
    L12:
        if (r33.hasNext() == false) goto L18;
        y(r5, r02, r33.next());
        goto L12
    L18:
        return;
    L14:
        Iterator r34 = r42.iterator();
    L16:
        if (r34.hasNext() == false) goto L24;
        x(r5, r02, r1, r34.next());
        goto L16
    L24:
        return;
    L19:
        x(r5, r02, r1, r4);
    }

    public void a(b r3, Object r4) {
        if (r3.isRepeated() == false) goto L11;
        w(r3.getLiteType(), r4);
        Object r02 = h(r3);
        if (r02 != null) goto L7;
        List r03 = new ArrayList();
        this.f179430a.q(r3, r03);
    L8:
        r03.add(r4);
        return;
    L7:
        r03 = (List) r02;
        goto L8
    L11:
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public g b() {
        g r02 = t();
        int r1 = 0;
    L4:
        if (r1 >= this.f179430a.j()) goto L6;
        Map.Entry r2 = this.f179430a.i(r1);
        r02.v((b) r2.getKey(), r2.getValue());
        r1 = r1 + 1;
        goto L4
    L6:
        Iterator r12 = this.f179430a.l().iterator();
    L8:
        if (r12.hasNext() == false) goto L10;
        Map.Entry r22 = (Map.Entry) r12.next();
        r02.v((b) r22.getKey(), r22.getValue());
        goto L8
    L10:
        r02.f179432c = this.f179432c;
        return r02;
    }

    public final Object c(Object r4) {
        if ((r4 instanceof byte[]) == false) goto L6;
        byte[] r42 = (byte[]) r4;
        byte[] r02 = new byte[r42.length];
        System.arraycopy(r42, 0, r02, 0, r42.length);
        return r02;
    L6:
        return r4;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return b();
    }

    public Object h(b r2) {
        return this.f179430a.get(r2);
    }

    public Object i(b r2, int r3) {
        if (r2.isRepeated() == false) goto L11;
        Object r22 = h(r2);
        if (r22 == null) goto L9;
        return ((List) r22).get(r3);
    L9:
        throw new IndexOutOfBoundsException();
    L11:
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int j(b r2) {
        if (r2.isRepeated() == false) goto L11;
        Object r22 = h(r2);
        if (r22 != null) goto L9;
        return 0;
    L9:
        return ((List) r22).size();
    L11:
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int k() {
        int r02 = 0;
        int r1 = 0;
    L4:
        if (r02 >= this.f179430a.j()) goto L6;
        Map.Entry r2 = this.f179430a.i(r02);
        r1 = r1 + f((b) r2.getKey(), r2.getValue());
        r02 = r02 + 1;
        goto L4
    L6:
        Iterator r03 = this.f179430a.l().iterator();
    L8:
        if (r03.hasNext() == false) goto L10;
        Map.Entry r22 = (Map.Entry) r03.next();
        r1 = r1 + f((b) r22.getKey(), r22.getValue());
        goto L8
    L10:
        return r1;
    }

    public boolean m(b r2) {
        if (r2.isRepeated() == true) goto L11;
        if (this.f179430a.get(r2) == null) goto L8;
        return true;
    L8:
        return false;
    L11:
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public boolean n() {
        int r1 = 0;
    L4:
        if (r1 >= this.f179430a.j()) goto L9;
        if (o(this.f179430a.i(r1)) == false) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        return false;
    L9:
        Iterator r12 = this.f179430a.l().iterator();
    L11:
        if (r12.hasNext() == false) goto L15;
        if (o((Map.Entry) r12.next()) == true) goto L11;
        return false;
    L15:
        return true;
    }

    public final boolean o(Map.Entry r4) {
        b r02 = (b) r4.getKey();
        if (r02.getLiteJavaType() == WireFormat.JavaType.MESSAGE) goto L5;
        return true;
    L5:
        if (r02.isRepeated() == false) goto L12;
        Iterator r42 = ((List) r4.getValue()).iterator();
    L8:
        if (r42.hasNext() == false) goto L25;
        if (((m) r42.next()).isInitialized() == true) goto L8;
        return false;
    L25:
        return true;
    L12:
        Object r43 = r4.getValue();
        if ((r43 instanceof m) == false) goto L18;
        if (((m) r43).isInitialized() == true) goto L24;
        return false;
    L24:
        return true;
    L18:
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public Iterator p() {
        if (this.f179432c == false) goto L7;
        return new i(this.f179430a.entrySet().iterator());
    L7:
        return this.f179430a.entrySet().iterator();
    }

    public void q() {
        if (this.f179431b == false) goto L5;
        return;
    L5:
        this.f179430a.o();
        this.f179431b = true;
    }

    public void r(g r3) {
        int r02 = 0;
    L4:
        if (r02 >= r3.f179430a.j()) goto L6;
        s(r3.f179430a.i(r02));
        r02 = r02 + 1;
        goto L4
    L6:
        Iterator r32 = r3.f179430a.l().iterator();
    L8:
        if (r32.hasNext() == false) goto L10;
        s((Map.Entry) r32.next());
        goto L8
    }

    public final void s(Map.Entry r5) {
        b r02 = (b) r5.getKey();
        Object r52 = r5.getValue();
        if (r02.isRepeated() == false) goto L14;
        Object r1 = h(r02);
        if (r1 != null) goto L7;
        r1 = new ArrayList();
    L7:
        Iterator r53 = ((List) r52).iterator();
    L9:
        if (r53.hasNext() == false) goto L11;
        ((List) r1).add(c(r53.next()));
        goto L9
    L11:
        this.f179430a.q(r02, r1);
        return;
    L14:
        if (r02.getLiteJavaType() != WireFormat.JavaType.MESSAGE) goto L21;
        Object r12 = h(r02);
        if (r12 != null) goto L19;
        this.f179430a.q(r02, c(r52));
        return;
    L19:
        m r54 = r02.f1(((m) r12).toBuilder(), (m) r52).build();
        this.f179430a.q(r02, r54);
        return;
    L21:
        this.f179430a.q(r02, c(r52));
    }

    public void v(b r4, Object r5) {
        if (r4.isRepeated() == true) goto L5;
        w(r4.getLiteType(), r5);
    L14:
        this.f179430a.q(r4, r5);
        return;
    L5:
        if ((r5 instanceof List) == false) goto L12;
        ArrayList r02 = new ArrayList();
        r02.addAll((List) r5);
        Iterator r52 = r02.iterator();
    L8:
        if (r52.hasNext() == false) goto L10;
        Object r1 = r52.next();
        w(r4.getLiteType(), r1);
        goto L8
    L10:
        r5 = r02;
        goto L14
    L12:
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public g(boolean r1) {
        this.f179432c = false;
        this.f179430a = r.p(0);
        q();
    }
}
