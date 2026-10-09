package androidx.credentials.exceptions.publickeycredential;

import androidx.credentials.exceptions.CreateCredentialException;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "", "type", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public class CreatePublicKeyCredentialException extends CreateCredentialException {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23470a = null;
    private final String type;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f23470a = new a(null);
    }

    @Override // androidx.credentials.exceptions.CreateCredentialException
    public String a() {
        return this.type;
    }
}
