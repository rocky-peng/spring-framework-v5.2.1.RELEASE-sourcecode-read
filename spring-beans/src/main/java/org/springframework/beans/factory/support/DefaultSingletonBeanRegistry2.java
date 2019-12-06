/*
 * Copyright 2002-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.beans.factory.support;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.BeanCreationNotAllowedException;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.SingletonBeanRegistry;
import org.springframework.core.SimpleAliasRegistry;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class DefaultSingletonBeanRegistry2 extends SimpleAliasRegistry implements SingletonBeanRegistry {


	private final Map<String, Object> singletonObjects = new ConcurrentHashMap<>(256);

	private final Map<String, ObjectFactory<?>> singletonFactories = new HashMap<>(16);

	private final Map<String, Object> earlySingletonObjects = new HashMap<>(16);

	private final Set<String> registeredSingletons = new LinkedHashSet<>(256);

	private final Set<String> singletonsCurrentlyInCreation =
			Collections.newSetFromMap(new ConcurrentHashMap<>(16));

	private final Set<String> inCreationCheckExclusions =
			Collections.newSetFromMap(new ConcurrentHashMap<>(16));

	@Nullable
	private Set<Exception> suppressedExceptions;

	private boolean singletonsCurrentlyInDestruction = false;

	private final Map<String, Object> disposableBeans = new LinkedHashMap<>();




	@Override
	public void registerSingleton(String beanName, Object singletonObject) {

	}

	@Override
	public Object getSingleton(String beanName) {




		return null;
	}

	@Override
	public boolean containsSingleton(String beanName) {
		return false;



	}

	@Override
	public String[] getSingletonNames() {
		return new String[0];
	}

	@Override
	public int getSingletonCount() {
		return 0;
	}

	@Override
	public Object getSingletonMutex() {
		return null;
	}
}
