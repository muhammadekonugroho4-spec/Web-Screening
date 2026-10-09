package okio;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import okio.ByteString;

/* renamed from: okio.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12039a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f182340a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f182341b = null;

    static {
        ByteString.a r02 = ByteString.f182301c;
        f182340a = r02.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").i();
        f182341b = r02.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").i();
    }

    public static final byte[] a(String r14) {
        kotlin.jvm.internal.p.l(r14, "<this>");
        int r02 = r14.length();
    L4:
        if (r02 <= 0) goto L13;
        char r5 = r14.charAt(r02 - 1);
        if (r5 == '=') goto L12;
        if (r5 == '\n') goto L12;
        if (r5 == '\r') goto L12;
        if (r5 == ' ') goto L12;
        if (r5 != '\t') goto L13;
    L12:
        r02 = r02 - 1;
    L13:
        int r52 = (int) ((r02 * 6) / 8);
        byte[] r6 = new byte[r52];
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
    L15:
        if (r7 >= r02) goto L53;
        char r12 = r14.charAt(r7);
        if ('A' > r12) goto L22;
        if (r12 >= '[') goto L22;
        int r122 = r12 - 'A';
    L49:
        r9 = (r9 << 6) | r122;
        r8 = r8 + 1;
        if ((r8 % 4) != 0) goto L52;
        r6[r10] = (byte) (r9 >> 16);
        int r123 = r10 + 2;
        r6[r10 + 1] = (byte) (r9 >> 8);
        r10 = r10 + 3;
        r6[r123] = (byte) r9;
    L52:
        r7 = r7 + 1;
    L22:
        if ('a' > r12) goto L27;
        if (r12 >= '{') goto L27;
        r122 = r12 - 'G';
    L27:
        if ('0' > r12) goto L32;
        if (r12 >= ':') goto L32;
        r122 = r12 + 4;
    L32:
        if (r12 != '+') goto L34;
    L48:
        r122 = 62;
        goto L49
    L34:
        if (r12 == '-') goto L48;
        if (r12 != '/') goto L39;
    L47:
        r122 = 63;
        goto L49
    L39:
        if (r12 == '_') goto L47;
        if (r12 == '\n') goto L52;
        if (r12 == '\r') goto L52;
        if (r12 == ' ') goto L52;
        if (r12 == '\t') goto L52;
        return null;
    L53:
        int r82 = r8 % 4;
        if (r82 != 1) goto L56;
        return null;
    L56:
        if (r82 != 2) goto L58;
        r6[r10] = (byte) ((r9 << 12) >> 16);
        r10 = r10 + 1;
    L62:
        if (r10 != r52) goto L64;
        return r6;
    L64:
        byte[] r142 = Arrays.copyOf(r6, r10);
        kotlin.jvm.internal.p.k(r142, "copyOf(...)");
        return r142;
    L58:
        if (r82 != 3) goto L62;
        int r143 = r9 << 6;
        int r03 = r10 + 1;
        r6[r10] = (byte) (r143 >> 16);
        r10 = r10 + 2;
        r6[r03] = (byte) (r143 >> 8);
        goto L62
    }

    public static final String b(byte[] r11, byte[] r12) {
        kotlin.jvm.internal.p.l(r11, "<this>");
        kotlin.jvm.internal.p.l(r12, "map");
        byte[] r02 = new byte[((r11.length + 2) / 3) * 4];
        int r2 = r11.length - (r11.length % 3);
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r2) goto L5;
        byte r6 = r11[r3];
        int r7 = r3 + 2;
        byte r5 = r11[r3 + 1];
        r3 = r3 + 3;
        byte r72 = r11[r7];
        r02[r4] = r12[(r6 & UnsignedBytes.MAX_VALUE) >> 2];
        r02[r4 + 1] = r12[((r6 & 3) << 4) | ((r5 & UnsignedBytes.MAX_VALUE) >> 4)];
        int r62 = r4 + 3;
        r02[r4 + 2] = r12[((r5 & Ascii.SI) << 2) | ((r72 & UnsignedBytes.MAX_VALUE) >> 6)];
        r4 = r4 + 4;
        r02[r62] = r12[r72 & 63];
        goto L3
    L5:
        int r52 = r11.length - r2;
        if (r52 == 1) goto L10;
        if (r52 != 2) goto L12;
        int r53 = r3 + 1;
        byte r32 = r11[r3];
        byte r112 = r11[r53];
        r02[r4] = r12[(r32 & UnsignedBytes.MAX_VALUE) >> 2];
        r02[r4 + 1] = r12[((r32 & 3) << 4) | ((r112 & UnsignedBytes.MAX_VALUE) >> 4)];
        r02[r4 + 2] = r12[(r112 & Ascii.SI) << 2];
        r02[r4 + 3] = 61;
    L12:
        return M.c(r02);
    L10:
        byte r113 = r11[r3];
        r02[r4] = r12[(r113 & UnsignedBytes.MAX_VALUE) >> 2];
        r02[r4 + 1] = r12[(r113 & 3) << 4];
        r02[r4 + 2] = 61;
        r02[r4 + 3] = 61;
        goto L12
    }

    public static /* synthetic */ String c(byte[] r02, byte[] r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = f182340a;
    L6:
        return b(r02, r1);
    }

    public static final byte[] d() {
        return f182341b;
    }
}
