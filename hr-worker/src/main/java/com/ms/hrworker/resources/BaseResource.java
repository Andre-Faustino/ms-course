package com.ms.hrworker.resources;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(BaseResource.BASE_PATH)
public abstract class BaseResource {
	
	public static final String BASE_PATH = "/workers";

}
