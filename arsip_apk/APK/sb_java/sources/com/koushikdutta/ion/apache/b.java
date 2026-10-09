package com.koushikdutta.ion.apache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f41721a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41722b;

    /* renamed from: c, reason: collision with root package name */
    public int f41723c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f41724e;

    /* renamed from: f, reason: collision with root package name */
    public int f41725f;

    /* renamed from: g, reason: collision with root package name */
    public char[] f41726g;

    public b(X500Principal r2) {
        String r22 = r2.getName("RFC2253");
        this.f41721a = r22;
        this.f41722b = r22.length();
    }

    public final String a() {
        int r02 = this.f41723c;
        this.d = r02;
        this.f41724e = r02;
    L3:
        int r03 = this.f41723c;
        if (r03 >= this.f41722b) goto L5;
        char[] r1 = this.f41726g;
        char r2 = r1[r03];
        if (r2 != ' ') goto L9;
        int r22 = this.f41724e;
        this.f41725f = r22;
        this.f41723c = r03 + 1;
        this.f41724e = r22 + 1;
        r1[r22] = ' ';
    L19:
        int r04 = this.f41723c;
        int r12 = this.f41722b;
        if (r04 >= r12) goto L24;
        char[] r23 = this.f41726g;
        if (r23[r04] != ' ') goto L24;
        int r13 = this.f41724e;
        this.f41724e = r13 + 1;
        r23[r13] = ' ';
        this.f41723c = r04 + 1;
    L24:
        if (r04 == r12) goto L29;
        char r05 = this.f41726g[r04];
        if (r05 == ',') goto L29;
        if (r05 == '+') goto L29;
        if (r05 != ';') goto L3;
    L29:
        char[] r14 = this.f41726g;
        int r24 = this.d;
        return new String(r14, r24, this.f41725f - r24);
    L9:
        if (r2 == ';') goto L16;
        if (r2 != '\\') goto L12;
        int r06 = this.f41724e;
        this.f41724e = r06 + 1;
        r1[r06] = d();
        this.f41723c++;
        goto L3
    L12:
        if (r2 == '+') goto L16;
        if (r2 == ',') goto L16;
        int r3 = this.f41724e;
        this.f41724e = r3 + 1;
        r1[r3] = r2;
        this.f41723c = r03 + 1;
    L16:
        int r25 = this.d;
        return new String(r1, r25, this.f41724e - r25);
    L5:
        char[] r15 = this.f41726g;
        int r26 = this.d;
        return new String(r15, r26, this.f41724e - r26);
    }

    public List b(String r8) {
        this.f41723c = 0;
        this.d = 0;
        this.f41724e = 0;
        this.f41725f = 0;
        this.f41726g = this.f41721a.toCharArray();
        List r02 = Collections.EMPTY_LIST;
        String r1 = g();
        if (r1 != null) goto L5;
        return r02;
    L5:
        int r2 = this.f41723c;
        if (r2 >= this.f41722b) goto L40;
        char r22 = this.f41726g[r2];
        if (r22 != '\"') goto L10;
        String r23 = h();
    L19:
        if (r8.equalsIgnoreCase(r1) == true) goto L21;
    L24:
        int r12 = this.f41723c;
        if (r12 >= this.f41722b) goto L26;
        char r24 = this.f41726g[r12];
        if (r24 == ',') goto L35;
        if (r24 == ';') goto L35;
        if (r24 == '+') goto L35;
        throw new IllegalStateException("Malformed DN: " + this.f41721a);
    L35:
        this.f41723c = r12 + 1;
        r1 = g();
        if (r1 != null) goto L5;
        throw new IllegalStateException("Malformed DN: " + this.f41721a);
    L26:
        return r02;
    L21:
        if (r02.isEmpty() == false) goto L23;
        r02 = new ArrayList();
    L23:
        r02.add(r23);
        goto L24
    L10:
        if (r22 == '#') goto L16;
        if (r22 == '+') goto L15;
        if (r22 == ',') goto L15;
        if (r22 == ';') goto L15;
        r23 = a();
    L15:
        r23 = "";
        goto L19
    L16:
        r23 = f();
        goto L19
    L40:
        return r02;
    }

    public final int c(int r10) {
        int r02 = r10 + 1;
        if (r02 >= this.f41722b) goto L31;
        char[] r1 = this.f41726g;
        char r102 = r1[r10];
        if (r102 < '0') goto L8;
        if (r102 > '9') goto L8;
        int r103 = r102 - '0';
    L14:
        char r03 = r1[r02];
        if (r03 < '0') goto L18;
        if (r03 > '9') goto L18;
        int r04 = r03 - '0';
    L25:
        return (r103 << 4) + r04;
    L18:
        if (r03 < 'a') goto L21;
        if (r03 > 'f') goto L21;
        r04 = r03 - 'W';
    L21:
        if (r03 < 'A') goto L27;
        if (r03 > 'F') goto L27;
        r04 = r03 - '7';
    L27:
        throw new IllegalStateException("Malformed DN: " + this.f41721a);
    L8:
        if (r102 < 'a') goto L11;
        if (r102 > 'f') goto L11;
        r103 = r102 - 'W';
    L11:
        if (r102 < 'A') goto L29;
        if (r102 > 'F') goto L29;
        r103 = r102 - '7';
    L29:
        throw new IllegalStateException("Malformed DN: " + this.f41721a);
    L31:
        throw new IllegalStateException("Malformed DN: " + this.f41721a);
    }

    public final char d() {
        int r02 = this.f41723c + 1;
        this.f41723c = r02;
        if (r02 == this.f41722b) goto L21;
        char r03 = this.f41726g[r02];
        if (r03 != ' ') goto L7;
        return r03;
    L7:
        if (r03 != '%') goto L9;
        return r03;
    L9:
        if (r03 != '\\') goto L11;
        return r03;
    L11:
        if (r03 != '_') goto L13;
        return r03;
    L13:
        if (r03 != '\"') goto L15;
        return r03;
    L15:
        if (r03 == '#') goto L27;
        switch(r03) {
            case 42: goto L28;
            case 43: goto L28;
            case 44: goto L28;
            default: goto L17;
        };
    L17:
        switch(r03) {
            case 59: goto L29;
            case 60: goto L29;
            case 61: goto L29;
            case 62: goto L29;
            default: goto L19;
        };
    L29:
        return r03;
    L19:
        return e();
    L28:
        return r03;
    L27:
        return r03;
    L21:
        throw new IllegalStateException("Unexpected end of DN: " + this.f41721a);
    }

    public final char e() {
        int r02 = c(this.f41723c);
        this.f41723c++;
        if (r02 >= 128) goto L7;
        return (char) r02;
    L7:
        if (r02 >= 192) goto L9;
    L31:
        return '?';
    L9:
        if (r02 > 247) goto L31;
        if (r02 > 223) goto L14;
        int r03 = r02 & 31;
        int r3 = 1;
    L17:
        int r5 = 0;
    L18:
        if (r5 >= r3) goto L30;
        int r6 = this.f41723c;
        int r7 = r6 + 1;
        this.f41723c = r7;
        if (r7 == this.f41722b) goto L28;
        if (this.f41726g[r7] != '\\') goto L28;
        int r62 = r6 + 2;
        this.f41723c = r62;
        int r63 = c(r62);
        this.f41723c++;
        if ((r63 & 192) != 128) goto L26;
        r03 = (r03 << 6) + (r63 & 63);
        r5 = r5 + 1;
        goto L18
    L26:
        return '?';
    L28:
        return '?';
    L30:
        return (char) r03;
    L14:
        if (r02 > 239) goto L16;
        r03 = r02 & 15;
        r3 = 2;
        goto L17
    L16:
        r03 = r02 & 7;
        r3 = 3;
        goto L17
    }

    public final String f() {
        int r02 = this.f41723c;
        if ((r02 + 4) >= this.f41722b) goto L41;
        this.d = r02;
        this.f41723c = r02 + 1;
    L5:
        int r03 = this.f41723c;
        if (r03 == this.f41722b) goto L28;
        char[] r1 = this.f41726g;
        char r2 = r1[r03];
        if (r2 == '+') goto L28;
        if (r2 == ',') goto L28;
        if (r2 == ';') goto L28;
        if (r2 == ' ') goto L16;
        if (r2 < 'A') goto L27;
        if (r2 > 'F') goto L27;
        r1[r03] = (char) (r2 + ' ');
    L27:
        this.f41723c = r03 + 1;
        goto L5
    L16:
        this.f41724e = r03;
        this.f41723c = r03 + 1;
    L17:
        int r04 = this.f41723c;
        if (r04 >= this.f41722b) goto L29;
        if (this.f41726g[r04] != ' ') goto L29;
        this.f41723c = r04 + 1;
    L29:
        int r05 = this.f41724e;
        int r12 = this.d;
        int r06 = r05 - r12;
        if (r06 < 5) goto L39;
        if ((r06 & 1) == 0) goto L39;
        int r22 = r06 / 2;
        byte[] r3 = new byte[r22];
        int r13 = r12 + 1;
        int r4 = 0;
    L34:
        if (r4 >= r22) goto L37;
        r3[r4] = (byte) c(r13);
        r13 = r13 + 2;
        r4 = r4 + 1;
        goto L34
    L37:
        return new String(this.f41726g, this.d, r06);
    L39:
        throw new IllegalStateException("Unexpected end of DN: " + this.f41721a);
    L28:
        this.f41724e = r03;
        goto L29
    L41:
        throw new IllegalStateException("Unexpected end of DN: " + this.f41721a);
    }

    public final String g() {
    L2:
        int r02 = this.f41723c;
        int r1 = this.f41722b;
        if (r02 >= r1) goto L7;
        if (this.f41726g[r02] != ' ') goto L7;
        this.f41723c = r02 + 1;
    L7:
        if (r02 != r1) goto L10;
        return null;
    L10:
        this.d = r02;
        this.f41723c = r02 + 1;
    L11:
        int r03 = this.f41723c;
        int r12 = this.f41722b;
        if (r03 >= r12) goto L18;
        char r4 = this.f41726g[r03];
        if (r4 == '=') goto L18;
        if (r4 == ' ') goto L18;
        this.f41723c = r03 + 1;
    L18:
        if (r03 >= r12) goto L59;
        this.f41724e = r03;
        if (this.f41726g[r03] != ' ') goto L33;
    L21:
        int r04 = this.f41723c;
        int r13 = this.f41722b;
        if (r04 >= r13) goto L28;
        char r5 = this.f41726g[r04];
        if (r5 == '=') goto L28;
        if (r5 != ' ') goto L28;
        this.f41723c = r04 + 1;
    L28:
        if (this.f41726g[r04] != '=') goto L32;
        if (r04 != r13) goto L33;
    L32:
        throw new IllegalStateException("Unexpected end of DN: " + this.f41721a);
    L33:
        this.f41723c++;
    L34:
        int r05 = this.f41723c;
        if (r05 >= this.f41722b) goto L39;
        if (this.f41726g[r05] != ' ') goto L39;
        this.f41723c = r05 + 1;
    L39:
        int r06 = this.f41724e;
        int r14 = this.d;
        if ((r06 - r14) <= 4) goto L56;
        char[] r2 = this.f41726g;
        if (r2[r14 + 3] != '.') goto L56;
        char r42 = r2[r14];
        if (r42 == 'O') goto L48;
        if (r42 != 'o') goto L56;
    L48:
        if (r2[r14 + 1] == 'I') goto L52;
        if (r2[r14 + 1] != 'i') goto L56;
    L52:
        if (r2[r14 + 2] != 'D') goto L54;
    L55:
        this.d = r14 + 4;
        goto L56
    L54:
        if (r2[r14 + 2] == 'd') goto L55;
    L56:
        char[] r22 = this.f41726g;
        int r3 = this.d;
        return new String(r22, r3, r06 - r3);
    L59:
        throw new IllegalStateException("Unexpected end of DN: " + this.f41721a);
    }

    public final String h() {
        int r02 = this.f41723c + 1;
        this.f41723c = r02;
        this.d = r02;
        this.f41724e = r02;
    L3:
        int r03 = this.f41723c;
        if (r03 == this.f41722b) goto L21;
        char[] r1 = this.f41726g;
        char r2 = r1[r03];
        if (r2 == '\"') goto L7;
        if (r2 != '\\') goto L18;
        r1[this.f41724e] = d();
    L19:
        this.f41723c++;
        this.f41724e++;
        goto L3
    L18:
        r1[this.f41724e] = r2;
        goto L19
    L7:
        this.f41723c = r03 + 1;
    L8:
        int r04 = this.f41723c;
        if (r04 >= this.f41722b) goto L13;
        if (this.f41726g[r04] != ' ') goto L13;
        this.f41723c = r04 + 1;
    L13:
        char[] r12 = this.f41726g;
        int r22 = this.d;
        return new String(r12, r22, this.f41724e - r22);
    L21:
        throw new IllegalStateException("Unexpected end of DN: " + this.f41721a);
    }
}
