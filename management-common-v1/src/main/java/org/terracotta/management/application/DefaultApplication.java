/*
 * All content copyright (c) 2003-2012 Terracotta, Inc., except as may otherwise be noted in a separate copyright
 * notice. All rights reserved.
 */
package org.terracotta.management.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.terracotta.management.resource.services.AgentsResourceServiceImpl;

/**
 * A default {@link Application} subclass that adds the commonly used
 * resources and providers.
 * @author Ludovic Orban
 */
public class DefaultApplication extends Application {

  /**
   * Get a default set of resource and provider classes.
   * @return a default set of classes.
   */
  @Override
  public Set<Class<?>> getClasses() {
    return new HashSet<Class<?>>() {{
        add(DefaultExceptionMapper.class);
        add(ResourceRuntimeExceptionMapper.class);
        add(WebApplicationExceptionMapper.class);
        add(AgentsResourceServiceImpl.class);
    }};
  }

}