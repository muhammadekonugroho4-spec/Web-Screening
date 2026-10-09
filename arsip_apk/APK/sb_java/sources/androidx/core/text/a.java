package androidx.core.text;

import android.text.SpannableStringBuilder;
import com.google.common.base.Ascii;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {
    public static final m d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final String f23045e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final String f23046f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final a f23047g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final a f23048h = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23049a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23050b;

    /* renamed from: c, reason: collision with root package name */
    public final m f23051c;

    /* renamed from: androidx.core.text.a$a, reason: collision with other inner class name */
    public static final class C0169a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f23052a;

        /* renamed from: b, reason: collision with root package name */
        public int f23053b;

        /* renamed from: c, reason: collision with root package name */
        public m f23054c;

        public C0169a() {
            c(a.e(Locale.getDefault()));
        }

        public static a b(boolean r02) {
            if (r02 == false) goto L6;
            return a.f23048h;
        L6:
            return a.f23047g;
        }

        public a a() {
            if (this.f23053b != 2) goto L9;
            if (this.f23054c != a.d) goto L9;
            return b(this.f23052a);
        L9:
            return new a(this.f23052a, this.f23053b, this.f23054c);
        }

        public final void c(boolean r1) {
            this.f23052a = r1;
            this.f23054c = a.d;
            this.f23053b = 2;
        }
    }

    public static class b {

        /* renamed from: f, reason: collision with root package name */
        public static final byte[] f23055f = null;

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f23056a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f23057b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23058c;
        public int d;

        /* renamed from: e, reason: collision with root package name */
        public char f23059e;

        static {
            f23055f = new byte[1792];
            int r1 = 0;
        L3:
            if (r1 >= 1792) goto L5;
            f23055f[r1] = Character.getDirectionality(r1);
            r1 = r1 + 1;
            goto L3
        }

        public b(CharSequence r1, boolean r2) {
            this.f23056a = r1;
            this.f23057b = r2;
            this.f23058c = r1.length();
        }

        public static byte c(char r1) {
            if (r1 >= 1792) goto L7;
            return f23055f[r1];
        L7:
            return Character.getDirectionality(r1);
        }

        public byte a() {
            char r02 = this.f23056a.charAt(this.d - 1);
            this.f23059e = r02;
            if (Character.isLowSurrogate(r02) == false) goto L6;
            int r03 = Character.codePointBefore(this.f23056a, this.d);
            this.d -= Character.charCount(r03);
            return Character.getDirectionality(r03);
        L6:
            this.d--;
            byte r04 = c(this.f23059e);
            if (this.f23057b == false) goto L16;
            char r1 = this.f23059e;
            if (r1 != '>') goto L13;
            return h();
        L13:
            if (r1 == ';') goto L15;
            return r04;
        L15:
            return f();
        L16:
            return r04;
        }

        public byte b() {
            char r02 = this.f23056a.charAt(this.d);
            this.f23059e = r02;
            if (Character.isHighSurrogate(r02) == false) goto L6;
            int r03 = Character.codePointAt(this.f23056a, this.d);
            this.d += Character.charCount(r03);
            return Character.getDirectionality(r03);
        L6:
            this.d++;
            byte r04 = c(this.f23059e);
            if (this.f23057b == false) goto L16;
            char r1 = this.f23059e;
            if (r1 != '<') goto L13;
            return i();
        L13:
            if (r1 == '&') goto L15;
            return r04;
        L15:
            return g();
        L16:
            return r04;
        }

        public int d() {
            this.d = 0;
            int r1 = 0;
            int r2 = 0;
            int r3 = 0;
        L4:
            if (this.d >= this.f23058c) goto L23;
            if (r1 != 0) goto L23;
            byte r4 = b();
            if (r4 == 0) goto L20;
            if (r4 == 1) goto L18;
            if (r4 == 2) goto L18;
            if (r4 == 9) goto L4;
            switch(r4) {
                case 14: goto L17;
                case 15: goto L17;
                case 16: goto L16;
                case 17: goto L16;
                case 18: goto L15;
                default: goto L22;
            };
        L16:
            r3 = r3 + 1;
            r2 = 1;
            goto L4
        L17:
            r3 = r3 + 1;
            r2 = -1;
        L22:
            r1 = r3;
            goto L4
        L15:
            r3 = r3 - 1;
            r2 = 0;
        L18:
            if (r3 != 0) goto L22;
            return 1;
        L20:
            if (r3 != 0) goto L22;
            return -1;
        L23:
            if (r1 != 0) goto L25;
            return 0;
        L25:
            if (r2 == 0) goto L28;
            return r2;
        L28:
            if (this.d <= 0) goto L38;
            switch(a()) {
                case 14: goto L36;
                case 15: goto L36;
                case 16: goto L33;
                case 17: goto L33;
                case 18: goto L32;
                default: goto L28;
            };
        L32:
            r3 = r3 + 1;
            goto L28
        L33:
            if (r1 == r3) goto L34;
        L35:
            r3 = r3 - 1;
            goto L28
        L34:
            return 1;
        L36:
            if (r1 != r3) goto L35;
            return -1;
        L38:
            return 0;
        }

        public int e() {
            this.d = this.f23058c;
            int r1 = 0;
        L3:
            int r2 = r1;
        L5:
            if (this.d <= 0) goto L31;
            byte r3 = a();
            if (r3 != 0) goto L9;
            if (r1 == 0) goto L28;
            if (r2 != 0) goto L5;
        L28:
            return -1;
        L9:
            if (r3 == 1) goto L23;
            if (r3 == 2) goto L23;
            if (r3 == 9) goto L5;
            switch(r3) {
                case 14: goto L21;
                case 15: goto L21;
                case 16: goto L18;
                case 17: goto L18;
                case 18: goto L17;
                default: goto L15;
            };
        L17:
            r1 = r1 + 1;
            goto L5
        L18:
            if (r2 == r1) goto L19;
        L20:
            r1 = r1 - 1;
            goto L5
        L19:
            return 1;
        L21:
            if (r2 != r1) goto L20;
            return -1;
        L15:
            if (r2 != 0) goto L5;
        L23:
            if (r1 == 0) goto L24;
            if (r2 != 0) goto L5;
        L24:
            return 1;
        L31:
            return 0;
        }

        public final byte f() {
            int r02 = this.d;
        L3:
            int r1 = this.d;
            if (r1 <= 0) goto L10;
            CharSequence r3 = this.f23056a;
            int r12 = r1 - 1;
            this.d = r12;
            char r13 = r3.charAt(r12);
            this.f23059e = r13;
            if (r13 == '&') goto L7;
            if (r13 != ';') goto L3;
        L7:
            return Ascii.FF;
        L10:
            this.d = r02;
            this.f23059e = ';';
            return Ascii.CR;
        }

        public final byte g() {
        L2:
            int r02 = this.d;
            if (r02 >= this.f23058c) goto L7;
            CharSequence r1 = this.f23056a;
            this.d = r02 + 1;
            char r03 = r1.charAt(r02);
            this.f23059e = r03;
            if (r03 != ';') goto L2;
            return Ascii.FF;
        L7:
            return Ascii.FF;
        }

        public final byte h() {
            int r02 = this.d;
        L3:
            int r1 = this.d;
            if (r1 <= 0) goto L20;
            CharSequence r3 = this.f23056a;
            int r12 = r1 - 1;
            this.d = r12;
            char r13 = r3.charAt(r12);
            this.f23059e = r13;
            if (r13 == '<') goto L7;
            if (r13 == '>') goto L20;
            if (r13 == '\"') goto L15;
            if (r13 != '\'') goto L3;
        L15:
            int r2 = this.d;
            if (r2 <= 0) goto L3;
            CharSequence r32 = this.f23056a;
            int r22 = r2 - 1;
            this.d = r22;
            char r23 = r32.charAt(r22);
            this.f23059e = r23;
            if (r23 == r13) goto L3;
        L7:
            return Ascii.FF;
        L20:
            this.d = r02;
            this.f23059e = '>';
            return Ascii.CR;
        }

        public final byte i() {
            int r02 = this.d;
        L3:
            int r1 = this.d;
            if (r1 >= this.f23058c) goto L18;
            CharSequence r2 = this.f23056a;
            this.d = r1 + 1;
            char r12 = r2.charAt(r1);
            this.f23059e = r12;
            if (r12 == '>') goto L7;
            if (r12 == '\"') goto L13;
            if (r12 != '\'') goto L3;
        L13:
            int r22 = this.d;
            if (r22 >= this.f23058c) goto L3;
            CharSequence r3 = this.f23056a;
            this.d = r22 + 1;
            char r23 = r3.charAt(r22);
            this.f23059e = r23;
            if (r23 == r12) goto L3;
        L7:
            return Ascii.FF;
        L18:
            this.d = r02;
            this.f23059e = '<';
            return Ascii.CR;
        }
    }

    static {
        m r02 = n.f23069c;
        d = r02;
        f23045e = Character.toString(8206);
        f23046f = Character.toString(8207);
        f23047g = new a(false, 2, r02);
        f23048h = new a(true, 2, r02);
    }

    public a(boolean r1, int r2, m r3) {
        this.f23049a = r1;
        this.f23050b = r2;
        this.f23051c = r3;
    }

    public static int a(CharSequence r2) {
        return new b(r2, false).d();
    }

    public static int b(CharSequence r2) {
        return new b(r2, false).e();
    }

    public static a c() {
        return new C0169a().a();
    }

    public static boolean e(Locale r1) {
        if (o.a(r1) != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean d() {
        if ((this.f23050b & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final String f(CharSequence r3, m r4) {
        boolean r42 = r4.a(r3, 0, r3.length());
        if (this.f23049a == true) goto L10;
        if (r42 == true) goto L8;
        if (b(r3) != 1) goto L10;
    L8:
        return f23045e;
    L10:
        if (this.f23049a == false) goto L16;
        if (r42 == false) goto L15;
        if (b(r3) == (-1)) goto L15;
        return "";
    L15:
        return f23046f;
    L16:
        return "";
    }

    public final String g(CharSequence r3, m r4) {
        boolean r42 = r4.a(r3, 0, r3.length());
        if (this.f23049a == true) goto L10;
        if (r42 == true) goto L8;
        if (a(r3) != 1) goto L10;
    L8:
        return f23045e;
    L10:
        if (this.f23049a == false) goto L16;
        if (r42 == false) goto L15;
        if (a(r3) == (-1)) goto L15;
        return "";
    L15:
        return f23046f;
    L16:
        return "";
    }

    public CharSequence h(CharSequence r3) {
        return i(r3, this.f23051c, true);
    }

    public CharSequence i(CharSequence r3, m r4, boolean r5) {
        if (r3 != null) goto L5;
        return null;
    L5:
        boolean r42 = r4.a(r3, 0, r3.length());
        SpannableStringBuilder r02 = new SpannableStringBuilder();
        if (d() == false) goto L13;
        if (r5 == false) goto L13;
        if (r42 == false) goto L10;
        m r1 = n.f23068b;
    L11:
        r02.append(g(r3, r1));
        goto L13
    L10:
        r1 = n.f23067a;
    L13:
        if (r42 == this.f23049a) goto L18;
        if (r42 == false) goto L16;
        char r12 = 8235;
    L17:
        r02.append(r12);
        r02.append(r3);
        r02.append(8236);
    L19:
        if (r5 == false) goto L24;
        if (r42 == false) goto L22;
        m r43 = n.f23068b;
    L23:
        r02.append(f(r3, r43));
        goto L24
    L22:
        r43 = n.f23067a;
    L24:
        return r02;
    L16:
        r12 = 8234;
        goto L17
    L18:
        r02.append(r3);
        goto L19
    }

    public String j(String r3) {
        return k(r3, this.f23051c, true);
    }

    public String k(String r1, m r2, boolean r3) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return i(r1, r2, r3).toString();
    }
}
