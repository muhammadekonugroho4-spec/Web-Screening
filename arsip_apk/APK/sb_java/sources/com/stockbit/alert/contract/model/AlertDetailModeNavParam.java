package com.stockbit.alert.contract.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/alert/contract/model/AlertDetailModeNavParam;", "", "<init>", "(Ljava/lang/String;I)V", "EDIT", "SET", "DETAIL", "alert-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum AlertDetailModeNavParam extends Enum<AlertDetailModeNavParam> {
    public static final AlertDetailModeNavParam DETAIL = null;
    public static final AlertDetailModeNavParam EDIT = null;
    public static final AlertDetailModeNavParam SET = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AlertDetailModeNavParam[] f44459a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f44460b = null;

    static {
        EDIT = new AlertDetailModeNavParam("EDIT", 0);
        SET = new AlertDetailModeNavParam("SET", 1);
        DETAIL = new AlertDetailModeNavParam("DETAIL", 2);
        AlertDetailModeNavParam[] r02 = a();
        f44459a = r02;
        f44460b = b.a(r02);
    }

    AlertDetailModeNavParam(String r1, int r2) {
    }

    public static final /* synthetic */ AlertDetailModeNavParam[] a() {
        return new AlertDetailModeNavParam[]{EDIT, SET, DETAIL};
    }

    public static a getEntries() {
        return f44460b;
    }

    public static AlertDetailModeNavParam valueOf(String r1) {
        return (AlertDetailModeNavParam) Enum.valueOf(AlertDetailModeNavParam.class, r1);
    }

    public static AlertDetailModeNavParam[] values() {
        return (AlertDetailModeNavParam[]) f44459a.clone();
    }
}
