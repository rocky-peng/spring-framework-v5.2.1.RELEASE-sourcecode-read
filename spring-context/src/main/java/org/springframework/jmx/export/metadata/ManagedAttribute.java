/*
 * Copyright 2002-2018 the original author or authors.
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

package org.springframework.jmx.export.metadata;

import org.springframework.lang.Nullable;

/**
 * Metadata that indicates to expose a given bean property as JMX attribute.
 * Only valid when used on a JavaBean getter or setter.
 *
 * @author Rob Harrop
 * @see org.springframework.jmx.export.assembler.MetadataMBeanInfoAssembler
 * @see org.springframework.jmx.export.MBeanExporter
 * @since 1.2
 */
public class ManagedAttribute extends AbstractJmxAttribute {

	/**
	 * Empty attributes.
	 */
	public static final ManagedAttribute EMPTY = new ManagedAttribute();


	@Nullable
	private Object defaultValue;

	@Nullable
	private String persistPolicy;

	private int persistPeriod = -1;

	/**
	 * Return the default value of this attribute.
	 */
	@Nullable
	public Object getDefaultValue() {
		return this.defaultValue;
	}

	/**
	 * Set the default value of this attribute.
	 */
	public void setDefaultValue(@Nullable Object defaultValue) {
		this.defaultValue = defaultValue;
	}

	@Nullable
	public String getPersistPolicy() {
		return this.persistPolicy;
	}

	public void setPersistPolicy(@Nullable String persistPolicy) {
		this.persistPolicy = persistPolicy;
	}

	public int getPersistPeriod() {
		return this.persistPeriod;
	}

	public void setPersistPeriod(int persistPeriod) {
		this.persistPeriod = persistPeriod;
	}

}
