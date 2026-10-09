package kotlin.time;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.common.ExceptionCode;
import com.stockbit.protobuf.securities.transactional.datafeed.v1.datafeed.ErrorCode;
import kotlin.time.q;

/* loaded from: classes3.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f180418a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f180419b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f180420c = null;
    public static final int[] d = null;

    static {
        f180418a = new int[]{1, 10, 100, 1000, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, 100000, 1000000, ExceptionCode.CRASH_EXCEPTION, 100000000, 1000000000};
        f180419b = new int[]{1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
        f180420c = new int[]{3, 6};
        d = new int[]{1, 2, 4, 5, 7, 8};
    }

    public static /* synthetic */ boolean a(char r02) {
        return t(r02);
    }

    public static /* synthetic */ boolean b(char r02) {
        return p(r02);
    }

    public static /* synthetic */ boolean c(char r02) {
        return s(r02);
    }

    public static /* synthetic */ boolean d(char r02) {
        return q(r02);
    }

    public static /* synthetic */ boolean e(char r02) {
        return r(r02);
    }

    public static /* synthetic */ boolean f(char r02) {
        return u(r02);
    }

    public static final /* synthetic */ String g(Instant r02) {
        return j(r02);
    }

    public static final /* synthetic */ q h(CharSequence r02) {
        return n(r02);
    }

    public static final /* synthetic */ String i(CharSequence r02, int r1) {
        return x(r02, r1);
    }

    public static final String j(Instant r7) {
        StringBuilder r02 = new StringBuilder();
        w r72 = w.f180435h.a(r7);
        int r1 = r72.g();
        int r4 = 0;
        if (Math.abs(r1) >= 1000) goto L9;
        StringBuilder r2 = new StringBuilder();
        if (r1 < 0) goto L7;
        r2.append(r1 + HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        kotlin.jvm.internal.p.k(r2.deleteCharAt(0), "deleteCharAt(...)");
    L8:
        r02.append(r2);
    L12:
        r02.append('-');
        k(r02, r02, r72.d());
        r02.append('-');
        k(r02, r02, r72.a());
        r02.append('T');
        k(r02, r02, r72.b());
        r02.append(':');
        k(r02, r02, r72.c());
        r02.append(':');
        k(r02, r02, r72.f());
        if (r72.e() == 0) goto L19;
        r02.append('.');
    L15:
        int r12 = r72.e();
        int[] r22 = f180418a;
        int r3 = r4 + 1;
        if ((r12 % r22[r3]) != 0) goto L18;
        r4 = r3;
        goto L15
    L18:
        int r42 = r4 - (r4 % 3);
        String r73 = String.valueOf((r72.e() / r22[r42]) + r22[9 - r42]);
        kotlin.jvm.internal.p.j(r73, "null cannot be cast to non-null type java.lang.String");
        String r74 = r73.substring(1);
        kotlin.jvm.internal.p.k(r74, "substring(...)");
        r02.append(r74);
    L19:
        r02.append('Z');
        return r02.toString();
    L7:
        r2.append(r1 - HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        kotlin.jvm.internal.p.k(r2.deleteCharAt(1), "deleteCharAt(...)");
        goto L8
    L9:
        if (r1 < 10000) goto L11;
        r02.append('+');
    L11:
        r02.append(r1);
        goto L12
    }

    public static final void k(Appendable r1, StringBuilder r2, int r3) {
        if (r3 >= 10) goto L5;
        r1.append('0');
    L5:
        r2.append(r3);
    }

    public static final boolean l(int r1) {
        if ((r1 & 3) == 0) goto L5;
        return false;
    L5:
        if ((r1 % 100) == 0) goto L7;
        return true;
    L7:
        if ((r1 % ErrorCode.ERROR_CODE_BAD_REQUEST_VALUE) != 0) goto L13;
        return true;
    L13:
        return false;
    }

    public static final int m(int r1, boolean r2) {
        if (r1 != 2) goto L5;
        if (r2 == false) goto L19;
        return 29;
    L19:
        return 28;
    L5:
        if (r1 != 4) goto L7;
        return 30;
    L7:
        if (r1 != 6) goto L9;
        return 30;
    L9:
        if (r1 != 9) goto L11;
        return 30;
    L11:
        if (r1 == 11) goto L23;
        return 31;
    L23:
        return 30;
    }

    public static final q n(CharSequence r25) {
        if (r25.length() == 0) goto L5;
        char r2 = r25.charAt(0);
        if (r2 == '+') goto L10;
        if (r2 == '-') goto L10;
        int r7 = 0;
        r2 = ' ';
    L11:
        int r9 = 0;
        int r8 = r7;
    L13:
        if (r8 >= r25.length()) goto L18;
        char r10 = r25.charAt(r8);
        if ('0' > r10) goto L18;
        if (r10 >= ':') goto L18;
        r9 = (r9 * 10) + (r25.charAt(r8) - '0');
        r8 = r8 + 1;
    L18:
        int r102 = r8 - r7;
        if (r102 > 10) goto L21;
        if (r102 != 10) goto L28;
        if (kotlin.jvm.internal.p.n(r25.charAt(r7), 50) < 0) goto L28;
        return v(r25, "Expected at most 9 digits for the year number or year 1000000000, got " + r102 + " digits");
    L28:
        if (r102 < 4) goto L30;
        if (r2 != '+') goto L35;
        if (r102 != 4) goto L35;
        return v(r25, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
    L35:
        if (r2 != ' ') goto L39;
        if (r102 == 4) goto L39;
        return v(r25, "A '+' or '-' sign is required for year numbers longer than 4 digits");
    L39:
        if (r2 != '-') goto L41;
        r9 = -r9;
    L41:
        int r16 = r9;
        int r3 = r8 + 16;
        if (r25.length() < r3) goto L44;
        q.a r22 = o(r25, "'-'", r8, new j());
        if (r22 == null) goto L48;
        return r22;
    L48:
        q.a r23 = o(r25, "'-'", r8 + 3, new k());
        if (r23 == null) goto L51;
        return r23;
    L51:
        q.a r24 = o(r25, "'T' or 't'", r8 + 6, new l());
        if (r24 == null) goto L54;
        return r24;
    L54:
        q.a r26 = o(r25, "':'", r8 + 9, new m());
        if (r26 == null) goto L57;
        return r26;
    L57:
        q.a r27 = o(r25, "':'", r8 + 12, new n());
        if (r27 == null) goto L60;
        return r27;
    L60:
        int[] r28 = f180419b;
        int r92 = r28.length;
        int r103 = 0;
    L61:
        if (r103 >= r92) goto L66;
        q.a r1 = o(r25, "an ASCII digit", r28[r103] + r8, new o());
        if (r1 != null) goto L64;
        r103 = r103 + 1;
        goto L61
    L64:
        return r1;
    L66:
        int r12 = w(r25, r8 + 1);
        int r29 = w(r25, r8 + 4);
        int r72 = w(r25, r8 + 7);
        int r93 = w(r25, r8 + 10);
        int r104 = w(r25, r8 + 13);
        int r82 = r8 + 15;
        if (r25.charAt(r82) != '.') goto L81;
        r82 = r3;
        int r5 = 0;
    L70:
        if (r82 >= r25.length()) goto L75;
        char r15 = r25.charAt(r82);
        if ('0' > r15) goto L75;
        if (r15 >= ':') goto L75;
        r5 = (r5 * 10) + (r25.charAt(r82) - '0');
        r82 = r82 + 1;
    L75:
        int r32 = r82 - r3;
        if (1 > r32) goto L80;
        if (r32 >= 10) goto L80;
        int r222 = r5 * f180418a[9 - r32];
    L83:
        if (r82 >= r25.length()) goto L85;
        char r33 = r25.charAt(r82);
        if (r33 != '+') goto L89;
    L102:
        int r6 = r25.length() - r82;
        if (r6 <= 9) goto L107;
        return v(r25, "The UTC offset string \"" + x(r25.subSequence(r82, r25.length()).toString(), 16) + "\" is too long");
    L107:
        if ((r6 % 3) != 0) goto L109;
        int[] r4 = f180420c;
        int r14 = r4.length;
        int r152 = 0;
    L111:
        if (r152 >= r14) goto L120;
        int r122 = r82 + r4[r152];
        if (r122 >= r25.length()) goto L120;
        if (r25.charAt(r122) != ':') goto L118;
        r152 = r152 + 1;
        goto L111
    L118:
        return v(r25, "Expected ':' at index " + r122 + ", got '" + r25.charAt(r122) + '\'');
    L120:
        int[] r42 = d;
        int r52 = r42.length;
        int r123 = 0;
    L121:
        if (r123 >= r52) goto L131;
        int r142 = r42[r123] + r82;
        if (r142 >= r25.length()) goto L131;
        char r153 = r25.charAt(r142);
        int[] r242 = r42;
        if ('0' > r153) goto L130;
        if (r153 >= ':') goto L130;
        r123 = r123 + 1;
        r42 = r242;
    L130:
        return v(r25, "Expected an ASCII digit at index " + r142 + ", got '" + r25.charAt(r142) + '\'');
    L131:
        int r43 = w(r25, r82 + 1);
        int r53 = 3;
        if (r6 <= 3) goto L134;
        int r11 = w(r25, r82 + 4);
    L136:
        if (r6 <= 6) goto L139;
        int r62 = w(r25, r82 + 7);
    L140:
        if (r11 > 59) goto L142;
        if (r62 <= 59) goto L147;
        return v(r25, "Expected offset-second-of-minute in 0..59, got " + r62);
    L147:
        if (r43 > 17) goto L149;
    L154:
        int r44 = ((r43 * 3600) + (r11 * 60)) + r62;
        if (r33 != '-') goto L157;
        int r34 = -1;
    L158:
        int r35 = r34 * r44;
    L159:
        if (1 > r12) goto L191;
        if (r12 >= 13) goto L191;
        if (1 > r29) goto L189;
        if (r29 > m(r12, l(r16))) goto L189;
        if (r72 <= 23) goto L170;
        return v(r25, "Expected hour in 0..23, got " + r72);
    L170:
        if (r93 > 59) goto L172;
        if (r104 > 59) goto L175;
        w r154 = new w(r16, r12, r29, r72, r93, r104, r222);
        long r02 = r154.g();
        long r63 = 365 * r02;
        if (r02 < 0) goto L179;
        long r64 = r63 + ((((r53 + r02) / 4) - ((99 + r02) / 100)) + ((r02 + 399) / ErrorCode.ERROR_CODE_BAD_REQUEST_VALUE));
    L180:
        long r65 = (r64 + (((r154.d() * 367) - 362) / 12)) + (r154.a() - 1);
        if (r154.d() <= 2) goto L186;
        long r03 = (-1) + r65;
        if (l(r154.g()) == true) goto L185;
        r65 = r65 - 2;
        goto L186
    L185:
        r65 = r03;
    L186:
        long r66 = r65 - 719528;
        return new q.b(((r66 * 86400) + (((r154.b() * 3600) + (r154.c() * 60)) + r154.f())) - r35, r154.e());
    L179:
        r64 = r63 - (((r02 / (-4)) - (r02 / (-100))) + (r02 / (-400)));
        goto L180
    L175:
        return v(r25, "Expected second-of-minute in 0..59, got " + r104);
    L172:
        return v(r25, "Expected minute-of-hour in 0..59, got " + r93);
    L189:
        return v(r25, "Expected a valid day-of-month for month " + r12 + " of year " + r16 + ", got " + r29);
    L191:
        return v(r25, "Expected a month number in 1..12, got " + r12);
    L157:
        r34 = 1;
        goto L158
    L149:
        if (r43 != 18) goto L153;
        if (r11 != 0) goto L153;
        if (r62 == 0) goto L154;
    L153:
        return v(r25, "Expected an offset in -18:00..+18:00, got " + r25.subSequence(r82, r25.length()).toString());
    L142:
        return v(r25, "Expected offset-minute-of-hour in 0..59, got " + r11);
    L139:
        r62 = 0;
        goto L140
    L134:
        r11 = 0;
        goto L136
    L109:
        return v(r25, "Invalid UTC offset string \"" + r25.subSequence(r82, r25.length()).toString() + '\"');
    L89:
        if (r33 == '-') goto L102;
        if (r33 != 'Z') goto L93;
    L96:
        int r83 = r82 + 1;
        if (r25.length() != r83) goto L101;
        r35 = 0;
        r53 = 3;
        goto L159
    L101:
        return v(r25, "Extra text after the instant at position " + r83);
    L93:
        if (r33 == 'z') goto L96;
        return v(r25, "Expected the UTC offset at position " + r82 + ", got '" + r33 + '\'');
    L85:
        return v(r25, "The UTC offset at the end of the string is missing");
    L80:
        return v(r25, "1..9 digits are supported for the fraction of the second, got " + r32 + " digits");
    L81:
        r222 = 0;
        goto L83
    L44:
        return v(r25, "The input string is too short");
    L30:
        return v(r25, "The year number must be padded to 4 digits, got " + r102 + " digits");
    L21:
        return v(r25, "Expected at most 10 digits for the year number, got " + r102 + " digits");
    L10:
        r7 = 1;
        goto L11
    L5:
        return new q.a("An empty string is not a valid Instant", r25);
    }

    public static final q.a o(CharSequence r2, String r3, int r4, kotlin.jvm.functions.l r5) {
        char r02 = r2.charAt(r4);
        if (((Boolean) r5.invoke(Character.valueOf(r02))).booleanValue() == false) goto L7;
        return null;
    L7:
        return v(r2, "Expected " + r3 + ", but got '" + r02 + "' at position " + r4);
    }

    public static final boolean p(char r1) {
        if (r1 != '-') goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean q(char r2) {
        if ('0' <= r2) goto L5;
    L8:
        return false;
    L5:
        if (r2 >= ':') goto L8;
        return true;
    }

    public static final boolean r(char r1) {
        if (r1 != '-') goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean s(char r1) {
        if (r1 != 'T') goto L5;
        return true;
    L5:
        if (r1 == 't') goto L11;
        return false;
    L11:
        return true;
    }

    public static final boolean t(char r1) {
        if (r1 != ':') goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean u(char r1) {
        if (r1 != ':') goto L6;
        return true;
    L6:
        return false;
    }

    public static final q.a v(CharSequence r2, String r3) {
        return new q.a(r3 + " when parsing an Instant from \"" + x(r2, 64) + '\"', r2);
    }

    public static final int w(CharSequence r1, int r2) {
        return ((r1.charAt(r2) - '0') * 10) + (r1.charAt(r2 + 1) - '0');
    }

    public static final String x(CharSequence r2, int r3) {
        if (r2.length() > r3) goto L7;
        return r2.toString();
    L7:
        return r2.subSequence(0, r3).toString() + "...";
    }
}
