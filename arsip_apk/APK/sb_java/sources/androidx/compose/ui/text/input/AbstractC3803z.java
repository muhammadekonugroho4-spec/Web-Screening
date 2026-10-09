package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;

/* renamed from: androidx.compose.ui.text.input.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3803z implements InterfaceInputConnectionC3802y {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.l f20104a;

    /* renamed from: b, reason: collision with root package name */
    public InputConnection f20105b;

    public AbstractC3803z(InputConnection r1, kotlin.jvm.functions.l r2) {
        this.f20104a = r2;
        this.f20105b = r1;
    }

    @Override // androidx.compose.ui.text.input.InterfaceInputConnectionC3802y
    public final void a() {
        InputConnection r02 = this.f20105b;
        if (r02 == null) goto L6;
        b(r02);
        this.f20105b = null;
        return;
    }

    public abstract void b(InputConnection r1);

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.beginBatchEdit();
    }

    public final InputConnection c() {
        return this.f20105b;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int r2) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.clearMetaKeyStates(r2);
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.f20105b == null) goto L6;
        a();
        this.f20104a.invoke(this);
        return;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo r2) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.commitCompletion(r2);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo r2) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.commitCorrection(r2);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence r2, int r3) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.commitText(r2, r3);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int r2, int r3) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.deleteSurroundingText(r2, r3);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.finishComposingText();
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int r2) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return 0;
    L5:
        return r02.getCursorCapsMode(r2);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest r2, int r3) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return null;
    L5:
        return r02.getExtractedText(r2, r3);
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int r2) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return null;
    L5:
        return r02.getSelectedText(r2);
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int r2, int r3) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return null;
    L5:
        return r02.getTextAfterCursor(r2, r3);
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int r2, int r3) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return null;
    L5:
        return r02.getTextBeforeCursor(r2, r3);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int r2) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.performContextMenuAction(r2);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int r2) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.performEditorAction(r2);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String r2, Bundle r3) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.performPrivateCommand(r2, r3);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean r2) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.reportFullscreenMode(r2);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int r2) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.requestCursorUpdates(r2);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent r2) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.sendKeyEvent(r2);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int r2, int r3) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.setComposingRegion(r2, r3);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence r2, int r3) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.setComposingText(r2, r3);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int r2, int r3) {
        InputConnection r02 = this.f20105b;
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.setSelection(r2, r3);
    }
}
