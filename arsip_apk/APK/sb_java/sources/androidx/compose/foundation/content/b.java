package androidx.compose.foundation.content;

import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f7271a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f7272b;

    static {
    }

    public b(Uri r1, Bundle r2) {
        this.f7271a = r1;
        this.f7272b = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f7271a, r52.f7271a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f7272b, r52.f7272b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Uri r02 = this.f7271a;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L7:
        return (r03 * 31) + this.f7272b.hashCode();
    L5:
        r03 = 0;
        goto L7
    }

    public String toString() {
        return "PlatformTransferableContent(linkUri=" + this.f7271a + ", extras=" + this.f7272b + ')';
    }
}
