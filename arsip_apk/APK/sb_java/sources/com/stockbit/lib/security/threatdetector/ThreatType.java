package com.stockbit.lib.security.threatdetector;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/stockbit/lib/security/threatdetector/ThreatType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ROOT", "DEBUGGER", "UNTRUSTED", "EMULATOR", "TAMPER", "HOOK", "DEVICE_BINDING", "OBFUSCATION_ISSUE", "MALWARE", "SCREENSHOT", "SCREEN_RECORD", "MULTI_INSTANCE_ENV", "UNLOCKED_DEVICE", "HARDWARE_BACKED_KEYSTORE_UNAVAILABLE", "DEVELOPER_MODE", "ADB_ENABLED", "SYSTEM_VPN", "USB_WIFI_DEBUGGING_ENABLED", "NON_HARDWARE_BACKED_KEY", "security_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum ThreatType extends Enum<ThreatType> {
    public static final ThreatType ADB_ENABLED = null;
    public static final ThreatType DEBUGGER = null;
    public static final ThreatType DEVELOPER_MODE = null;
    public static final ThreatType DEVICE_BINDING = null;
    public static final ThreatType EMULATOR = null;
    public static final ThreatType HARDWARE_BACKED_KEYSTORE_UNAVAILABLE = null;
    public static final ThreatType HOOK = null;
    public static final ThreatType MALWARE = null;
    public static final ThreatType MULTI_INSTANCE_ENV = null;
    public static final ThreatType NON_HARDWARE_BACKED_KEY = null;
    public static final ThreatType OBFUSCATION_ISSUE = null;
    public static final ThreatType ROOT = null;
    public static final ThreatType SCREENSHOT = null;
    public static final ThreatType SCREEN_RECORD = null;
    public static final ThreatType SYSTEM_VPN = null;
    public static final ThreatType TAMPER = null;
    public static final ThreatType UNLOCKED_DEVICE = null;
    public static final ThreatType UNTRUSTED = null;
    public static final ThreatType USB_WIFI_DEBUGGING_ENABLED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ThreatType[] f120515a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f120516b = null;
    private final String value;

    static {
        ROOT = new ThreatType("ROOT", 0, "rooted");
        DEBUGGER = new ThreatType("DEBUGGER", 1, "debugger");
        UNTRUSTED = new ThreatType("UNTRUSTED", 2, "untrusted");
        EMULATOR = new ThreatType("EMULATOR", 3, "emulator");
        TAMPER = new ThreatType("TAMPER", 4, "tamper");
        HOOK = new ThreatType("HOOK", 5, "hook");
        DEVICE_BINDING = new ThreatType("DEVICE_BINDING", 6, "device_binding");
        OBFUSCATION_ISSUE = new ThreatType("OBFUSCATION_ISSUE", 7, "obfuscation_issue");
        MALWARE = new ThreatType("MALWARE", 8, "malware");
        SCREENSHOT = new ThreatType("SCREENSHOT", 9, "screenshot");
        SCREEN_RECORD = new ThreatType("SCREEN_RECORD", 10, "screen_record");
        MULTI_INSTANCE_ENV = new ThreatType("MULTI_INSTANCE_ENV", 11, "multi_instance_environment");
        UNLOCKED_DEVICE = new ThreatType("UNLOCKED_DEVICE", 12, "unlocked_device");
        HARDWARE_BACKED_KEYSTORE_UNAVAILABLE = new ThreatType("HARDWARE_BACKED_KEYSTORE_UNAVAILABLE", 13, "hardware_backed_keystore_unavailable");
        DEVELOPER_MODE = new ThreatType("DEVELOPER_MODE", 14, "developer_mode");
        ADB_ENABLED = new ThreatType("ADB_ENABLED", 15, "adb_enabled");
        SYSTEM_VPN = new ThreatType("SYSTEM_VPN", 16, "system_vpn");
        USB_WIFI_DEBUGGING_ENABLED = new ThreatType("USB_WIFI_DEBUGGING_ENABLED", 17, "usb_wifi_debugging_enabled");
        NON_HARDWARE_BACKED_KEY = new ThreatType("NON_HARDWARE_BACKED_KEY", 18, "non_hardware_backed_key");
        ThreatType[] r02 = a();
        f120515a = r02;
        f120516b = kotlin.enums.b.a(r02);
    }

    ThreatType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ ThreatType[] a() {
        return new ThreatType[]{ROOT, DEBUGGER, UNTRUSTED, EMULATOR, TAMPER, HOOK, DEVICE_BINDING, OBFUSCATION_ISSUE, MALWARE, SCREENSHOT, SCREEN_RECORD, MULTI_INSTANCE_ENV, UNLOCKED_DEVICE, HARDWARE_BACKED_KEYSTORE_UNAVAILABLE, DEVELOPER_MODE, ADB_ENABLED, SYSTEM_VPN, USB_WIFI_DEBUGGING_ENABLED, NON_HARDWARE_BACKED_KEY};
    }

    public static kotlin.enums.a getEntries() {
        return f120516b;
    }

    public static ThreatType valueOf(String r1) {
        return (ThreatType) Enum.valueOf(ThreatType.class, r1);
    }

    public static ThreatType[] values() {
        return (ThreatType[]) f120515a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
