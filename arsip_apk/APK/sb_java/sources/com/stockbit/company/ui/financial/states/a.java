package com.stockbit.company.ui.financial.states;

import com.google.firebase.messaging.Constants;
import com.stockbit.usecase.company.model.m;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final m f65911a;

    /* renamed from: b, reason: collision with root package name */
    public final CompanyFinancialReportState f65912b;

    static {
    }

    public a(m r2, CompanyFinancialReportState r3) {
        p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        p.l(r3, "type");
        this.f65911a = r2;
        this.f65912b = r3;
    }

    public final m a() {
        return this.f65911a;
    }

    public final CompanyFinancialReportState b() {
        return this.f65912b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f65911a, r52.f65911a) == true) goto L12;
        return false;
    L12:
        if (this.f65912b == r52.f65912b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f65911a.hashCode() * 31) + this.f65912b.hashCode();
    }

    public String toString() {
        return "CompanyFinancialChartUIState(data=" + this.f65911a + ", type=" + this.f65912b + ')';
    }
}
