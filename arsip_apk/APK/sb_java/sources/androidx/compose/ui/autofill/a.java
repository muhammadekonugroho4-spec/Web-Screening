package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final View f16780a;

    /* renamed from: b, reason: collision with root package name */
    public final o f16781b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f16782c;
    public AutofillId d;

    static {
    }

    public a(View r2, o r3) {
        this.f16780a = r2;
        this.f16781b = r3;
        AutofillManager r32 = (AutofillManager) r2.getContext().getSystemService(AutofillManager.class);
        if (r32 == null) goto L14;
        this.f16782c = r32;
        r2.setImportantForAutofill(1);
        androidx.compose.ui.platform.coreshims.a r22 = androidx.compose.ui.platform.coreshims.d.a(r2);
        if (r22 == null) goto L7;
        AutofillId r23 = r22.a();
    L8:
        if (r23 == null) goto L11;
        this.d = r23;
        return;
    L11:
        androidx.compose.ui.internal.a.c("Required value was null.");
        throw new KotlinNothingValueException();
    L7:
        r23 = null;
        goto L8
    L14:
        throw new IllegalStateException("Autofill service could not be located.");
    }

    public final AutofillManager a() {
        return this.f16782c;
    }

    public final o b() {
        return this.f16781b;
    }

    public final AutofillId c() {
        return this.d;
    }

    public final View d() {
        return this.f16780a;
    }
}
