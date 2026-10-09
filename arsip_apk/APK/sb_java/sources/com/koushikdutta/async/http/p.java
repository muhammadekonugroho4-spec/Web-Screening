package com.koushikdutta.async.http;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;

/* loaded from: classes6.dex */
public class p implements t, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final String f41568a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41569b;

    public p(String r1, String r2) {
        if (r1 == null) goto L7;
        this.f41568a = r1;
        this.f41569b = r2;
        return;
    L7:
        throw new IllegalArgumentException("Name may not be null");
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object r5) {
        if (r5 != null) goto L6;
        return false;
    L6:
        if (this != r5) goto L9;
        return true;
    L9:
        if ((r5 instanceof t) == false) goto L15;
        p r52 = (p) r5;
        if (this.f41568a.equals(r52.f41568a) == false) goto L15;
        if (TextUtils.equals(this.f41569b, r52.f41569b) == false) goto L15;
        return true;
    L15:
        return false;
    }

    public int hashCode() {
        return this.f41568a.hashCode() ^ this.f41569b.hashCode();
    }

    public String toString() {
        return this.f41568a + ContainerUtils.KEY_VALUE_DELIMITER + this.f41569b;
    }
}
