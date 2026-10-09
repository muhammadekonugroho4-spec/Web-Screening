package androidx.compose.ui.window;

import com.midtrans.sdk.corekit.core.BaseSdkBuilder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/window/SecureFlagPolicy;", "", "<init>", "(Ljava/lang/String;I)V", "Inherit", "SecureOn", "SecureOff", BaseSdkBuilder.UI_FLOW}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum SecureFlagPolicy extends Enum<SecureFlagPolicy> {
    public static final SecureFlagPolicy Inherit = null;
    public static final SecureFlagPolicy SecureOff = null;
    public static final SecureFlagPolicy SecureOn = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SecureFlagPolicy[] f20823a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f20824b = null;

    static {
        Inherit = new SecureFlagPolicy("Inherit", 0);
        SecureOn = new SecureFlagPolicy("SecureOn", 1);
        SecureOff = new SecureFlagPolicy("SecureOff", 2);
        SecureFlagPolicy[] r02 = a();
        f20823a = r02;
        f20824b = kotlin.enums.b.a(r02);
    }

    SecureFlagPolicy(String r1, int r2) {
    }

    public static final /* synthetic */ SecureFlagPolicy[] a() {
        return new SecureFlagPolicy[]{Inherit, SecureOn, SecureOff};
    }

    public static kotlin.enums.a getEntries() {
        return f20824b;
    }

    public static SecureFlagPolicy valueOf(String r1) {
        return (SecureFlagPolicy) Enum.valueOf(SecureFlagPolicy.class, r1);
    }

    public static SecureFlagPolicy[] values() {
        return (SecureFlagPolicy[]) f20823a.clone();
    }
}
