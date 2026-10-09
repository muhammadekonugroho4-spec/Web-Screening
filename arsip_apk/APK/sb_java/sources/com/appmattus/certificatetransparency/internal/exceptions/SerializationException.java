package com.appmattus.certificatetransparency.internal.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/exceptions/SerializationException;", "Lcom/appmattus/certificatetransparency/internal/exceptions/CertificateTransparencyException;", "", "message", "<init>", "(Ljava/lang/String;)V", "b", "a", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SerializationException extends CertificateTransparencyException {

    /* renamed from: b, reason: collision with root package name */
    public static final a f32089b = null;
    private static final long serialVersionUID = 1;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f32089b = new a(null);
    }

    public SerializationException(String r2) {
        p.l(r2, "message");
        super(r2);
    }
}
