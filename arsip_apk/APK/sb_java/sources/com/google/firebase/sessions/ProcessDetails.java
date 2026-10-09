package com.google.firebase.sessions;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/google/firebase/sessions/ProcessDetails;", "", "processName", "", "pid", "", "importance", "isDefaultProcess", "", "(Ljava/lang/String;IIZ)V", "getImportance", "()I", "()Z", "getPid", "getProcessName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProcessDetails {
    private final int importance;
    private final boolean isDefaultProcess;
    private final int pid;
    private final String processName;

    public ProcessDetails(String r2, int r3, int r4, boolean r5) {
        p.l(r2, "processName");
        this.processName = r2;
        this.pid = r3;
        this.importance = r4;
        this.isDefaultProcess = r5;
    }

    public static /* synthetic */ ProcessDetails copy$default(ProcessDetails r02, String r1, int r2, int r3, boolean r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.processName;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.pid;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.importance;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.isDefaultProcess;
    L15:
        return r02.copy(r1, r2, r3, r4);
    }

    public final String component1() {
        return this.processName;
    }

    public final int component2() {
        return this.pid;
    }

    public final int component3() {
        return this.importance;
    }

    public final boolean component4() {
        return this.isDefaultProcess;
    }

    public final ProcessDetails copy(String r2, int r3, int r4, boolean r5) {
        p.l(r2, "processName");
        return new ProcessDetails(r2, r3, r4, r5);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ProcessDetails) == true) goto L8;
        return false;
    L8:
        ProcessDetails r52 = (ProcessDetails) r5;
        if (p.g(this.processName, r52.processName) == true) goto L12;
        return false;
    L12:
        if (this.pid == r52.pid) goto L15;
        return false;
    L15:
        if (this.importance == r52.importance) goto L18;
        return false;
    L18:
        if (this.isDefaultProcess == r52.isDefaultProcess) goto L20;
        return false;
    L20:
        return true;
    }

    public final int getImportance() {
        return this.importance;
    }

    public final int getPid() {
        return this.pid;
    }

    public final String getProcessName() {
        return this.processName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int r02 = ((((this.processName.hashCode() * 31) + Integer.hashCode(this.pid)) * 31) + Integer.hashCode(this.importance)) * 31;
        boolean r1 = this.isDefaultProcess;
        int r12 = r1;
        if (r1 == 0) goto L6;
        r12 = 1;
    L6:
        return r02 + r12;
    }

    public final boolean isDefaultProcess() {
        return this.isDefaultProcess;
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.processName + ", pid=" + this.pid + ", importance=" + this.importance + ", isDefaultProcess=" + this.isDefaultProcess + ')';
    }
}
