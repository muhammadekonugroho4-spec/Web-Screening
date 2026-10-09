package androidx.compose.ui.autofill;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;

/* loaded from: classes.dex */
public final class m extends AutofillManager.AutofillCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final m f16789a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f16790b = 0;

    static {
        f16789a = new m();
        f16790b = 8;
    }

    public m() {
    }

    public final void a(a r1) {
        r1.a().registerCallback(this);
    }

    public final void b(a r1) {
        r1.a().unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(View r1, int r2, int r3) {
        super.onAutofillEvent(r1, r2, r3);
        if (r3 != 1) goto L5;
        String r12 = "Autofill popup was shown.";
    L12:
        Log.d("Autofill Status", r12);
        return;
    L5:
        if (r3 != 2) goto L7;
        r12 = "Autofill popup was hidden.";
        goto L12
    L7:
        if (r3 == 3) goto L9;
        r12 = "Unknown status event.";
        goto L12
    L9:
        r12 = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
        goto L12
    }
}
