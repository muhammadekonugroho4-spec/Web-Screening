package androidx.work.impl.model;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/work/impl/model/Preference;", "", "", Constants.KEY_KEY, "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Preference {

    /* renamed from: a, reason: collision with root package name */
    public final String f29416a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f29417b;

    public Preference(String r2, Long r3) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_KEY);
        this.f29416a = r2;
        this.f29417b = r3;
    }

    public final String a() {
        return this.f29416a;
    }

    public final Long b() {
        return this.f29417b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Preference) == true) goto L8;
        return false;
    L8:
        Preference r52 = (Preference) r5;
        if (kotlin.jvm.internal.p.g(this.f29416a, r52.f29416a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f29417b, r52.f29417b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f29416a.hashCode() * 31;
        Long r1 = this.f29417b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "Preference(key=" + this.f29416a + ", value=" + this.f29417b + ')';
    }

    public Preference(String r3, boolean r4) {
        kotlin.jvm.internal.p.l(r3, Constants.KEY_KEY);
        if (r4 == false) goto L5;
        long r02 = 1;
    L6:
        this(r3, Long.valueOf(r02));
        return;
    L5:
        r02 = 0;
        goto L6
    }
}
