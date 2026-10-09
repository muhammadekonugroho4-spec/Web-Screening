package com.stockbit.alert.contract.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/alert/contract/model/AlertV2DetailModeNavParam;", "", "<init>", "(Ljava/lang/String;I)V", "Create", "Edit", "alert-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum AlertV2DetailModeNavParam extends Enum<AlertV2DetailModeNavParam> {
    public static final AlertV2DetailModeNavParam Create = null;
    public static final AlertV2DetailModeNavParam Edit = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AlertV2DetailModeNavParam[] f44461a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f44462b = null;

    static {
        Create = new AlertV2DetailModeNavParam("Create", 0);
        Edit = new AlertV2DetailModeNavParam("Edit", 1);
        AlertV2DetailModeNavParam[] r02 = a();
        f44461a = r02;
        f44462b = b.a(r02);
    }

    AlertV2DetailModeNavParam(String r1, int r2) {
    }

    public static final /* synthetic */ AlertV2DetailModeNavParam[] a() {
        return new AlertV2DetailModeNavParam[]{Create, Edit};
    }

    public static a getEntries() {
        return f44462b;
    }

    public static AlertV2DetailModeNavParam valueOf(String r1) {
        return (AlertV2DetailModeNavParam) Enum.valueOf(AlertV2DetailModeNavParam.class, r1);
    }

    public static AlertV2DetailModeNavParam[] values() {
        return (AlertV2DetailModeNavParam[]) f44461a.clone();
    }
}
