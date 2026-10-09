package com.aheaditec.talsec.security;

import java.util.UUID;

/* renamed from: com.aheaditec.talsec.security.j0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4278j0 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile String f30621a;

    public static String a() {
        if (f30621a != null) goto L16;
        monitor-enter(AbstractC4278j0.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (f30621a != null) goto L11;
        f30621a = UUID.randomUUID().toString();     // Catch: Throwable -> L9
    L11:
        monitor-exit(AbstractC4278j0.class);     // Catch: Throwable -> L9
    L16:
        return f30621a;
    }
}
