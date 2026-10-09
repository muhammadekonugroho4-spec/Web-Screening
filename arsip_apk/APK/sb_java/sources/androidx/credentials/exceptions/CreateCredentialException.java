package androidx.credentials.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\n\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/credentials/exceptions/CreateCredentialException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "type", "", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/lang/CharSequence;", "getErrorMessage", "()Ljava/lang/CharSequence;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CreateCredentialException extends Exception {
    private final CharSequence errorMessage;
    private final String type;

    public CreateCredentialException(String r2, CharSequence r3) {
        p.l(r2, "type");
        if (r3 == null) goto L5;
        String r02 = r3.toString();
    L6:
        super(r02);
        this.type = r2;
        this.errorMessage = r3;
        return;
    L5:
        r02 = null;
        goto L6
    }

    public String a() {
        return this.type;
    }
}
