package androidx.glance.appwidget;

import android.widget.RemoteViews;

/* loaded from: classes4.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final RemoteViews f24787a;

    /* renamed from: b, reason: collision with root package name */
    public final v f24788b;

    static {
    }

    public F(RemoteViews r1, v r2) {
        this.f24787a = r1;
        this.f24788b = r2;
    }

    public final RemoteViews a() {
        return this.f24787a;
    }

    public final v b() {
        return this.f24788b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof F) == true) goto L8;
        return false;
    L8:
        F r52 = (F) r5;
        if (kotlin.jvm.internal.p.g(this.f24787a, r52.f24787a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f24788b, r52.f24788b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f24787a.hashCode() * 31) + this.f24788b.hashCode();
    }

    public String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.f24787a + ", view=" + this.f24788b + ')';
    }
}
