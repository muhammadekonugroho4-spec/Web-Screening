package com.facebook.appevents;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/facebook/appevents/ParameterClassification;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CustomData", "OperationalData", "CustomAndOperationalData", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum ParameterClassification extends Enum<ParameterClassification> {
    public static final ParameterClassification CustomAndOperationalData = null;
    public static final ParameterClassification CustomData = null;
    public static final ParameterClassification OperationalData = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ParameterClassification[] f35750a = null;
    private final String value;

    static {
        CustomData = new ParameterClassification("CustomData", 0, "custom_data");
        OperationalData = new ParameterClassification("OperationalData", 1, "operational_data");
        CustomAndOperationalData = new ParameterClassification("CustomAndOperationalData", 2, "custom_and_operational_data");
        f35750a = a();
    }

    ParameterClassification(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ ParameterClassification[] a() {
        return new ParameterClassification[]{CustomData, OperationalData, CustomAndOperationalData};
    }

    public static ParameterClassification valueOf(String r1) {
        return (ParameterClassification) Enum.valueOf(ParameterClassification.class, r1);
    }

    public static ParameterClassification[] values() {
        return (ParameterClassification[]) f35750a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
