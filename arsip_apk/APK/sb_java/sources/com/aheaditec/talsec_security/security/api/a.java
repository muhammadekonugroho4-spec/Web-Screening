package com.aheaditec.talsec_security.security.api;

import java.util.Date;
import java.util.Random;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Random f30814a = null;

    static {
        f30814a = new Random(new Date().getTime());
    }

    public static void a(byte[] r1) {
        if (r1 == null) goto L5;
        f30814a.nextBytes(r1);
        return;
    }
}
