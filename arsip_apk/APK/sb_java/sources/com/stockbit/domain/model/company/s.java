package com.stockbit.domain.model.company;

import java.util.List;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final List f81918a;

    public s(List r2) {
        kotlin.jvm.internal.p.l(r2, "rightIssues");
        this.f81918a = r2;
    }

    public final List a() {
        return this.f81918a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof s) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f81918a, ((s) r4).f81918a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f81918a.hashCode();
    }

    public String toString() {
        return "CorpActionRightIssueEntity(rightIssues=" + this.f81918a + ")";
    }
}
