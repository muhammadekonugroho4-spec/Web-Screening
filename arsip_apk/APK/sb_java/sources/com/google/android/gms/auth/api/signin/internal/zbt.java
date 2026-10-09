package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.UidVerifier;

/* loaded from: classes5.dex */
public final class zbt extends zbo {
    private final Context zba;

    public zbt(Context r1) {
        this.zba = r1;
    }

    private final void zbd() {
        if (UidVerifier.isGooglePlayServicesUid(this.zba, Binder.getCallingUid()) == false) goto L6;
        return;
    L6:
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zbp
    public final void zbb() {
        zbd();
        zbn.zbc(this.zba).zbd();
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zbp
    public final void zbc() {
        zbd();
        Storage r02 = Storage.getInstance(this.zba);
        GoogleSignInAccount r1 = r02.getSavedDefaultGoogleSignInAccount();
        GoogleSignInOptions r2 = GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (r1 == null) goto L5;
        r2 = r02.getSavedDefaultGoogleSignInOptions();
    L5:
        GoogleSignInClient r03 = GoogleSignIn.getClient(this.zba, r2);
        if (r1 == null) goto L9;
        r03.revokeAccess();
        return;
    L9:
        r03.signOut();
    }
}
