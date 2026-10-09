package com.facebook.login;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B?\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\u0006\u0010\u0007\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0003J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/facebook/login/LoginBehavior;", "", "allowsGetTokenAuth", "", "allowsKatanaAuth", "allowsWebViewAuth", "allowsDeviceAuth", "allowsCustomTabAuth", "allowsFacebookLiteAuth", "allowsInstagramAppAuth", "(Ljava/lang/String;IZZZZZZZ)V", "NATIVE_WITH_FALLBACK", "NATIVE_ONLY", "KATANA_ONLY", "WEB_ONLY", "DIALOG_ONLY", "DEVICE_AUTH", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum LoginBehavior extends Enum<LoginBehavior> {
    public static final LoginBehavior DEVICE_AUTH = null;
    public static final LoginBehavior DIALOG_ONLY = null;
    public static final LoginBehavior KATANA_ONLY = null;
    public static final LoginBehavior NATIVE_ONLY = null;
    public static final LoginBehavior NATIVE_WITH_FALLBACK = null;
    public static final LoginBehavior WEB_ONLY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LoginBehavior[] f36745a = null;
    private final boolean allowsCustomTabAuth;
    private final boolean allowsDeviceAuth;
    private final boolean allowsFacebookLiteAuth;
    private final boolean allowsGetTokenAuth;
    private final boolean allowsInstagramAppAuth;
    private final boolean allowsKatanaAuth;
    private final boolean allowsWebViewAuth;

    static {
        NATIVE_WITH_FALLBACK = new LoginBehavior("NATIVE_WITH_FALLBACK", 0, true, true, true, false, true, true, true);
        NATIVE_ONLY = new LoginBehavior("NATIVE_ONLY", 1, true, true, false, false, false, true, true);
        KATANA_ONLY = new LoginBehavior("KATANA_ONLY", 2, false, true, false, false, false, false, false);
        WEB_ONLY = new LoginBehavior("WEB_ONLY", 3, false, false, true, false, true, false, false);
        DIALOG_ONLY = new LoginBehavior("DIALOG_ONLY", 4, false, true, true, false, true, true, true);
        DEVICE_AUTH = new LoginBehavior("DEVICE_AUTH", 5, false, false, false, true, false, false, false);
        f36745a = a();
    }

    LoginBehavior(String r1, int r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9) {
        this.allowsGetTokenAuth = r3;
        this.allowsKatanaAuth = r4;
        this.allowsWebViewAuth = r5;
        this.allowsDeviceAuth = r6;
        this.allowsCustomTabAuth = r7;
        this.allowsFacebookLiteAuth = r8;
        this.allowsInstagramAppAuth = r9;
    }

    public static final /* synthetic */ LoginBehavior[] a() {
        return new LoginBehavior[]{NATIVE_WITH_FALLBACK, NATIVE_ONLY, KATANA_ONLY, WEB_ONLY, DIALOG_ONLY, DEVICE_AUTH};
    }

    public static LoginBehavior valueOf(String r1) {
        return (LoginBehavior) Enum.valueOf(LoginBehavior.class, r1);
    }

    public static LoginBehavior[] values() {
        return (LoginBehavior[]) f36745a.clone();
    }

    public final boolean allowsCustomTabAuth() {
        return this.allowsCustomTabAuth;
    }

    public final boolean allowsDeviceAuth() {
        return this.allowsDeviceAuth;
    }

    public final boolean allowsFacebookLiteAuth() {
        return this.allowsFacebookLiteAuth;
    }

    public final boolean allowsGetTokenAuth() {
        return this.allowsGetTokenAuth;
    }

    public final boolean allowsInstagramAppAuth() {
        return this.allowsInstagramAppAuth;
    }

    public final boolean allowsKatanaAuth() {
        return this.allowsKatanaAuth;
    }

    public final boolean allowsWebViewAuth() {
        return this.allowsWebViewAuth;
    }
}
