package com.iab.digitalidentity.sdk.config;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/iab/digitalidentity/sdk/config/ClientEnvironment;", "", "(Ljava/lang/String;I)V", "STAGING", "PRODUCTION", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum ClientEnvironment extends Enum<ClientEnvironment> {
    public static final ClientEnvironment PRODUCTION = null;
    public static final ClientEnvironment STAGING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ClientEnvironment[] f40103a = null;

    static {
        STAGING = new ClientEnvironment("STAGING", 0);
        PRODUCTION = new ClientEnvironment("PRODUCTION", 1);
        f40103a = a();
    }

    ClientEnvironment(String r1, int r2) {
    }

    public static final /* synthetic */ ClientEnvironment[] a() {
        return new ClientEnvironment[]{STAGING, PRODUCTION};
    }

    public static ClientEnvironment valueOf(String r1) {
        return (ClientEnvironment) Enum.valueOf(ClientEnvironment.class, r1);
    }

    public static ClientEnvironment[] values() {
        return (ClientEnvironment[]) f40103a.clone();
    }
}
