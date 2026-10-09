package androidx.work.impl.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/work/impl/model/SystemIdInfo;", "", "", "workSpecId", "", "generation", "systemId", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SystemIdInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f29418a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29419b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29420c;

    public SystemIdInfo(String r2, int r3, int r4) {
        kotlin.jvm.internal.p.l(r2, "workSpecId");
        this.f29418a = r2;
        this.f29419b = r3;
        this.f29420c = r4;
    }

    public final int a() {
        return this.f29419b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SystemIdInfo) == true) goto L8;
        return false;
    L8:
        SystemIdInfo r52 = (SystemIdInfo) r5;
        if (kotlin.jvm.internal.p.g(this.f29418a, r52.f29418a) == true) goto L12;
        return false;
    L12:
        if (this.f29419b == r52.f29419b) goto L15;
        return false;
    L15:
        if (this.f29420c == r52.f29420c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f29418a.hashCode() * 31) + Integer.hashCode(this.f29419b)) * 31) + Integer.hashCode(this.f29420c);
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f29418a + ", generation=" + this.f29419b + ", systemId=" + this.f29420c + ')';
    }
}
