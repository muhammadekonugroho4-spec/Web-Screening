package com.stockbit.core.ui.avatar3dannouncedialog;

import com.stockbit.common.utils.C5872w;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final int f78848b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C5872w f78849a;

    static {
        f78848b = C5872w.f62407c;
    }

    public c(C5872w r1) {
        this.f78849a = r1;
    }

    public final c a(C5872w r2) {
        return new c(r2);
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f78849a, ((c) r4).f78849a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        C5872w r02 = this.f78849a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "Avatar3dAnnouncementDialogState(changeProfilePicture=" + this.f78849a + ')';
    }

    public /* synthetic */ c(C5872w r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }
}
