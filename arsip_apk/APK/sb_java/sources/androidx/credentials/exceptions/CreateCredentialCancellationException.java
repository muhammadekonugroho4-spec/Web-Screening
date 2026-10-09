package androidx.credentials.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/credentials/exceptions/CreateCredentialCancellationException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "", "errorMessage", "<init>", "(Ljava/lang/CharSequence;)V", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CreateCredentialCancellationException extends CreateCredentialException {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23457a = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f23457a = new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreateCredentialCancellationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ CreateCredentialCancellationException(CharSequence r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }

    public CreateCredentialCancellationException(CharSequence r2) {
        super("android.credentials.CreateCredentialException.TYPE_USER_CANCELED", r2);
    }
}
