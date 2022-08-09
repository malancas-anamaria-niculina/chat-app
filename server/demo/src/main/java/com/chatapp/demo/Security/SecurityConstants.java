package com.chatapp.demo.Security;

import io.github.cdimascio.dotenv.Dotenv;

public class SecurityConstants {
    private static Dotenv dotenv = Dotenv.load();
    public static final String SIGN_UP_URL = "/login/record";
    public static final String KEY = dotenv.get("KEY");
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_NAME = "Authorization";
    public static final Long EXPIRATION_TIME = Long.parseLong(dotenv.get("EXPIRATION_TIME"));
}
