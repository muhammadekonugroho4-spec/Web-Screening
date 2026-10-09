package okhttp3.internal.idn;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.w;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import okio.InterfaceC12044f;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/idn/IdnaMappingTable;", "", "", "sections", "ranges", "mappings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "codePoint", "Lokio/f;", "sink", "", "c", "(ILokio/f;)Z", "b", "(I)I", "position", Constants.KEY_LIMIT, "a", "(III)I", "Ljava/lang/String;", "getSections", "()Ljava/lang/String;", "getRanges", "getMappings", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IdnaMappingTable {

    /* renamed from: a, reason: collision with root package name */
    public final String f182130a;

    /* renamed from: b, reason: collision with root package name */
    public final String f182131b;

    /* renamed from: c, reason: collision with root package name */
    public final String f182132c;

    public IdnaMappingTable(String r2, String r3, String r4) {
        p.l(r2, "sections");
        p.l(r3, "ranges");
        p.l(r4, "mappings");
        this.f182130a = r2;
        this.f182131b = r3;
        this.f182132c = r4;
    }

    public final int a(int r4, int r5, int r6) {
        int r42 = r4 & WorkQueueKt.MASK;
        int r62 = r6 - 1;
    L3:
        if (r5 > r62) goto L9;
        int r02 = (r5 + r62) / 2;
        int r1 = p.n(r42, this.f182131b.charAt(r02 * 4));
        if (r1 < 0) goto L6;
        if (r1 <= 0) goto L10;
        r5 = r02 + 1;
    L10:
        if (r02 < 0) goto L14;
        return r02 * 4;
    L14:
        return ((-r02) - 2) * 4;
    L6:
        r62 = r02 - 1;
        goto L3
    L9:
        r02 = (-r5) - 1;
        goto L10
    }

    public final int b(int r6) {
        int r62 = (r6 & 2097024) >> 7;
        int r02 = (this.f182130a.length() / 4) - 1;
        int r1 = 0;
    L3:
        if (r1 > r02) goto L9;
        int r2 = (r1 + r02) / 2;
        int r3 = p.n(r62, IdnaMappingTableKt.a(this.f182130a, r2 * 4));
        if (r3 < 0) goto L6;
        if (r3 <= 0) goto L10;
        r1 = r2 + 1;
    L10:
        if (r2 < 0) goto L14;
        return r2 * 4;
    L14:
        return ((-r2) - 2) * 4;
    L6:
        r02 = r2 - 1;
        goto L3
    L9:
        r2 = (-r1) - 1;
        goto L10
    }

    public final boolean c(int r6, InterfaceC12044f r7) {
        p.l(r7, "sink");
        int r1 = b(r6);
        int r2 = IdnaMappingTableKt.a(this.f182130a, r1 + 2);
        if ((r1 + 4) >= this.f182130a.length()) goto L5;
        int r12 = IdnaMappingTableKt.a(this.f182130a, r1 + 6);
    L6:
        int r13 = a(r6, r2, r12);
        char r22 = this.f182131b.charAt(r13 + 1);
        if (r22 < 0) goto L11;
        if (r22 >= '@') goto L11;
        int r62 = IdnaMappingTableKt.a(this.f182131b, r13 + 2);
        r7.H(this.f182132c, r62, r22 + r62);
    L46:
        return true;
    L11:
        if ('@' > r22) goto L14;
        if (r22 >= 'P') goto L14;
        r7.G0(r6 - (this.f182131b.charAt(r13 + 3) | (((r22 & 15) << 14) | (this.f182131b.charAt(r13 + 2) << 7))));
    L14:
        if ('P' > r22) goto L19;
        if (r22 >= '`') goto L19;
        r7.G0(r6 + (this.f182131b.charAt(r13 + 3) | (((r22 & 15) << 14) | (this.f182131b.charAt(r13 + 2) << 7))));
    L19:
        if (r22 != 'w') goto L22;
        w r63 = w.f180450a;
        goto L46
    L22:
        if (r22 != 'x') goto L25;
        r7.G0(r6);
        goto L46
    L25:
        if (r22 != 'y') goto L29;
        r7.G0(r6);
        return false;
    L29:
        if (r22 != 'z') goto L32;
        r7.writeByte(this.f182131b.charAt(r13 + 2));
        goto L46
    L32:
        if (r22 != '{') goto L35;
        r7.writeByte(this.f182131b.charAt(r13 + 2) | 128);
        goto L46
    L35:
        if (r22 != '|') goto L38;
        r7.writeByte(this.f182131b.charAt(r13 + 2));
        r7.writeByte(this.f182131b.charAt(r13 + 3));
        goto L46
    L38:
        if (r22 != '}') goto L41;
        r7.writeByte(this.f182131b.charAt(r13 + 2) | 128);
        r7.writeByte(this.f182131b.charAt(r13 + 3));
        goto L46
    L41:
        if (r22 != '~') goto L44;
        r7.writeByte(this.f182131b.charAt(r13 + 2));
        r7.writeByte(this.f182131b.charAt(r13 + 3) | 128);
        goto L46
    L44:
        if (r22 != 127) goto L48;
        r7.writeByte(this.f182131b.charAt(r13 + 2) | 128);
        r7.writeByte(this.f182131b.charAt(r13 + 3) | 128);
        goto L46
    L48:
        throw new IllegalStateException(("unexpected rangesIndex for " + r6).toString());
    L5:
        r12 = this.f182131b.length() / 4;
        goto L6
    }
}
