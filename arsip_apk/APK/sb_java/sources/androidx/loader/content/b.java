package androidx.loader.content;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes4.dex */
public abstract class b {
    boolean mAbandoned;
    boolean mContentChanged;
    Context mContext;
    int mId;
    InterfaceC0212b mListener;
    a mOnLoadCanceledListener;
    boolean mProcessingChange;
    boolean mReset;
    boolean mStarted;

    public interface a {
    }

    /* renamed from: androidx.loader.content.b$b, reason: collision with other inner class name */
    public interface InterfaceC0212b {
        void a(b r1, Object r2);
    }

    public b(Context r3) {
        this.mStarted = false;
        this.mAbandoned = false;
        this.mReset = true;
        this.mContentChanged = false;
        this.mProcessingChange = false;
        this.mContext = r3.getApplicationContext();
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public String dataToString(Object r3) {
        StringBuilder r02 = new StringBuilder(64);
        androidx.core.util.b.a(r3, r02);
        r02.append("}");
        return r02.toString();
    }

    public void deliverCancellation() {
    }

    public void deliverResult(Object r2) {
        InterfaceC0212b r02 = this.mListener;
        if (r02 == null) goto L6;
        r02.a(this, r2);
        return;
    }

    public void dump(String r1, FileDescriptor r2, PrintWriter r3, String[] r4) {
        r3.print(r1);
        r3.print("mId=");
        r3.print(this.mId);
        r3.print(" mListener=");
        r3.println(this.mListener);
        if (this.mStarted == false) goto L5;
    L8:
        r3.print(r1);
        r3.print("mStarted=");
        r3.print(this.mStarted);
        r3.print(" mContentChanged=");
        r3.print(this.mContentChanged);
        r3.print(" mProcessingChange=");
        r3.println(this.mProcessingChange);
    L10:
        if (this.mAbandoned == false) goto L12;
    L15:
        r3.print(r1);
        r3.print("mAbandoned=");
        r3.print(this.mAbandoned);
        r3.print(" mReset=");
        r3.println(this.mReset);
        return;
    L12:
        if (this.mReset == true) goto L15;
        return;
    L5:
        if (this.mContentChanged == true) goto L8;
        if (this.mProcessingChange == false) goto L10;
        goto L8
    }

    public void forceLoad() {
        onForceLoad();
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public void onAbandon() {
    }

    public abstract boolean onCancelLoad();

    public void onContentChanged() {
        if (this.mStarted == false) goto L6;
        forceLoad();
        return;
    L6:
        this.mContentChanged = true;
    }

    public void onForceLoad() {
    }

    public void onReset() {
    }

    public abstract void onStartLoading();

    public void onStopLoading() {
    }

    public void registerListener(int r2, InterfaceC0212b r3) {
        if (this.mListener != null) goto L7;
        this.mListener = r3;
        this.mId = r2;
        return;
    L7:
        throw new IllegalStateException("There is already a listener registered");
    }

    public void registerOnLoadCanceledListener(a r1) {
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange == false) goto L6;
        onContentChanged();
        return;
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean r02 = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= r02;
        return r02;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder(64);
        androidx.core.util.b.a(this, r02);
        r02.append(" id=");
        r02.append(this.mId);
        r02.append("}");
        return r02.toString();
    }

    public void unregisterListener(InterfaceC0212b r2) {
        InterfaceC0212b r02 = this.mListener;
        if (r02 == null) goto L10;
        if (r02 != r2) goto L8;
        this.mListener = null;
        return;
    L8:
        throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    L10:
        throw new IllegalStateException("No listener register");
    }

    public void unregisterOnLoadCanceledListener(a r2) {
        throw new IllegalStateException("No listener register");
    }
}
