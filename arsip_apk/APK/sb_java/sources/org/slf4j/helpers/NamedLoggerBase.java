package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes3.dex */
abstract class NamedLoggerBase implements org.slf4j.b, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    public NamedLoggerBase() {
    }

    @Override // org.slf4j.b
    public abstract String getName();

    public Object readResolve() throws ObjectStreamException {
        return org.slf4j.c.j(getName());
    }
}
