package com.google.crypto.tink.shaded.protobuf;

@CheckReturnValue
/* loaded from: classes6.dex */
final class OneofInfo {
    private final java.lang.reflect.Field caseField;

    /* renamed from: id, reason: collision with root package name */
    private final int f38451id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int r1, java.lang.reflect.Field r2, java.lang.reflect.Field r3) {
        this.f38451id = r1;
        this.caseField = r2;
        this.valueField = r3;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f38451id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
