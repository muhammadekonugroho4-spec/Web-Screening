package com.huawei.hms.common.internal;

/* loaded from: classes6.dex */
public class ResolveClientBean {

    /* renamed from: a, reason: collision with root package name */
    private final int f39122a;

    /* renamed from: b, reason: collision with root package name */
    private final AnyClient f39123b;

    /* renamed from: c, reason: collision with root package name */
    private int f39124c;

    public ResolveClientBean(AnyClient r1, int r2) {
        this.f39123b = r1;
        this.f39122a = Objects.hashCode(new Object[]{r1});
        this.f39124c = r2;
    }

    public void clientReconnect() {
        this.f39123b.connect(this.f39124c, true);
    }

    public boolean equals(Object r2) {
        if (this != r2) goto L5;
        return true;
    L5:
        if (r2 != null) goto L7;
        return false;
    L7:
        if ((r2 instanceof ResolveClientBean) == true) goto L10;
        return false;
    L10:
        return this.f39123b.equals(((ResolveClientBean) r2).f39123b);
    }

    public AnyClient getClient() {
        return this.f39123b;
    }

    public int hashCode() {
        return this.f39122a;
    }
}
