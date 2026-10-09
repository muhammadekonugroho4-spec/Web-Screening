package org.minidns.dane;

import java.security.cert.CertificateException;
import java.util.List;
import org.minidns.record.TLSA;

/* loaded from: classes3.dex */
public abstract class DaneCertificateException extends CertificateException {
    private static final long serialVersionUID = 1;

    public static class CertificateMismatch extends DaneCertificateException {
        private static final long serialVersionUID = 1;
        public final byte[] computed;
        public final TLSA tlsa;
    }

    public static class MultipleCertificateMismatchExceptions extends DaneCertificateException {
        private static final long serialVersionUID = 1;
        public final List<CertificateMismatch> certificateMismatchExceptions;

        static {
        }
    }

    public DaneCertificateException() {
    }
}
