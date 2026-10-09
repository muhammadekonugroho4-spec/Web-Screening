package com.huawei.hms.framework.common;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;

/* loaded from: classes6.dex */
public class ExceptionCode {
    public static final int CANCEL = 10000100;
    private static final String CONNECT = "connect";
    public static final int CONNECTION_ABORT = 10000402;
    public static final int CONNECTION_REFUSED = 10000404;
    public static final int CONNECTION_RESET = 10000401;
    public static final int CONNECT_FAILED = 10000403;
    public static final int CRASH_EXCEPTION = 10000000;
    public static final int INTERRUPT_CONNECT_CLOSE = 10000405;
    public static final int INTERRUPT_EXCEPTION = 10000804;
    public static final int NETWORK_CHANGED = 10000201;
    public static final int NETWORK_IO_EXCEPTION = 10000802;
    public static final int NETWORK_TIMEOUT = 10000101;
    public static final int NETWORK_UNREACHABLE = 10000200;
    public static final int NETWORK_UNSUPPORTED = 10000102;
    public static final int PROTOCOL_ERROR = 10000801;
    private static final String READ = "read";
    public static final int READ_ERROR = 10000601;
    public static final int ROUTE_FAILED = 10000301;
    public static final int SHUTDOWN_EXCEPTION = 10000202;
    public static final int SOCKET_CLOSE = 10000406;
    public static final int SOCKET_CONNECT_TIMEOUT = 10000400;
    public static final int SOCKET_READ_TIMEOUT = 10000600;
    public static final int SOCKET_TIMEOUT = 10000803;
    public static final int SOCKET_WRITE_TIMEOUT = 10000700;
    public static final int SSL_HANDSHAKE_EXCEPTION = 10000501;
    public static final int SSL_PEERUNVERIFIED_EXCEPTION = 10000502;
    public static final int SSL_PROTOCOL_EXCEPTION = 10000500;
    public static final int UNABLE_TO_RESOLVE_HOST = 10000300;
    public static final int UNEXPECTED_EOF = 10000800;
    private static final String WRITE = "write";

    public ExceptionCode() {
    }

    private static String checkExceptionContainsKey(Exception r02, String... r1) {
        return checkStrContainsKey(StringUtils.toLowerCase(r02.getMessage()), r1);
    }

    private static String checkStrContainsKey(String r5, String... r6) {
        if (TextUtils.isEmpty(r5) == false) goto L5;
        return "";
    L5:
        int r02 = r6.length;
        int r2 = 0;
    L6:
        if (r2 >= r02) goto L11;
        String r3 = r6[r2];
        if (r5.contains(r3) == true) goto L9;
        r2 = r2 + 1;
        goto L6
    L9:
        return r3;
    L11:
        return "";
    }

    public static int getErrorCodeFromException(Exception r3) {
        if (r3 != null) goto L6;
        return NETWORK_IO_EXCEPTION;
    L6:
        if ((r3 instanceof IOException) == true) goto L9;
        return CRASH_EXCEPTION;
    L9:
        String r1 = r3.getMessage();
        if (r1 != null) goto L12;
        return NETWORK_IO_EXCEPTION;
    L12:
        String r12 = StringUtils.toLowerCase(r1);
        int r2 = getErrorCodeFromMsg(r12);
        if (r2 == 10000802) goto L16;
    L55:
        return r2;
    L16:
        if ((r3 instanceof SocketTimeoutException) == false) goto L20;
        return getErrorCodeSocketTimeout(r3);
    L20:
        if ((r3 instanceof ConnectException) == false) goto L24;
        return CONNECT_FAILED;
    L24:
        if ((r3 instanceof NoRouteToHostException) == false) goto L28;
        return ROUTE_FAILED;
    L28:
        if ((r3 instanceof SSLProtocolException) == false) goto L32;
        return SSL_PROTOCOL_EXCEPTION;
    L32:
        if ((r3 instanceof SSLHandshakeException) == false) goto L36;
        return SSL_HANDSHAKE_EXCEPTION;
    L36:
        if ((r3 instanceof SSLPeerUnverifiedException) == false) goto L40;
        return SSL_PEERUNVERIFIED_EXCEPTION;
    L40:
        if ((r3 instanceof UnknownHostException) == false) goto L44;
        return UNABLE_TO_RESOLVE_HOST;
    L44:
        if ((r3 instanceof InterruptedIOException) == false) goto L52;
        if (r12.contains("connection has been shut down") == false) goto L49;
        return INTERRUPT_CONNECT_CLOSE;
    L49:
        return INTERRUPT_EXCEPTION;
    L52:
        if ((r3 instanceof ProtocolException) == false) goto L55;
        return PROTOCOL_ERROR;
    }

    private static int getErrorCodeFromMsg(String r1) {
        if (r1.contains("unexpected end of stream") == false) goto L7;
        return UNEXPECTED_EOF;
    L7:
        if (r1.contains("unable to resolve host") == false) goto L11;
        return UNABLE_TO_RESOLVE_HOST;
    L11:
        if (r1.contains("read error") == false) goto L15;
        return READ_ERROR;
    L15:
        if (r1.contains("connection reset") == false) goto L19;
        return CONNECTION_RESET;
    L19:
        if (r1.contains("software caused connection abort") == false) goto L23;
        return CONNECTION_ABORT;
    L23:
        if (r1.contains("failed to connect to") == false) goto L27;
        return CONNECT_FAILED;
    L27:
        if (r1.contains("connection refused") == false) goto L31;
        return CONNECTION_REFUSED;
    L31:
        if (r1.contains("connection timed out") == false) goto L35;
        return SOCKET_CONNECT_TIMEOUT;
    L35:
        if (r1.contains("no route to host") == false) goto L39;
        return ROUTE_FAILED;
    L39:
        if (r1.contains("network is unreachable") == false) goto L43;
        return NETWORK_UNREACHABLE;
    L43:
        if (r1.contains("socket closed") == false) goto L46;
        return SOCKET_CLOSE;
    L46:
        return NETWORK_IO_EXCEPTION;
    }

    private static int getErrorCodeSocketTimeout(Exception r5) {
        String r52 = checkExceptionContainsKey(r5, new String[]{CONNECT, READ, WRITE});
        r52.getClass();
        char r3 = 65535;
        switch(r52.hashCode()) {
            case 3496342: goto L14;
            case 113399775: goto L10;
            case 951351530: goto L6;
            default: goto L17;
        };
    L17:
        switch(r3) {
            case 0: goto L24;
            case 1: goto L22;
            case 2: goto L20;
            default: goto L18;
        };
    L18:
        return SOCKET_TIMEOUT;
    L20:
        return SOCKET_CONNECT_TIMEOUT;
    L22:
        return SOCKET_WRITE_TIMEOUT;
    L24:
        return SOCKET_READ_TIMEOUT;
    L6:
        if (r52.equals(CONNECT) == false) goto L17;
        r3 = 2;
        goto L17
    L10:
        if (r52.equals(WRITE) == false) goto L17;
        r3 = 1;
        goto L17
    L14:
        if (r52.equals(READ) == false) goto L17;
        r3 = 0;
        goto L17
    }
}
