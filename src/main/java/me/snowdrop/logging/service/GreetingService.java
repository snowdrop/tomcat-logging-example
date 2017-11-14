/**
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 * <p>
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package me.snowdrop.logging.service;

import org.springframework.stereotype.Component;

/**
 * @author <a href="claprun@redhat.com">Christophe Laprun</a>
 */
@Component
public class GreetingService {
    public String greet(String name) {
        return "Hello, " + (name != null ? name : "World") + "!";
    }
}
