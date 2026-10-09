package com.midtrans.raygun.messages;

/* loaded from: classes6.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public int f42132a;

    /* renamed from: b, reason: collision with root package name */
    public String f42133b;

    /* renamed from: c, reason: collision with root package name */
    public String f42134c;
    public String d;

    public f(StackTraceElement r2) {
        this.f42132a = r2.getLineNumber();
        this.f42133b = r2.getClassName();
        this.f42134c = r2.getFileName();
        this.d = r2.getMethodName();
    }

    public String a() {
        return this.f42133b;
    }
}
