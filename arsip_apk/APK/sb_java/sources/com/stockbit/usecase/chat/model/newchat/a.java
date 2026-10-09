package com.stockbit.usecase.chat.model.newchat;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ContactStatusType f155574a;

    /* renamed from: b, reason: collision with root package name */
    public final int f155575b;

    public a(ContactStatusType r2, int r3) {
        p.l(r2, NotificationCompat.CATEGORY_STATUS);
        this.f155574a = r2;
        this.f155575b = r3;
    }

    public final ContactStatusType a() {
        return this.f155574a;
    }

    public final int b() {
        return this.f155575b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f155574a == r52.f155574a) goto L12;
        return false;
    L12:
        if (this.f155575b == r52.f155575b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f155574a.hashCode() * 31) + Integer.hashCode(this.f155575b);
    }

    public String toString() {
        return "ContactStatusUIState(status=" + this.f155574a + ", total=" + this.f155575b + ")";
    }

    public /* synthetic */ a(ContactStatusType r1, int r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = ContactStatusType.CONTACT_STATUS_TYPE_UNSPECIFIED;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = 0;
    L8:
        this(r1, r2);
    }
}
