package com.stockbit.android.service.accountManager;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes4.dex */
public class a extends AbstractAccountAuthenticator {
    public a(Context r1) {
        super(r1);
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle addAccount(AccountAuthenticatorResponse r1, String r2, String r3, String[] r4, Bundle r5) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle confirmCredentials(AccountAuthenticatorResponse r1, Account r2, Bundle r3) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle editProperties(AccountAuthenticatorResponse r1, String r2) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle getAuthToken(AccountAuthenticatorResponse r1, Account r2, String r3, Bundle r4) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public String getAuthTokenLabel(String r1) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle hasFeatures(AccountAuthenticatorResponse r1, Account r2, String[] r3) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle updateCredentials(AccountAuthenticatorResponse r1, Account r2, String r3, Bundle r4) {
        return null;
    }
}
