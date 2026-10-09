package com.appmattus.certificatetransparency.internal.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0010\u0018\u0000 \u00072\u00060\u0001j\u0002`\u0002:\u0001\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/exceptions/CertificateTransparencyException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "message", "<init>", "(Ljava/lang/String;)V", "a", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class CertificateTransparencyException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32088a = null;
    private static final long serialVersionUID = 1;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f32088a = new a(null);
    }

    public CertificateTransparencyException(String r2) {
        p.l(r2, "message");
        super(r2);
    }
}
