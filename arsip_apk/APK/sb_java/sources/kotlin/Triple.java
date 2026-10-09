package kotlin;

import com.clevertap.android.sdk.Constants;
import com.gojek.ojosdk.exif.ExifInterface;
import java.io.Serializable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B!\bF\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002¢\u0006\u0004\b\t\u0010\nJ\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\u000f\u0010\u0012\u001a\u00028\u0000HÆ\u0083\u0004¢\u0006\u0002\u0010\fJ\u000f\u0010\u0013\u001a\u00028\u0001HÆ\u0083\u0004¢\u0006\u0002\u0010\fJ\u000f\u0010\u0014\u001a\u00028\u0002HÆ\u0083\u0004¢\u0006\u0002\u0010\fJ?\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\b\u001a\u00028\u0002HÆ\u0081\u0004¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0017\u0010\u0006\u001a\u00028\u0000X\u0086\u0084\b¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\u00028\u0001X\u0086\u0084\b¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\b\u001a\u00028\u0002X\u0086\u0084\b¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\f¨\u0006\u001d"}, d2 = {"Lkotlin/Triple;", ExifInterface.GpsStatus.IN_PROGRESS, "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "third", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "getThird", "toString", "", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;", "equals", "", "other", "", "hashCode", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Triple<A, B, C> implements Serializable {
    private final A first;
    private final B second;
    private final C third;

    /* JADX WARN: Multi-variable type inference failed */
    public Triple(Object r1, Object r2, Object r3) {
        this.first = r1;
        this.second = r2;
        this.third = r3;
    }

    public final Object a() {
        return this.first;
    }

    public final Object b() {
        return this.second;
    }

    public final Object c() {
        return this.third;
    }

    public final Object d() {
        return this.first;
    }

    public final Object e() {
        return this.second;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Triple) == true) goto L8;
        return false;
    L8:
        Triple r52 = (Triple) r5;
        if (kotlin.jvm.internal.p.g(this.first, r52.first) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.second, r52.second) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.third, r52.third) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final Object f() {
        return this.third;
    }

    public int hashCode() {
        A r02 = this.first;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        B r2 = this.second;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        C r23 = this.third;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return '(' + this.first + ", " + this.second + ", " + this.third + ')';
    }
}
