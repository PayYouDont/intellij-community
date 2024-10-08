// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.ui.jcef;

import com.intellij.openapi.util.text.StringUtil;
import org.cef.network.CefCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Date;
import java.util.Objects;

/**
 * A wrapper over {@link CefCookie}.
 *
 * @author Aleksey.Rostovskiy
 */
public final class JBCefCookie {
  private final CefCookie myCefCookie;

  public JBCefCookie(CefCookie cefCookie) {
    myCefCookie = cefCookie;
  }

  public JBCefCookie(@NotNull String name,
                     @NotNull String value,
                     @NotNull String domain,
                     @NotNull String path,
                     boolean secure,
                     boolean httponly,
                     @Nullable Date creation,
                     @Nullable Date lastAccess,
                     boolean hasExpires,
                     @Nullable Date expires) {
    this(new CefCookie(name, value, domain, path, secure, httponly, creation, lastAccess, hasExpires, expires));
  }

  @SuppressWarnings("unused")
  public JBCefCookie(@NotNull String name,
                     @NotNull String value,
                     @NotNull String domain,
                     @NotNull String path,
                     boolean secure,
                     boolean httponly) {
    this(name, value, domain, path, secure, httponly, null, null, false, null);
  }

  public @NotNull CefCookie getCefCookie() {
    return myCefCookie;
  }

  public @NotNull String getName() {
    return myCefCookie.name;
  }

  public @NotNull String getValue() {
    return myCefCookie.value;
  }

  public @NotNull String getDomain() {
    return myCefCookie.domain;
  }

  public @NotNull String getPath() {
    return myCefCookie.path;
  }

  public boolean isSecure() {
    return myCefCookie.secure;
  }

  public boolean isHttpOnly() {
    return myCefCookie.httponly;
  }

  public @Nullable Date getCreation() {
    return myCefCookie.creation;
  }

  public @Nullable Date getLastAccess() {
    return myCefCookie.lastAccess;
  }

  @SuppressWarnings("unused")
  public boolean hasExpires() {
    return myCefCookie.hasExpires;
  }

  public @Nullable Date getExpires() {
    return myCefCookie.expires;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JBCefCookie cookie = (JBCefCookie)o;
    return getName().equals(cookie.getName()) &&
           getValue().equals(cookie.getValue()) &&
           compareDomains(getDomain(), cookie.getDomain()) &&
           getPath().equals(cookie.getPath()) &&
           isSecure() == cookie.isSecure() &&
           isHttpOnly() == cookie.isHttpOnly();
  }

  private static boolean compareDomains(@Nullable String d1, @Nullable String d2) {
    if (d1 == null && d2 == null) return true;
    if (d1 == null || d2 == null) return false;
    d1 = StringUtil.trimStart(d1, ".");
    d1 = StringUtil.trimStart(d1, "www.");
    d2 = StringUtil.trimStart(d2, ".");
    d2 = StringUtil.trimStart(d2, "www.");
    return d1.equals(d2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getValue(), getDomain(), getPath(), isSecure(), isHttpOnly());
  }
}
