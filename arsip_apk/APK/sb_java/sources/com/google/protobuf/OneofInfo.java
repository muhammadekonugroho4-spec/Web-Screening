package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes6.dex */
final class OneofInfo {
    private final java.lang.reflect.Field caseField;

    /* renamed from: id, reason: collision with root package name */
    private final int f38802id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int r1, java.lang.reflect.Field r2, java.lang.reflect.Field r3) {
        this.f38802id = r1;
        this.caseField = r2;
        this.valueField = r3;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f38802id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
