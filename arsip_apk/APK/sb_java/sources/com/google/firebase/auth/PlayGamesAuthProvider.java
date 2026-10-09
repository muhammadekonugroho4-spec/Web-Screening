package com.google.firebase.auth;

/* loaded from: classes6.dex */
public class PlayGamesAuthProvider {
    public static final String PLAY_GAMES_SIGN_IN_METHOD = "playgames.google.com";
    public static final String PROVIDER_ID = "playgames.google.com";

    private PlayGamesAuthProvider() {
    }

    public static AuthCredential getCredential(String r1) {
        return new PlayGamesAuthCredential(r1);
    }
}
