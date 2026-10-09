package androidx.collection;

import com.clevertap.android.sdk.Constants;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* renamed from: androidx.collection.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2345i {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6444a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f6445b;

    /* renamed from: c, reason: collision with root package name */
    public int f6446c;
    public int d;

    public /* synthetic */ AbstractC2345i(kotlin.jvm.internal.i r1) {
        this();
    }

    public static /* synthetic */ String d(AbstractC2345i r1, CharSequence r2, CharSequence r3, CharSequence r4, int r5, CharSequence r6, int r7, Object r8) {
        if (r8 != null) goto L21;
        if ((r7 & 1) == 0) goto L7;
        r2 = ", ";
    L7:
        if ((r7 & 2) == 0) goto L10;
        r3 = "";
    L10:
        if ((r7 & 4) == 0) goto L13;
        r4 = "";
    L13:
        if ((r7 & 8) == 0) goto L16;
        r5 = -1;
    L16:
        if ((r7 & 16) == 0) goto L18;
        r6 = "...";
    L18:
        int r72 = r5;
        CharSequence r82 = r6;
        CharSequence r62 = r4;
        CharSequence r42 = r2;
        return r1.c(r42, r3, r62, r72, r82);
    L21:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean a(float r17) {
        int r1 = Float.hashCode(r17) * (-862048943);
        int r12 = r1 ^ (r1 << 16);
        int r2 = r12 & WorkQueueKt.MASK;
        int r3 = this.f6446c;
        int r13 = (r12 >>> 7) & r3;
        int r5 = 0;
    L3:
        long[] r6 = this.f6444a;
        int r7 = r13 >> 3;
        int r8 = (r13 & 7) << 3;
        long r62 = ((r6[r7 + 1] << (64 - r8)) & ((-r8) >> 63)) | (r6[r7] >>> r8);
        long r82 = (r2 * 72340172838076673L) ^ r62;
        long r83 = ((~r82) & (r82 - 72340172838076673L)) & (-9187201950435737472L);
    L5:
        if (r83 == 0) goto L11;
        int r10 = ((Long.numberOfTrailingZeros(r83) >> 3) + r13) & r3;
        if (this.f6445b[r10] == r17) goto L13;
        r83 = r83 & (r83 - 1);
    L13:
        if (r10 < 0) goto L15;
        return true;
    L15:
        return false;
    L11:
        if (((r62 & ((~r62) << 6)) & (-9187201950435737472L)) != 0) goto L12;
        r5 = r5 + 8;
        r13 = (r13 + r5) & r3;
        goto L3
    L12:
        r10 = -1;
        goto L13
    }

    public final int b() {
        return this.f6446c;
    }

    public final String c(CharSequence r21, CharSequence r22, CharSequence r23, int r24, CharSequence r25) {
        kotlin.jvm.internal.p.l(r21, "separator");
        kotlin.jvm.internal.p.l(r22, "prefix");
        kotlin.jvm.internal.p.l(r23, "postfix");
        kotlin.jvm.internal.p.l(r25, "truncated");
        StringBuilder r5 = new StringBuilder();
        r5.append(r22);
        float[] r2 = this.f6445b;
        long[] r6 = this.f6444a;
        int r7 = r6.length - 2;
        if (r7 < 0) goto L25;
        int r9 = 0;
        int r10 = 0;
    L5:
        long r11 = r6[r9];
        if (((((~r11) << 7) & r11) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L23;
        int r14 = 8;
        int r13 = 8 - ((~(r9 - r7)) >>> 31);
        int r15 = 0;
    L8:
        if (r15 >= r13) goto L20;
        if ((r11 & 255) >= 128) goto L17;
        float r8 = r2[(r9 << 3) + r15];
        int r16 = r14;
        if (r10 == r24) goto L13;
        if (r10 == 0) goto L16;
        r5.append(r21);
    L16:
        r5.append(r8);
        r10 = r10 + 1;
    L18:
        r11 = r11 >> r16;
        r15 = r15 + 1;
        r14 = r16;
        goto L8
    L13:
        r5.append(r25);
    L26:
        String r1 = r5.toString();
        kotlin.jvm.internal.p.k(r1, "toString(...)");
        return r1;
    L17:
        r16 = r14;
        goto L18
    L20:
        if (r13 != r14) goto L25;
    L23:
        if (r9 == r7) goto L25;
        r9 = r9 + 1;
    L25:
        r5.append(r23);
        goto L26
    }

    public boolean equals(Object r18) {
        if (r18 != this) goto L6;
        return true;
    L6:
        if ((r18 instanceof AbstractC2345i) == true) goto L8;
        return false;
    L8:
        AbstractC2345i r1 = (AbstractC2345i) r18;
        if (r1.d == this.d) goto L11;
        return false;
    L11:
        float[] r3 = this.f6445b;
        long[] r5 = this.f6444a;
        int r6 = r5.length - 2;
        if (r6 < 0) goto L27;
        int r7 = 0;
    L14:
        long r8 = r5[r7];
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L25;
        int r10 = 8 - ((~(r7 - r6)) >>> 31);
        int r12 = 0;
    L17:
        if (r12 >= r10) goto L24;
        if ((255 & r8) >= 128) goto L23;
        if (r1.a(r3[(r7 << 3) + r12]) == true) goto L23;
        return false;
    L23:
        r8 = r8 >> 8;
        r12 = r12 + 1;
        goto L17
    L24:
        if (r10 != 8) goto L27;
    L25:
        if (r7 == r6) goto L27;
        r7 = r7 + 1;
    L27:
        return true;
    }

    public int hashCode() {
        float[] r02 = this.f6445b;
        long[] r1 = this.f6444a;
        int r2 = r1.length - 2;
        if (r2 < 0) goto L19;
        int r4 = 0;
        int r5 = 0;
    L5:
        long r6 = r1[r4];
        if (((((~r6) << 7) & r6) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L16;
        int r8 = 8 - ((~(r4 - r2)) >>> 31);
        int r10 = 0;
    L8:
        if (r10 >= r8) goto L13;
        if ((255 & r6) >= 128) goto L12;
        r5 = r5 + Float.hashCode(r02[(r4 << 3) + r10]);
    L12:
        r6 = r6 >> 8;
        r10 = r10 + 1;
        goto L8
    L13:
        if (r8 == 8) goto L16;
        return r5;
    L16:
        if (r4 == r2) goto L18;
        r4 = r4 + 1;
        goto L5
    L18:
        return r5;
    L19:
        return 0;
    }

    public String toString() {
        return d(this, null, Constants.AES_PREFIX, Constants.AES_SUFFIX, 0, null, 25, null);
    }

    public AbstractC2345i() {
        this.f6444a = c0.f6426a;
        this.f6445b = AbstractC2346j.a();
    }
}
