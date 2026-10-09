package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class n extends l {
    public static final UriMatcher d = null;

    static {
        UriMatcher r02 = new UriMatcher(-1);
        d = r02;
        r02.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        r02.addURI("com.android.contacts", "contacts/lookup/*", 1);
        r02.addURI("com.android.contacts", "contacts/#/photo", 2);
        r02.addURI("com.android.contacts", "contacts/#", 3);
        r02.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        r02.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public n(ContentResolver r1, Uri r2) {
        super(r1, r2);
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.l
    public /* bridge */ /* synthetic */ void e(Object r1) {
        g((InputStream) r1);
    }

    @Override // com.bumptech.glide.load.data.l
    public /* bridge */ /* synthetic */ Object f(Uri r1, ContentResolver r2) {
        return h(r1, r2);
    }

    public void g(InputStream r1) {
        r1.close();
    }

    public InputStream h(Uri r3, ContentResolver r4) {
        InputStream r42 = i(r3, r4);
        if (r42 == null) goto L6;
        return r42;
    L6:
        throw new FileNotFoundException("InputStream is null for " + r3);
    }

    public final InputStream i(Uri r3, ContentResolver r4) {
        int r02 = d.match(r3);
        if (r02 != 1) goto L5;
    L12:
        Uri r32 = ContactsContract.Contacts.lookupContact(r4, r3);
        if (r32 == null) goto L17;
        return j(r4, r32);
    L17:
        throw new FileNotFoundException("Contact cannot be found");
    L5:
        if (r02 == 3) goto L11;
        if (r02 == 5) goto L12;
        return r4.openInputStream(r3);
    L11:
        return j(r4, r3);
    }

    public final InputStream j(ContentResolver r2, Uri r3) {
        return ContactsContract.Contacts.openContactPhotoInputStream(r2, r3, true);
    }
}
