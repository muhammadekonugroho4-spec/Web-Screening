package com.stockbit.domain.model.stream.notes;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f85846a;

    /* renamed from: b, reason: collision with root package name */
    public final List f85847b;

    public a(List r2, List r3) {
        p.l(r2, "fileUrls");
        p.l(r3, "imageUrls");
        this.f85846a = r2;
        this.f85847b = r3;
    }

    public final List a() {
        return this.f85846a;
    }

    public final List b() {
        return this.f85847b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f85846a, r52.f85846a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85847b, r52.f85847b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85846a.hashCode() * 31) + this.f85847b.hashCode();
    }

    public String toString() {
        return "CompanyNoteAttachmentEntity(fileUrls=" + this.f85846a + ", imageUrls=" + this.f85847b + ")";
    }
}
