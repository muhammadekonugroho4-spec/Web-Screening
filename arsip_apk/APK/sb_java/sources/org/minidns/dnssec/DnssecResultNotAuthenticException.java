package org.minidns.dnssec;

import java.util.Set;
import org.minidns.MiniDnsException;

/* loaded from: classes3.dex */
public final class DnssecResultNotAuthenticException extends MiniDnsException {
    private static final long serialVersionUID = 1;
    private final Set<e> unverifiedReasons;
}
