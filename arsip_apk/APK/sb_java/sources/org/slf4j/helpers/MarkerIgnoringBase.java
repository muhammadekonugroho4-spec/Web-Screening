package org.slf4j.helpers;

/* loaded from: classes3.dex */
public abstract class MarkerIgnoringBase extends NamedLoggerBase implements org.slf4j.b {
    private static final long serialVersionUID = 9044267456635152283L;

    public MarkerIgnoringBase() {
    }

    @Override // org.slf4j.helpers.NamedLoggerBase, org.slf4j.b
    public abstract /* bridge */ /* synthetic */ String getName();

    public String toString() {
        return getClass().getName() + "(" + getName() + ")";
    }
}
