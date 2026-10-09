package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;

/* loaded from: classes6.dex */
interface StateListener {
    boolean onException(Exception r1);

    boolean onStateReached(PersistedInstallationEntry r1);
}
