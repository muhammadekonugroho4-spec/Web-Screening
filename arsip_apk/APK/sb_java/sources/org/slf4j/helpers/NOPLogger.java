package org.slf4j.helpers;

/* loaded from: classes3.dex */
public class NOPLogger extends MarkerIgnoringBase {

    /* renamed from: a, reason: collision with root package name */
    public static final NOPLogger f183029a = null;
    private static final long serialVersionUID = -517220405410904473L;

    static {
        f183029a = new NOPLogger();
    }

    public NOPLogger() {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, org.slf4j.helpers.NamedLoggerBase, org.slf4j.b
    public String getName() {
        return "NOP";
    }
}
