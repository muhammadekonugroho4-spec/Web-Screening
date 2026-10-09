package com.facebook.bolts;

import androidx.core.app.NotificationCompat;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000eJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\tR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/facebook/bolts/AggregateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Ljava/io/PrintStream;", NotificationCompat.CATEGORY_ERROR, "Lkotlin/w;", "printStackTrace", "(Ljava/io/PrintStream;)V", "Ljava/io/PrintWriter;", "(Ljava/io/PrintWriter;)V", "", "", "innerThrowables", "Ljava/util/List;", "a", "facebook-bolts_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AggregateException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36242a = null;
    private static final long serialVersionUID = 1;
    private final List<Throwable> innerThrowables;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f36242a = new a(null);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream r6) {
        p.l(r6, NotificationCompat.CATEGORY_ERROR);
        super.printStackTrace(r6);
        Iterator<Throwable> r02 = this.innerThrowables.iterator();
        int r1 = -1;
    L4:
        if (r02.hasNext() == false) goto L9;
        Throwable r2 = r02.next();
        r6.append("\n");
        r6.append("  Inner throwable #");
        r1 = r1 + 1;
        r6.append(String.valueOf(r1));
        r6.append(": ");
        if (r2 == null) goto L8;
        r2.printStackTrace(r6);
    L8:
        r6.append("\n");
        goto L4
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter r6) {
        p.l(r6, NotificationCompat.CATEGORY_ERROR);
        super.printStackTrace(r6);
        Iterator<Throwable> r02 = this.innerThrowables.iterator();
        int r1 = -1;
    L4:
        if (r02.hasNext() == false) goto L9;
        Throwable r2 = r02.next();
        r6.append("\n");
        r6.append("  Inner throwable #");
        r1 = r1 + 1;
        r6.append(String.valueOf(r1));
        r6.append(": ");
        if (r2 == null) goto L8;
        r2.printStackTrace(r6);
    L8:
        r6.append("\n");
        goto L4
    }
}
