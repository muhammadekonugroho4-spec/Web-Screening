package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.messaging.Constants;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f179228a = false;

    static {
        String r02 = System.getProperty("kotlin.jvm.serialization.use8to7");     // Catch: SecurityException -> L4
    L5:
        f179228a = "true".equals(r02);
        return;
    L4:
        r02 = null;
        goto L5
    }

    public static /* synthetic */ void a(int r19) {
        if (r19 == 1) goto L11;
        if (r19 == 3) goto L11;
        if (r19 == 6) goto L11;
        if (r19 == 8) goto L11;
        if (r19 == 10) goto L11;
        if (r19 == 12) goto L11;
        if (r19 == 14) goto L11;
        String r8 = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
    L13:
        if (r19 == 1) goto L21;
        if (r19 == 3) goto L21;
        if (r19 == 6) goto L21;
        if (r19 == 8) goto L21;
        if (r19 == 10) goto L21;
        if (r19 == 12) goto L21;
        if (r19 == 14) goto L21;
        int r10 = 3;
    L22:
        Object[] r102 = new Object[r10];
        if (r19 == 1) goto L31;
        if (r19 == 3) goto L31;
        if (r19 == 6) goto L31;
        if (r19 == 8) goto L31;
        if (r19 == 10) goto L31;
        if (r19 == 12) goto L31;
        if (r19 == 14) goto L31;
        r102[0] = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
    L33:
        if (r19 == 1) goto L47;
        if (r19 == 3) goto L46;
        if (r19 == 6) goto L45;
        if (r19 == 8) goto L44;
        if (r19 == 10) goto L43;
        if (r19 == 12) goto L42;
        if (r19 == 14) goto L41;
        r102[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
    L48:
        switch(r19) {
            case 1: goto L57;
            case 2: goto L56;
            case 3: goto L57;
            case 4: goto L55;
            case 5: goto L54;
            case 6: goto L57;
            case 7: goto L53;
            case 8: goto L57;
            case 9: goto L52;
            case 10: goto L57;
            case 11: goto L51;
            case 12: goto L57;
            case 13: goto L50;
            case 14: goto L57;
            default: goto L49;
        };
    L49:
        r102[2] = "encodeBytes";
        goto L57
    L50:
        r102[2] = "decode7to8";
        goto L57
    L51:
        r102[2] = "combineStringArrayIntoBytes";
        goto L57
    L52:
        r102[2] = "dropMarker";
        goto L57
    L53:
        r102[2] = "decodeBytes";
        goto L57
    L54:
        r102[2] = "splitBytesToStringArray";
        goto L57
    L55:
        r102[2] = "addModuloByte";
        goto L57
    L56:
        r102[2] = "encode8to7";
    L57:
        String r82 = String.format(r8, r102);
        if (r19 == 1) goto L67;
        if (r19 == 3) goto L67;
        if (r19 == 6) goto L67;
        if (r19 == 8) goto L67;
        if (r19 == 10) goto L67;
        if (r19 == 12) goto L67;
        if (r19 == 14) goto L67;
        throw new IllegalArgumentException(r82);
    L67:
        throw new IllegalStateException(r82);
    L41:
        r102[1] = "decode7to8";
        goto L48
    L42:
        r102[1] = "combineStringArrayIntoBytes";
        goto L48
    L43:
        r102[1] = "dropMarker";
        goto L48
    L44:
        r102[1] = "decodeBytes";
        goto L48
    L45:
        r102[1] = "splitBytesToStringArray";
        goto L48
    L46:
        r102[1] = "encode8to7";
        goto L48
    L47:
        r102[1] = "encodeBytes";
    L31:
        r102[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
    L21:
        r10 = 2;
    L11:
        r8 = "@NotNull method %s.%s must not return null";
        goto L13
    }

    public static void b(byte[] r3, int r4) {
        if (r3 != null) goto L4;
        a(4);
    L4:
        int r02 = r3.length;
        int r1 = 0;
    L5:
        if (r1 >= r02) goto L7;
        r3[r1] = (byte) ((r3[r1] + r4) & WorkQueueKt.MASK);
        r1 = r1 + 1;
        goto L5
    }

    public static byte[] c(String[] r10) {
        if (r10 != null) goto L4;
        a(11);
    L4:
        int r02 = r10.length;
        int r2 = 0;
        int r3 = 0;
    L5:
        if (r2 >= r02) goto L7;
        r3 = r3 + r10[r2].length();
        r2 = r2 + 1;
        goto L5
    L7:
        byte[] r03 = new byte[r3];
        int r22 = r10.length;
        int r32 = 0;
        int r4 = 0;
    L8:
        if (r32 >= r22) goto L13;
        String r5 = r10[r32];
        int r6 = r5.length();
        int r7 = 0;
    L10:
        if (r7 >= r6) goto L12;
        r03[r4] = (byte) r5.charAt(r7);
        r7 = r7 + 1;
        r4 = r4 + 1;
        goto L10
    L12:
        r32 = r32 + 1;
        goto L8
    L13:
        return r03;
    }

    public static byte[] d(byte[] r12) {
        if (r12 != null) goto L4;
        a(13);
    L4:
        int r02 = (r12.length * 7) / 8;
        byte[] r1 = new byte[r02];
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
    L5:
        if (r3 >= r02) goto L11;
        int r7 = r4 + 1;
        int r9 = r5 + 1;
        r1[r3] = (byte) (((r12[r4] & UnsignedBytes.MAX_VALUE) >>> r5) + ((r12[r7] & ((1 << r9) - 1)) << (7 - r5)));
        if (r5 != 6) goto L9;
        r4 = r4 + 2;
        r5 = 0;
    L10:
        r3 = r3 + 1;
        goto L5
    L9:
        r4 = r7;
        r5 = r9;
        goto L10
    L11:
        return r1;
    }

    public static byte[] e(String[] r2) {
        if (r2 != null) goto L5;
        a(7);
    L5:
        if (r2.length > 0) goto L7;
    L17:
        byte[] r22 = c(r2);
        b(r22, WorkQueueKt.MASK);
        return d(r22);
    L7:
        if (r2[0].isEmpty() == true) goto L17;
        char r02 = r2[0].charAt(0);
        if (r02 != 0) goto L15;
        byte[] r23 = j.a(f(r2));
        if (r23 != null) goto L13;
        a(8);
    L13:
        return r23;
    L15:
        if (r02 != 65535) goto L17;
        r2 = f(r2);
        goto L17
    }

    public static String[] f(String[] r3) {
        if (r3 != null) goto L4;
        a(9);
    L4:
        String[] r32 = (String[]) r3.clone();
        r32[0] = r32[0].substring(1);
        return r32;
    }
}
