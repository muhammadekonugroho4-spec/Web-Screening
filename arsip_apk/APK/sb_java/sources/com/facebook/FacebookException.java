package com.facebook;

import com.facebook.internal.FeatureManager;
import java.util.Random;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0016\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000eB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u001d\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0003\u0010\nB\u0013\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0003\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "", "message", "(Ljava/lang/String;)V", "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "a", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public class FacebookException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public static final a f35624a = null;
    public static final long serialVersionUID = 1;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f35624a = new a(null);
    }

    public FacebookException() {
    }

    public static /* synthetic */ void a(String r02, boolean r1) {
        b(r02, r1);
    }

    public static final void b(String r02, boolean r1) {
        if (r1 == false) goto L8;
        com.facebook.internal.instrument.errorreport.e.g(r02);     // Catch: Exception -> L5
        return;
    L9:
        return;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String r02 = getMessage();
        if (r02 != null) goto L6;
        return "";
    L6:
        return r02;
    }

    public FacebookException(final String r3) {
        super(r3);
        Random r02 = new Random();
        if (r3 != null) goto L5;
        return;
    L5:
        if (v.G() == true) goto L7;
        return;
    L7:
        if (r02.nextInt(100) <= 50) goto L12;
        FeatureManager.a(FeatureManager.Feature.ErrorReport, new C4494l(r3));
        return;
    }

    public FacebookException(String r1, Throwable r2) {
        super(r1, r2);
    }

    public FacebookException(Throwable r1) {
        super(r1);
    }
}
