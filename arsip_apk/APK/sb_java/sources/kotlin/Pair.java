package kotlin;

import com.clevertap.android.sdk.Constants;
import com.gojek.ojosdk.exif.ExifInterface;
import java.io.Serializable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004B\u0019\bF\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\r\u001a\u00020\u000eH\u0096\u0080\u0004J\u000f\u0010\u000f\u001a\u00028\u0000HÆ\u0083\u0004¢\u0006\u0002\u0010\nJ\u000f\u0010\u0010\u001a\u00028\u0001HÆ\u0083\u0004¢\u0006\u0002\u0010\nJ/\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0001HÆ\u0081\u0004¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0017\u0010\u0005\u001a\u00028\u0000X\u0086\u0084\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00028\u0001X\u0086\u0084\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\n¨\u0006\u0019"}, d2 = {"Lkotlin/Pair;", ExifInterface.GpsStatus.IN_PROGRESS, "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "toString", "", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "equals", "", "other", "", "hashCode", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Pair<A, B> implements Serializable {
    private final A first;
    private final B second;

    /* JADX WARN: Multi-variable type inference failed */
    public Pair(Object r1, Object r2) {
        this.first = r1;
        this.second = r2;
    }

    public static /* synthetic */ Pair d(Pair r02, Object r1, Object r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.first;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.second;
    L9:
        return r02.c(r1, r2);
    }

    public final Object a() {
        return this.first;
    }

    public final Object b() {
        return this.second;
    }

    public final Pair c(Object r2, Object r3) {
        return new Pair(r2, r3);
    }

    public final Object e() {
        return this.first;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Pair) == true) goto L8;
        return false;
    L8:
        Pair r52 = (Pair) r5;
        if (kotlin.jvm.internal.p.g(this.first, r52.first) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.second, r52.second) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final Object f() {
        return this.second;
    }

    public int hashCode() {
        A r02 = this.first;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        B r2 = this.second;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return '(' + this.first + ", " + this.second + ')';
    }
}
