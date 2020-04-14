/*
 * Copyright 2020 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.s2.authc.model;

import org.symphonyoss.s2.canon.runtime.exception.NotAuthenticatedException;

import com.symphony.oss.models.core.canon.facade.PodAndUserId;

public interface IJwtAuthenticator
{
  PodAndUserId authenticate(String token) throws NotAuthenticatedException;
}
