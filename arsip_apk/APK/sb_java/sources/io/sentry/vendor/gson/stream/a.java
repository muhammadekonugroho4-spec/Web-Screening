package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class a implements Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final Reader f176918a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f176919b;

    /* renamed from: c, reason: collision with root package name */
    public final char[] f176920c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f176921e;

    /* renamed from: f, reason: collision with root package name */
    public int f176922f;

    /* renamed from: g, reason: collision with root package name */
    public int f176923g;

    /* renamed from: h, reason: collision with root package name */
    public int f176924h;

    /* renamed from: i, reason: collision with root package name */
    public long f176925i;

    /* renamed from: j, reason: collision with root package name */
    public int f176926j;

    /* renamed from: k, reason: collision with root package name */
    public String f176927k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f176928l;

    /* renamed from: m, reason: collision with root package name */
    public int f176929m;

    /* renamed from: n, reason: collision with root package name */
    public String[] f176930n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f176931o;

    public a(Reader r5) {
        this.f176919b = false;
        this.f176920c = new char[1024];
        this.d = 0;
        this.f176921e = 0;
        this.f176922f = 0;
        this.f176923g = 0;
        this.f176924h = 0;
        int[] r2 = new int[32];
        this.f176928l = r2;
        this.f176929m = 1;
        r2[0] = 6;
        this.f176930n = new String[32];
        this.f176931o = new int[32];
        if (r5 == null) goto L7;
        this.f176918a = r5;
        return;
    L7:
        throw new NullPointerException("in == null");
    }

    public final String B(char r10) {
        char[] r02 = this.f176920c;
        StringBuilder r1 = null;
    L3:
        int r2 = this.d;
        int r3 = this.f176921e;
    L4:
        int r4 = r3;
        int r32 = r2;
    L6:
        if (r2 >= r4) goto L25;
        int r7 = r2 + 1;
        char r22 = r02[r2];
        if (r22 == r10) goto L9;
        if (r22 == '\\') goto L17;
        if (r22 != '\n') goto L24;
        this.f176922f++;
        this.f176923g = r7;
    L24:
        r2 = r7;
        goto L6
    L17:
        this.d = r7;
        int r72 = r7 - r32;
        int r23 = r72 - 1;
        if (r1 != null) goto L20;
        r1 = new StringBuilder(Math.max(r72 * 2, 16));
    L20:
        r1.append(r02, r32, r23);
        r1.append(Z());
        r2 = this.d;
        r3 = this.f176921e;
        goto L4
    L9:
        this.d = r7;
        int r73 = (r7 - r32) - 1;
        if (r1 == null) goto L12;
        r1.append(r02, r32, r73);
        return r1.toString();
    L12:
        return new String(r02, r32, r73);
    L25:
        if (r1 != null) goto L27;
        r1 = new StringBuilder(Math.max((r2 - r32) * 2, 16));
    L27:
        r1.append(r02, r32, r2 - r32);
        this.d = r2;
        if (k(1) == true) goto L3;
        throw o0("Unterminated string");
    }

    public final String E() {
        StringBuilder r02 = null;
        int r1 = 0;
    L3:
        int r2 = 0;
    L4:
        int r3 = this.d;
        if ((r3 + r2) < this.f176921e) goto L6;
        if (r2 >= this.f176920c.length) goto L41;
        if (k(r2 + 1) == true) goto L4;
    L40:
        r1 = r2;
    L45:
        if (r02 != null) goto L47;
        String r03 = new String(this.f176920c, this.d, r1);
    L48:
        this.d += r1;
        return r03;
    L47:
        r02.append(this.f176920c, this.d, r1);
        r03 = r02.toString();
        goto L48
    L41:
        if (r02 != null) goto L43;
        r02 = new StringBuilder(Math.max(r2, 16));
    L43:
        r02.append(this.f176920c, this.d, r2);
        this.d += r2;
        if (k(1) == true) goto L3;
    L6:
        char r32 = this.f176920c[r3 + r2];
        if (r32 == '\t') goto L40;
        if (r32 == '\n') goto L40;
        if (r32 == '\f') goto L40;
        if (r32 == '\r') goto L40;
        if (r32 == ' ') goto L40;
        if (r32 == '#') goto L34;
        if (r32 == ',') goto L40;
        if (r32 == '/') goto L34;
        if (r32 == '=') goto L34;
        if (r32 == '{') goto L40;
        if (r32 == '}') goto L40;
        if (r32 == ':') goto L40;
        if (r32 == ';') goto L34;
        switch(r32) {
            case 91: goto L40;
            case 92: goto L34;
            case 93: goto L40;
            default: goto L33;
        };
    L33:
        r2 = r2 + 1;
    L34:
        c();
        goto L40
    }

    public final int M() {
        char r02 = this.f176920c[this.d];
        if (r02 != 't') goto L5;
    L20:
        String r03 = "true";
        String r1 = "TRUE";
        int r3 = 5;
    L21:
        int r4 = r03.length();
        int r5 = 1;
    L22:
        if (r5 >= r4) goto L35;
        if ((this.d + r5) >= this.f176921e) goto L26;
    L28:
        char r6 = this.f176920c[this.d + r5];
        if (r6 == r03.charAt(r5)) goto L33;
        if (r6 == r1.charAt(r5)) goto L33;
        return 0;
    L33:
        r5 = r5 + 1;
        goto L22
    L26:
        if (k(r5 + 1) == true) goto L28;
        return 0;
    L35:
        if ((this.d + r4) < this.f176921e) goto L39;
        if (k(r4 + 1) == true) goto L39;
    L41:
        this.d += r4;
        this.f176924h = r3;
        return r3;
    L39:
        if (l(this.f176920c[this.d + r4]) == false) goto L41;
        return 0;
    L5:
        if (r02 == 'T') goto L20;
        if (r02 != 'f') goto L10;
    L19:
        r03 = "false";
        r1 = "FALSE";
        r3 = 6;
        goto L21
    L10:
        if (r02 == 'F') goto L19;
        if (r02 != 'n') goto L15;
    L18:
        r03 = "null";
        r1 = "NULL";
        r3 = 7;
        goto L21
    L15:
        if (r02 == 'N') goto L18;
        return 0;
    }

    public final int O() {
        char[] r1 = this.f176920c;
        int r2 = this.d;
        int r3 = this.f176921e;
        int r6 = 0;
        int r8 = 0;
        char r9 = 0;
        boolean r13 = false;
        int r10 = 1;
        long r11 = 0;
    L3:
        char r5 = 2;
        if ((r2 + r8) == r3) goto L6;
    L12:
        char r14 = r1[r2 + r8];
        int r18 = r6;
        if (r14 != '+') goto L15;
        r5 = 6;
        if (r9 != 5) goto L95;
    L50:
        r9 = r5;
    L94:
        r8 = r8 + 1;
        r6 = r18;
        goto L3
    L95:
        return r18;
    L15:
        if (r14 != 'E') goto L17;
    L85:
        if (r9 != 2) goto L87;
    L90:
        r9 = 5;
        goto L94
    L87:
        if (r9 == 4) goto L90;
        return r18;
    L17:
        if (r14 == 'e') goto L85;
        if (r14 != '-') goto L21;
        r5 = 6;
        if (r9 != 0) goto L82;
        r9 = 1;
        r13 = true;
        goto L94
    L82:
        if (r9 == 5) goto L50;
        return r18;
    L21:
        if (r14 != '.') goto L23;
        if (r9 != 2) goto L78;
        r9 = 3;
        goto L94
    L78:
        return r18;
    L23:
        if (r14 < '0') goto L52;
        if (r14 > '9') goto L52;
        if (r9 == 1) goto L49;
        if (r9 == 0) goto L49;
        if (r9 == 2) goto L32;
        if (r9 != 3) goto L45;
        r9 = 4;
        goto L94
    L45:
        if (r9 != 5) goto L47;
    L48:
        r9 = 7;
        goto L94
    L47:
        if (r9 != 6) goto L94;
    L32:
        if (r11 == 0) goto L33;
        long r4 = (10 * r11) - (r14 - '0');
        if (r11 > (-922337203685477580L)) goto L41;
        if (r11 == (-922337203685477580L)) goto L38;
    L40:
        int r62 = r18;
    L42:
        r10 = r10 & r62;
        r11 = r4;
        goto L94
    L38:
        if (r4 >= r11) goto L40;
    L41:
        r62 = 1;
        goto L42
    L33:
        return r18;
    L49:
        r11 = -(r14 - '0');
    L52:
        if (l(r14) == true) goto L75;
    L53:
        if (r9 != 2) goto L66;
        if (r10 == 0) goto L66;
        if (r11 != Long.MIN_VALUE) goto L59;
        if (r13 == false) goto L66;
    L59:
        if (r11 != 0) goto L61;
        if (r13 == true) goto L66;
    L61:
        if (r13 == true) goto L64;
        r11 = -r11;
    L64:
        this.f176925i = r11;
        this.d += r8;
        this.f176924h = 15;
        return 15;
    L66:
        if (r9 != 2) goto L68;
    L73:
        this.f176926j = r8;
        this.f176924h = 16;
        return 16;
    L68:
        if (r9 == 4) goto L73;
        if (r9 == 7) goto L73;
        return r18;
    L75:
        return r18;
    L6:
        if (r8 == r1.length) goto L7;
        if (k(r8 + 1) == false) goto L10;
        r2 = this.d;
        r3 = this.f176921e;
        goto L12
    L10:
        r18 = r6;
        goto L53
    L7:
        return r6;
    }

    public final void W(int r4) {
        int r02 = this.f176929m;
        int[] r1 = this.f176928l;
        if (r02 != r1.length) goto L5;
        int r03 = r02 * 2;
        this.f176928l = Arrays.copyOf(r1, r03);
        this.f176931o = Arrays.copyOf(this.f176931o, r03);
        this.f176930n = (String[]) Arrays.copyOf(this.f176930n, r03);
    L5:
        int[] r04 = this.f176928l;
        int r12 = this.f176929m;
        this.f176929m = r12 + 1;
        r04[r12] = r4;
    }

    public final char Z() {
        if (this.d == this.f176921e) goto L5;
    L9:
        char[] r02 = this.f176920c;
        int r1 = this.d;
        int r4 = r1 + 1;
        this.d = r4;
        char r03 = r02[r1];
        if (r03 != '\n') goto L12;
        this.f176922f++;
        this.f176923g = r4;
        return r03;
    L12:
        if (r03 != '\"') goto L14;
        return r03;
    L14:
        if (r03 != '\'') goto L16;
        return r03;
    L16:
        if (r03 != '/') goto L18;
        return r03;
    L18:
        if (r03 != '\\') goto L20;
        return r03;
    L20:
        if (r03 != 'b') goto L22;
        return '\b';
    L22:
        if (r03 != 'f') goto L24;
        return '\f';
    L24:
        if (r03 != 'n') goto L26;
        return '\n';
    L26:
        if (r03 != 'r') goto L28;
        return '\r';
    L28:
        if (r03 != 't') goto L30;
        return '\t';
    L30:
        if (r03 != 'u') goto L61;
        if ((r1 + 5) > this.f176921e) goto L34;
    L38:
        int r04 = this.d;
        int r12 = r04 + 4;
        char r2 = 0;
    L39:
        if (r04 >= r12) goto L58;
        char r5 = this.f176920c[r04];
        char r22 = (char) (r2 << 4);
        if (r5 < '0') goto L47;
        if (r5 > '9') goto L47;
        int r52 = r5 - '0';
    L45:
        r2 = (char) (r22 + r52);
        r04 = r04 + 1;
    L47:
        if (r5 < 'a') goto L51;
        if (r5 > 'f') goto L51;
        r52 = r5 - 'W';
    L51:
        if (r5 < 'A') goto L57;
        if (r5 > 'F') goto L57;
        r52 = r5 - '7';
    L57:
        throw new NumberFormatException("\\u" + new String(this.f176920c, this.d, 4));
    L58:
        this.d += 4;
        return r2;
    L34:
        if (k(4) == true) goto L38;
        throw o0("Unterminated escape sequence");
    L61:
        throw o0("Invalid escape sequence");
    L5:
        if (k(1) == true) goto L9;
        throw o0("Unterminated escape sequence");
    }

    public void beginArray() {
        int r02 = this.f176924h;
        if (r02 != 0) goto L6;
        r02 = i();
    L6:
        if (r02 != 3) goto L10;
        W(1);
        this.f176931o[this.f176929m - 1] = 0;
        this.f176924h = 0;
        return;
    L10:
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + n());
    }

    public void beginObject() {
        int r02 = this.f176924h;
        if (r02 != 0) goto L6;
        r02 = i();
    L6:
        if (r02 != 1) goto L10;
        W(3);
        this.f176924h = 0;
        return;
    L10:
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + n());
    }

    public final void c() {
        if (this.f176919b == false) goto L6;
        return;
    L6:
        throw o0("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    public final void c0(char r7) {
        char[] r02 = this.f176920c;
    L3:
        int r1 = this.d;
        int r2 = this.f176921e;
    L5:
        if (r1 >= r2) goto L17;
        int r4 = r1 + 1;
        char r12 = r02[r1];
        if (r12 == r7) goto L8;
        if (r12 == '\\') goto L12;
        if (r12 != '\n') goto L16;
        this.f176922f++;
        this.f176923g = r4;
    L16:
        r1 = r4;
        goto L5
    L12:
        this.d = r4;
        Z();
        r1 = this.d;
        r2 = this.f176921e;
        goto L5
    L8:
        this.d = r4;
        return;
    L17:
        this.d = r1;
        if (k(1) == true) goto L3;
        throw o0("Unterminated string");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f176924h = 0;
        this.f176928l[0] = 8;
        this.f176929m = 1;
        this.f176918a.close();
    }

    public final boolean d0(String r7) {
        int r02 = r7.length();
    L3:
        int r3 = 0;
        if ((this.d + r02) > this.f176921e) goto L6;
    L9:
        char[] r1 = this.f176920c;
        int r2 = this.d;
        if (r1[r2] != '\n') goto L12;
        this.f176922f++;
        this.f176923g = r2 + 1;
    L15:
        this.d++;
    L12:
        if (r3 >= r02) goto L17;
        if (this.f176920c[this.d + r3] != r7.charAt(r3)) goto L15;
        r3 = r3 + 1;
        goto L12
    L17:
        return true;
    L6:
        if (k(r02) == true) goto L9;
        return false;
    }

    public void endArray() {
        int r02 = this.f176924h;
        if (r02 != 0) goto L6;
        r02 = i();
    L6:
        if (r02 != 4) goto L10;
        int r03 = this.f176929m;
        this.f176929m = r03 - 1;
        int[] r1 = this.f176931o;
        int r04 = r03 - 2;
        r1[r04] = r1[r04] + 1;
        this.f176924h = 0;
        return;
    L10:
        throw new IllegalStateException("Expected END_ARRAY but was " + peek() + n());
    }

    public void endObject() {
        int r02 = this.f176924h;
        if (r02 != 0) goto L6;
        r02 = i();
    L6:
        if (r02 != 2) goto L10;
        int r03 = this.f176929m;
        int r2 = r03 - 1;
        this.f176929m = r2;
        this.f176930n[r2] = null;
        int[] r22 = this.f176931o;
        int r04 = r03 - 2;
        r22[r04] = r22[r04] + 1;
        this.f176924h = 0;
        return;
    L10:
        throw new IllegalStateException("Expected END_OBJECT but was " + peek() + n());
    }

    public final void f() {
        u(true);
        int r02 = this.d;
        int r1 = r02 - 1;
        this.d = r1;
        if ((r02 + 4) > this.f176921e) goto L5;
    L7:
        char[] r2 = this.f176920c;
        if (r2[r1] == ')') goto L10;
        return;
    L10:
        if (r2[r02] == ']') goto L12;
        return;
    L12:
        if (r2[r02 + 1] == '}') goto L14;
        return;
    L14:
        if (r2[r02 + 2] == '\'') goto L16;
        return;
    L16:
        if (r2[r02 + 3] != '\n') goto L25;
        this.d += 5;
        return;
    L25:
        return;
    L5:
        if (k(5) == true) goto L7;
    }

    public final void f0() {
    L3:
        if (this.d >= this.f176921e) goto L5;
    L6:
        char[] r02 = this.f176920c;
        int r1 = this.d;
        int r3 = r1 + 1;
        this.d = r3;
        char r03 = r02[r1];
        if (r03 == '\n') goto L8;
        if (r03 != '\r') goto L3;
        return;
    L8:
        this.f176922f++;
        this.f176923g = r3;
        return;
    L5:
        if (k(1) == true) goto L6;
    }

    public final void g0() {
    L2:
        int r02 = 0;
    L3:
        int r1 = this.d;
        if ((r1 + r02) >= this.f176921e) goto L36;
        char r12 = this.f176920c[r1 + r02];
        if (r12 == '\t') goto L34;
        if (r12 == '\n') goto L34;
        if (r12 == '\f') goto L34;
        if (r12 == '\r') goto L34;
        if (r12 == ' ') goto L34;
        if (r12 == '#') goto L33;
        if (r12 == ',') goto L34;
        if (r12 == '/') goto L33;
        if (r12 == '=') goto L33;
        if (r12 == '{') goto L34;
        if (r12 == '}') goto L34;
        if (r12 == ':') goto L34;
        if (r12 == ';') goto L33;
        switch(r12) {
            case 91: goto L34;
            case 92: goto L33;
            case 93: goto L34;
            default: goto L32;
        };
    L32:
        r02 = r02 + 1;
    L33:
        c();
    L34:
        this.d += r02;
        return;
    L36:
        this.d = r1 + r02;
        if (k(1) == true) goto L2;
    }

    public String getPath() {
        StringBuilder r02 = new StringBuilder();
        r02.append('$');
        int r1 = this.f176929m;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L21;
        int r3 = this.f176928l[r2];
        if (r3 != 1) goto L7;
    L18:
        r02.append('[');
        r02.append(this.f176931o[r2]);
        r02.append(']');
    L19:
        r2 = r2 + 1;
        goto L3
    L7:
        if (r3 == 2) goto L18;
        if (r3 != 3) goto L11;
    L15:
        r02.append('.');
        String r32 = this.f176930n[r2];
        if (r32 == null) goto L19;
        r02.append(r32);
        goto L19
    L11:
        if (r3 == 4) goto L15;
        if (r3 == 5) goto L15;
    L21:
        return r02.toString();
    }

    public boolean hasNext() {
        int r02 = this.f176924h;
        if (r02 != 0) goto L6;
        r02 = i();
    L6:
        if (r02 != 2) goto L8;
        return false;
    L8:
        if (r02 == 4) goto L13;
        return true;
    L13:
        return false;
    }

    public int i() {
        int[] r02 = this.f176928l;
        int r1 = this.f176929m;
        int r2 = r02[r1 - 1];
        if (r2 != 1) goto L5;
        r02[r1 - 1] = 2;
    L46:
        int r03 = u(true);
        if (r03 == 34) goto L84;
        if (r03 == 39) goto L82;
        if (r03 == 44) goto L75;
        if (r03 == 59) goto L75;
        if (r03 == 91) goto L73;
        if (r03 != 93) goto L55;
        if (r2 != 1) goto L75;
        this.f176924h = 4;
        return 4;
    L55:
        if (r03 == 123) goto L68;
        this.d--;
        int r04 = M();
        if (r04 == 0) goto L59;
        return r04;
    L59:
        int r05 = O();
        if (r05 == 0) goto L63;
        return r05;
    L63:
        if (l(this.f176920c[this.d]) == false) goto L67;
        c();
        this.f176924h = 10;
        return 10;
    L67:
        throw o0("Expected value");
    L68:
        this.f176924h = 1;
        return 1;
    L73:
        this.f176924h = 3;
        return 3;
    L75:
        if (r2 == 1) goto L80;
        if (r2 == 2) goto L80;
        throw o0("Unexpected value");
    L80:
        c();
        this.d--;
        this.f176924h = 7;
        return 7;
    L82:
        c();
        this.f176924h = 8;
        return 8;
    L84:
        this.f176924h = 9;
        return 9;
    L5:
        if (r2 != 2) goto L16;
        int r06 = u(true);
        if (r06 == 44) goto L46;
        if (r06 == 59) goto L14;
        if (r06 != 93) goto L13;
        this.f176924h = 4;
        return 4;
    L13:
        throw o0("Unterminated array");
    L14:
        c();
        goto L46
    L16:
        if (r2 == 3) goto L88;
        if (r2 == 5) goto L88;
        if (r2 != 4) goto L34;
        r02[r1 - 1] = 5;
        int r07 = u(true);
        if (r07 == 58) goto L46;
        if (r07 != 61) goto L32;
        c();
        if (this.d >= this.f176921e) goto L27;
    L28:
        char[] r08 = this.f176920c;
        int r12 = this.d;
        if (r08[r12] != '>') goto L46;
        this.d = r12 + 1;
        goto L46
    L27:
        if (k(1) == false) goto L46;
    L32:
        throw o0("Expected ':'");
    L34:
        if (r2 == 6) goto L36;
        if (r2 == 7) goto L41;
        if (r2 != 8) goto L46;
        throw new IllegalStateException("JsonReader is closed");
    L41:
        if (u(false) != (-1)) goto L44;
        this.f176924h = 17;
        return 17;
    L44:
        c();
        this.d--;
        goto L46
    L36:
        if (this.f176919b == false) goto L38;
        f();
    L38:
        this.f176928l[this.f176929m - 1] = 7;
    L88:
        r02[r1 - 1] = 4;
        if (r2 != 5) goto L99;
        int r13 = u(true);
        if (r13 == 44) goto L99;
        if (r13 == 59) goto L98;
        if (r13 != 125) goto L97;
        this.f176924h = 2;
        return 2;
    L97:
        throw o0("Unterminated object");
    L98:
        c();
    L99:
        int r14 = u(true);
        if (r14 == 34) goto L117;
        if (r14 != 39) goto L103;
        c();
        this.f176924h = 12;
        return 12;
    L103:
        if (r14 == 125) goto L110;
        c();
        this.d--;
        if (l((char) r14) == false) goto L109;
        this.f176924h = 14;
        return 14;
    L109:
        throw o0("Expected name");
    L110:
        if (r2 == 5) goto L114;
        this.f176924h = 2;
        return 2;
    L114:
        throw o0("Expected name");
    L117:
        this.f176924h = 13;
        return 13;
    }

    public final boolean k(int r8) {
        char[] r02 = this.f176920c;
        int r1 = this.f176923g;
        int r2 = this.d;
        this.f176923g = r1 - r2;
        int r12 = this.f176921e;
        if (r12 == r2) goto L5;
        int r13 = r12 - r2;
        this.f176921e = r13;
        System.arraycopy(r02, r2, r02, 0, r13);
    L6:
        this.d = 0;
    L7:
        Reader r14 = this.f176918a;
        int r22 = this.f176921e;
        int r15 = r14.read(r02, r22, r02.length - r22);
        if (r15 == (-1)) goto L19;
        int r23 = this.f176921e + r15;
        this.f176921e = r23;
        if (this.f176922f != 0) goto L17;
        int r16 = this.f176923g;
        if (r16 != 0) goto L17;
        if (r23 <= 0) goto L17;
        if (r02[0] != 65279) goto L17;
        this.d++;
        this.f176923g = r16 + 1;
        r8 = r8 + 1;
    L17:
        if (r23 < r8) goto L7;
        return true;
    L19:
        return false;
    L5:
        this.f176921e = 0;
        goto L6
    }

    public final boolean l(char r2) {
        if (r2 != '\t') goto L5;
        return false;
    L5:
        if (r2 != '\n') goto L7;
        return false;
    L7:
        if (r2 != '\f') goto L9;
        return false;
    L9:
        if (r2 != '\r') goto L11;
        return false;
    L11:
        if (r2 != ' ') goto L13;
        return false;
    L13:
        if (r2 != '#') goto L15;
    L31:
        c();
        return false;
    L15:
        if (r2 != ',') goto L17;
        return false;
    L17:
        if (r2 == '/') goto L31;
        if (r2 == '=') goto L31;
        if (r2 != '{') goto L23;
        return false;
    L23:
        if (r2 != '}') goto L25;
        return false;
    L25:
        if (r2 != ':') goto L27;
        return false;
    L27:
        if (r2 == ';') goto L31;
        switch(r2) {
            case 91: goto L43;
            case 92: goto L31;
            case 93: goto L43;
            default: goto L29;
        };
    L29:
        return true;
    L43:
        return false;
    }

    public String n() {
        return " at line " + (this.f176922f + 1) + " column " + ((this.d - this.f176923g) + 1) + " path " + getPath();
    }

    public double nextDouble() {
        int r02 = this.f176924h;
        if (r02 != 0) goto L6;
        r02 = i();
    L6:
        if (r02 != 15) goto L10;
        this.f176924h = 0;
        int[] r03 = this.f176931o;
        int r1 = this.f176929m - 1;
        r03[r1] = r03[r1] + 1;
        return this.f176925i;
    L10:
        if (r02 != 16) goto L13;
        this.f176927k = new String(this.f176920c, this.d, this.f176926j);
        this.d += this.f176926j;
    L28:
        this.f176924h = 11;
        double r04 = Double.parseDouble(this.f176927k);
        if (this.f176919b == false) goto L31;
    L37:
        this.f176927k = null;
        this.f176924h = 0;
        int[] r2 = this.f176931o;
        int r3 = this.f176929m - 1;
        r2[r3] = r2[r3] + 1;
        return r04;
    L31:
        if (Double.isNaN(r04) == true) goto L36;
        if (Double.isInfinite(r04) == false) goto L37;
    L36:
        throw new MalformedJsonException("JSON forbids NaN and infinities: " + r04 + n());
    L13:
        if (r02 != 8) goto L15;
    L24:
        if (r02 != 8) goto L26;
        char r05 = '\'';
    L27:
        this.f176927k = B(r05);
        goto L28
    L26:
        r05 = '\"';
        goto L27
    L15:
        if (r02 == 9) goto L24;
        if (r02 != 10) goto L20;
        this.f176927k = E();
        goto L28
    L20:
        if (r02 == 11) goto L28;
        throw new IllegalStateException("Expected a double but was " + peek() + n());
    }

    public int nextInt() {
        int r02 = this.f176924h;
        if (r02 != 0) goto L6;
        r02 = i();
    L6:
        if (r02 != 15) goto L14;
        long r03 = this.f176925i;
        int r4 = (int) r03;
        if (r03 != r4) goto L12;
        this.f176924h = 0;
        int[] r04 = this.f176931o;
        int r1 = this.f176929m - 1;
        r04[r1] = r04[r1] + 1;
        return r4;
    L12:
        throw new NumberFormatException("Expected an int but was " + this.f176925i + n());
    L14:
        if (r02 != 16) goto L17;
        this.f176927k = new String(this.f176920c, this.d, this.f176926j);
        this.d += this.f176926j;
    L32:
        this.f176924h = 11;
        double r05 = Double.parseDouble(this.f176927k);
        int r42 = (int) r05;
        if (r42 != r05) goto L37;
        this.f176927k = null;
        this.f176924h = 0;
        int[] r06 = this.f176931o;
        int r12 = this.f176929m - 1;
        r06[r12] = r06[r12] + 1;
        return r42;
    L37:
        throw new NumberFormatException("Expected an int but was " + this.f176927k + n());
    L17:
        if (r02 != 8) goto L19;
    L24:
        if (r02 != 10) goto L26;
        this.f176927k = E();
    L39:
        int r07 = Integer.parseInt(this.f176927k);     // Catch: NumberFormatException -> L38
        this.f176924h = 0;     // Catch: NumberFormatException -> L38
        int[] r13 = this.f176931o;     // Catch: NumberFormatException -> L38
        int r43 = this.f176929m - 1;
        r13[r43] = r13[r43] + 1;     // Catch: NumberFormatException -> L38
        return r07;
    L26:
        if (r02 != 8) goto L28;
        char r08 = '\'';
    L29:
        this.f176927k = B(r08);
        goto L39
    L28:
        r08 = '\"';
        goto L29
    L19:
        if (r02 == 9) goto L24;
        if (r02 == 10) goto L24;
        throw new IllegalStateException("Expected an int but was " + peek() + n());
    }

    public long nextLong() {
        int r02 = this.f176924h;
        if (r02 != 0) goto L6;
        r02 = i();
    L6:
        if (r02 != 15) goto L10;
        this.f176924h = 0;
        int[] r03 = this.f176931o;
        int r1 = this.f176929m - 1;
        r03[r1] = r03[r1] + 1;
        return this.f176925i;
    L10:
        if (r02 != 16) goto L13;
        this.f176927k = new String(this.f176920c, this.d, this.f176926j);
        this.d += this.f176926j;
    L28:
        this.f176924h = 11;
        double r04 = Double.parseDouble(this.f176927k);
        long r4 = (long) r04;
        if (r4 != r04) goto L33;
        this.f176927k = null;
        this.f176924h = 0;
        int[] r05 = this.f176931o;
        int r12 = this.f176929m - 1;
        r05[r12] = r05[r12] + 1;
        return r4;
    L33:
        throw new NumberFormatException("Expected a long but was " + this.f176927k + n());
    L13:
        if (r02 != 8) goto L15;
    L20:
        if (r02 != 10) goto L22;
        this.f176927k = E();
    L35:
        long r06 = Long.parseLong(this.f176927k);     // Catch: NumberFormatException -> L34
        this.f176924h = 0;     // Catch: NumberFormatException -> L34
        int[] r42 = this.f176931o;     // Catch: NumberFormatException -> L34
        int r5 = this.f176929m - 1;
        r42[r5] = r42[r5] + 1;     // Catch: NumberFormatException -> L34
        return r06;
    L22:
        if (r02 != 8) goto L24;
        char r07 = '\'';
    L25:
        this.f176927k = B(r07);
        goto L35
    L24:
        r07 = '\"';
        goto L25
    L15:
        if (r02 == 9) goto L20;
        if (r02 == 10) goto L20;
        throw new IllegalStateException("Expected a long but was " + peek() + n());
    }

    public String nextName() {
        int r02 = this.f176924h;
        if (r02 != 0) goto L6;
        r02 = i();
    L6:
        if (r02 != 14) goto L9;
        String r03 = E();
    L14:
        this.f176924h = 0;
        this.f176930n[this.f176929m - 1] = r03;
        return r03;
    L9:
        if (r02 != 12) goto L12;
        r03 = B('\'');
        goto L14
    L12:
        if (r02 != 13) goto L17;
        r03 = B('\"');
        goto L14
    L17:
        throw new IllegalStateException("Expected a name but was " + peek() + n());
    }

    public String nextString() {
        int r02 = this.f176924h;
        if (r02 != 0) goto L6;
        r02 = i();
    L6:
        if (r02 != 10) goto L9;
        String r03 = E();
    L23:
        this.f176924h = 0;
        int[] r1 = this.f176931o;
        int r2 = this.f176929m - 1;
        r1[r2] = r1[r2] + 1;
        return r03;
    L9:
        if (r02 != 8) goto L12;
        r03 = B('\'');
        goto L23
    L12:
        if (r02 != 9) goto L15;
        r03 = B('\"');
        goto L23
    L15:
        if (r02 != 11) goto L18;
        r03 = this.f176927k;
        this.f176927k = null;
        goto L23
    L18:
        if (r02 != 15) goto L21;
        r03 = Long.toString(this.f176925i);
        goto L23
    L21:
        if (r02 != 16) goto L26;
        r03 = new String(this.f176920c, this.d, this.f176926j);
        this.d += this.f176926j;
        goto L23
    L26:
        throw new IllegalStateException("Expected a string but was " + peek() + n());
    }

    public final IOException o0(String r3) {
        throw new MalformedJsonException(r3 + n());
    }

    public JsonToken peek() {
        int r02 = this.f176924h;
        if (r02 != 0) goto L5;
        r02 = i();
    L5:
        switch(r02) {
            case 1: goto L27;
            case 2: goto L25;
            case 3: goto L23;
            case 4: goto L21;
            case 5: goto L19;
            case 6: goto L19;
            case 7: goto L17;
            case 8: goto L15;
            case 9: goto L15;
            case 10: goto L15;
            case 11: goto L15;
            case 12: goto L13;
            case 13: goto L13;
            case 14: goto L13;
            case 15: goto L11;
            case 16: goto L11;
            case 17: goto L9;
            default: goto L7;
        };
    L7:
        throw new AssertionError();
    L9:
        return JsonToken.END_DOCUMENT;
    L11:
        return JsonToken.NUMBER;
    L13:
        return JsonToken.NAME;
    L15:
        return JsonToken.STRING;
    L17:
        return JsonToken.NULL;
    L19:
        return JsonToken.BOOLEAN;
    L21:
        return JsonToken.END_ARRAY;
    L23:
        return JsonToken.BEGIN_ARRAY;
    L25:
        return JsonToken.END_OBJECT;
    L27:
        return JsonToken.BEGIN_OBJECT;
    }

    public final void setLenient(boolean r1) {
        this.f176919b = r1;
    }

    public void skipValue() {
        int r1 = 0;
    L3:
        int r2 = this.f176924h;
        if (r2 != 0) goto L7;
        r2 = i();
    L7:
        if (r2 != 3) goto L10;
        W(1);
    L9:
        r1 = r1 + 1;
    L40:
        this.f176924h = 0;
        if (r1 != 0) goto L3;
        int[] r02 = this.f176931o;
        int r12 = this.f176929m;
        int r22 = r12 - 1;
        r02[r22] = r02[r22] + 1;
        this.f176930n[r12 - 1] = "null";
        return;
    L10:
        if (r2 != 1) goto L13;
        W(3);
        goto L9
    L13:
        if (r2 != 4) goto L17;
        this.f176929m--;
    L15:
        r1 = r1 - 1;
        goto L40
    L17:
        if (r2 != 2) goto L20;
        this.f176929m--;
        goto L15
    L20:
        if (r2 != 14) goto L22;
    L39:
        g0();
        goto L40
    L22:
        if (r2 == 10) goto L39;
        if (r2 != 8) goto L27;
    L38:
        c0('\'');
        goto L40
    L27:
        if (r2 == 12) goto L38;
        if (r2 != 9) goto L32;
    L37:
        c0('\"');
        goto L40
    L32:
        if (r2 == 13) goto L37;
        if (r2 != 16) goto L40;
        this.d += this.f176926j;
        goto L40
    }

    public boolean t() {
        int r02 = this.f176924h;
        if (r02 != 0) goto L6;
        r02 = i();
    L6:
        if (r02 != 5) goto L10;
        this.f176924h = 0;
        int[] r03 = this.f176931o;
        int r1 = this.f176929m - 1;
        r03[r1] = r03[r1] + 1;
        return true;
    L10:
        if (r02 != 6) goto L14;
        this.f176924h = 0;
        int[] r04 = this.f176931o;
        int r12 = this.f176929m - 1;
        r04[r12] = r04[r12] + 1;
        return false;
    L14:
        throw new IllegalStateException("Expected a boolean but was " + peek() + n());
    }

    public String toString() {
        return getClass().getSimpleName() + n();
    }

    public final int u(boolean r9) {
        char[] r02 = this.f176920c;
        int r1 = this.d;
        int r2 = this.f176921e;
    L4:
        if (r1 != r2) goto L13;
        this.d = r1;
        if (k(1) == false) goto L7;
        r1 = this.d;
        r2 = this.f176921e;
        goto L13
    L7:
        if (r9 == true) goto L11;
        return -1;
    L11:
        throw new EOFException("End of input" + n());
    L13:
        int r4 = r1 + 1;
        char r5 = r02[r1];
        if (r5 == '\n') goto L15;
        if (r5 == ' ') goto L45;
        if (r5 == '\r') goto L45;
        if (r5 == '\t') goto L45;
        if (r5 == '/') goto L25;
        if (r5 != '#') goto L43;
        this.d = r4;
        c();
        f0();
        r1 = this.d;
        r2 = this.f176921e;
        goto L4
    L43:
        this.d = r4;
        return r5;
    L25:
        this.d = r4;
        if (r4 != r2) goto L30;
        this.d = r1;
        boolean r12 = k(2);
        this.d++;
        if (r12 == true) goto L30;
    L33:
        return r5;
    L30:
        c();
        int r13 = this.d;
        char r22 = r02[r13];
        if (r22 != '*') goto L32;
        this.d = r13 + 1;
        if (d0("*/") == false) goto L39;
        r1 = this.d + 2;
        r2 = this.f176921e;
        goto L4
    L39:
        throw o0("Unterminated comment");
    L32:
        if (r22 != '/') goto L33;
        this.d = r13 + 1;
        f0();
        r1 = this.d;
        r2 = this.f176921e;
    L45:
        r1 = r4;
        goto L4
    L15:
        this.f176922f++;
        this.f176923g = r4;
        goto L45
    }

    public void x() {
        int r02 = this.f176924h;
        if (r02 != 0) goto L6;
        r02 = i();
    L6:
        if (r02 != 7) goto L10;
        this.f176924h = 0;
        int[] r03 = this.f176931o;
        int r1 = this.f176929m - 1;
        r03[r1] = r03[r1] + 1;
        return;
    L10:
        throw new IllegalStateException("Expected null but was " + peek() + n());
    }
}
