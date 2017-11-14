/**
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 * <p>
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package me.snowdrop.logging.web;

import me.snowdrop.logging.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author <a href="claprun@redhat.com">Christophe Laprun</a>
 */
@Controller
public class GreetingController {
    @Autowired
    private GreetingService service;

    @GetMapping("/greet/{name}")
    @ResponseBody
    public String greet(@PathVariable String name) {
        return service.greet(name);
    }
}
